public class TwoThreadTest1 {
	public static void main(String[] args) {
		SimpleThread a,b;
		a = new SimpleThread("one");
		b = new SimpleThread("two");
		a.start();
		b.start();
		System.out.println("Main end!!");
	}
}

class SimpleThread extends Thread {
	String str;

	public SimpleThread(String str) {
		this.str = str;
	}
	
	public void run() {
		for(int i = 0; i<10 ; i++) {
			System.out.println(i + " " + str);
			try {
				sleep((int)Math.random()*1000);
			} catch(InterruptedException e) {}
		}
		System.out.println("DONE" + str);
	}
}