public class PriorityTest {
	public static void main (String args[]) {
		SimpleThread a, b;
		a = new SimpleThread("one");
		b = new SimpleThread("two");
  a.setPriority(Thread.MIN_PRIORITY);
  b.setPriority(Thread.MAX_PRIORITY);
  a.start(); 
		b.start();
		System.out.println("main end !!");
	}
}
 	
class SimpleThread extends Thread {
	String str;
	SimpleThread(String str) {
		this.str = str;
 	}
    // 스레드의 기능을 구현하는 메소드이다.
	public void run() {
 		for (int i = 0; i < 10; i++) {
			System.out.println(i + " " + str + " [우선순위: " + getPriority() + "]");
 		}
		System.out.println("DONE" + str);
   	}
}