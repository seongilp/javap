// 생산자 스레드 클래스
class Producer extends Thread{
	private MailBox blank;
	private String[] msgList;
	
	public Producer(MailBox blank, String[] msgList){
		this.blank = blank;
		this.msgList = msgList;
	}
	public void run(){
		for(int i = 0; i < msgList.length; i++){
			// 생산자 스레드는 storeMessage() 메서드를 호출한다.
			blank.storeMessage(msgList[i]);
			//System.out.println("메세지 전달: 전달된 메세지는 \""+ msgList[i] +"\"입니다.");
		//	try{
			//	sleep((int)Math.random() * 100);
			//}catch(InterruptedException e) {}
		}
	}
}
// 소비자 스레드 클래스
class Consumer extends Thread{
	private MailBox blank;
	private int count;
	private String s;
	
	public Consumer(MailBox blank, int count){
		this.blank = blank;
		this.count = count;
	}
	public void run(){
		for(int i = 0; i < count; i++){
			// 소비자 스레드는 retrieveMessage() 메서드를 호출한다.
			s = blank.retrieveMessage();
			//System.out.println("메세지 확인: 확인된 메세지는 \""+ s +"\"입니다.");
		}
	}
}
//MailBox 클래스, 메세지를 저장하고 처리하는 역할을 담당한다.
class MailBox{
	private String message;
	private boolean request;
	public synchronized void storeMessage(String message) {
	  while (request == true) {
        	try {
                	wait(); // synchronized lock 을 해제한다.
              	} catch (InterruptedException e) { }
         }
         request = true;
         this.message = message;
         notify(); // wait 상태에 들어가 있는 다른 스레드를 깨운다.
         System.out.println("메세지 전달: 전달된 메세지는 \""+ message +"\"입니다.");
	}

	public synchronized String retrieveMessage() {
	   while (request == false) {
           	try {
        		wait();
            } catch (InterruptedException e) { }
          }
        request = false;
        notify();
        System.out.println("메세지 확인: 확인된 메세지는 \""+ message +"\"입니다.");
        return message;
	} 
}
//생산자와 소비자 스레드를 기동시키는 클래스
public class MailBoxTest{
	
	public static void main(String args[]){
		String messageList[] = new String[args.length];
		for(int i = 0;i<args.length; i++)
			messageList[i] = args[i];
			
		MailBox mb = new MailBox();
		Producer p = new Producer(mb, messageList);
		Consumer c = new Consumer(mb, messageList.length);
		p.start();
		c.start();
	}
}