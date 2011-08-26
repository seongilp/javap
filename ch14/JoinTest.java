class AB implements Runnable{
	int i=0;
	public void run(){
		try{
			Thread.sleep(5000);
			i=10;
		}catch(InterruptedException e){}
	}
}
public class JoinTest{
	public static void main(String args[]){
			try{
			AB a=new AB();//Runnable 하위 객체 생성
			Thread t=new Thread(a);//Thread객체생성
			t.start();//t:대기,main:실행
			t.join();//main:일시중지 t:실행
			int j=a.i;
			System.out.println(j);//10
		}catch(Exception e){}
		//main:종료  t:실행
	}
}
