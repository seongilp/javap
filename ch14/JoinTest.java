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
			AB a=new AB();//Runnable ���� ��ü ����
			Thread t=new Thread(a);//Thread��ü����
			t.start();//t:���,main:����
			t.join();//main:�Ͻ����� t:����
			int j=a.i;
			System.out.println(j);//10
		}catch(Exception e){}
		//main:����  t:����
	}
}
