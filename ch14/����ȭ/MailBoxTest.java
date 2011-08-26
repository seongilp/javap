// ������ ������ Ŭ����
class Producer extends Thread{
	private MailBox blank;
	private String[] msgList;
	
	public Producer(MailBox blank, String[] msgList){
		this.blank = blank;
		this.msgList = msgList;
	}
	public void run(){
		for(int i = 0; i < msgList.length; i++){
			// ������ ������� storeMessage() �޼��带 ȣ���Ѵ�.
			blank.storeMessage(msgList[i]);
			//System.out.println("�޼��� ����: ���޵� �޼����� \""+ msgList[i] +"\"�Դϴ�.");
		//	try{
			//	sleep((int)Math.random() * 100);
			//}catch(InterruptedException e) {}
		}
	}
}
// �Һ��� ������ Ŭ����
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
			// �Һ��� ������� retrieveMessage() �޼��带 ȣ���Ѵ�.
			s = blank.retrieveMessage();
			//System.out.println("�޼��� Ȯ��: Ȯ�ε� �޼����� \""+ s +"\"�Դϴ�.");
		}
	}
}
//MailBox Ŭ����, �޼����� �����ϰ� ó���ϴ� ������ ����Ѵ�.
class MailBox{
	private String message;
	private boolean request;
	public synchronized void storeMessage(String message) {
	  while (request == true) {
        	try {
                	wait(); // synchronized lock �� �����Ѵ�.
              	} catch (InterruptedException e) { }
         }
         request = true;
         this.message = message;
         notify(); // wait ���¿� �� �ִ� �ٸ� �����带 �����.
         System.out.println("�޼��� ����: ���޵� �޼����� \""+ message +"\"�Դϴ�.");
	}

	public synchronized String retrieveMessage() {
	   while (request == false) {
           	try {
        		wait();
            } catch (InterruptedException e) { }
          }
        request = false;
        notify();
        System.out.println("�޼��� Ȯ��: Ȯ�ε� �޼����� \""+ message +"\"�Դϴ�.");
        return message;
	} 
}
//�����ڿ� �Һ��� �����带 �⵿��Ű�� Ŭ����
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