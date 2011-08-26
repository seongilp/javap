// ������ ������ Ŭ����
class Producer extends Thread{
	private Buffer blank;
	
	public Producer(Buffer blank){
		this.blank = blank;
	}
	public void run(){
		for(int i = 0; i < 10; i++){
			// ������ ������� put() �޼��带 ȣ���Ѵ�.
			blank.put(i);
			System.out.println("������: ���� "+ i);
			try{
				sleep((int)Math.random() * 100);
			}catch(InterruptedException e) {}
		}
	}
}
// �Һ��� ������ Ŭ����
class Consumer extends Thread{
	private Buffer blank;
	
	public Consumer(Buffer blank){
		this.blank = blank;
	}
	public void run(){
		int value = 0;
		for(int i = 0; i < 10; i++){
			// �Һ��� ������� get() �޼��带 ȣ���Ѵ�.
			value = blank.get();
			System.out.println("�Һ���: �Һ� "+ value);
		}
	}
}
//Buffer Ŭ����, ������, �����Ϳ� ���õ� ó���� ����Ѵ�.
class Buffer{
	private int contents;
	private boolean available = false;

	//���ۿ������� �����͸� �������� �޼���, ����ȭ�Ѵ�.
	public synchronized int get(){
		while(available == false){
			try{
				wait();
			} catch(InterruptedException e){}
		}
		available = false;
		notifyAll();
		return contents;
	}
	//���۷� �����͸� �����ϴ� �޼���, ����ȭ�Ѵ�.
	public synchronized void put(int value){
		while(available == true){
			try{
				wait();
			} catch(InterruptedException e){}
		}
		contents = value;
		available = true;
		notifyAll();
	}
}
//�����ڿ� �Һ��� �����带 �⵿��Ű�� Ŭ����
public class ProducerConsumer{
	public static void main(String args[]){
		Buffer ch = new Buffer();
		Producer p = new Producer(ch);
		Consumer c = new Consumer(ch);
		p.start();
		c.start();
	}
}