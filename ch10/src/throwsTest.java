public class throwsTest {
	public static void main(String[] args) {
		Test t = new Test();
//		t.mb();
//		t.mc();
		try {
			t.md();
		} catch(ClassNotFoundException e) {
			System.out.println("현재 오라클 드라이버x");
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
