public class throwsTest {
	public static void main(String[] args) {
		Test t = new Test();
//		t.mb();
//		t.mc();
		try {
			t.md();
		} catch(ClassNotFoundException e) {
			System.out.println("���� ����Ŭ ����̹�x");
		}
		
	}
}

class Test {
	void ma(int i) throws ArithmeticException{
		System.out.println(10/i);
	}
	void mb() {
		try {
			ma(0);
		} catch(ArithmeticException e) {
			System.out.println("dd");
		}
		
	}
	void mc() {
		ma(0);
	}
	void md() throws ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
	}
}
