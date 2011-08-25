class F1 {
	double d1;
	F1(String s) {
		//super(); --> Object()
		System.out.println("클래스 F1의 생성자 수행");
		d1 = 10*10;
	}
	public F1(double d1) {
		//super();
		this.d1 = d1;
	}
}

class F2 extends F1 {
	double d2;
	F2() {
		super("Hello");
		System.out.println("클래스 F2의 생성자 수행");
		d2 = 10 * 10 * 10;
	}
}

public class FTest {
	public static void main(String[] args) {
		F2 f2 = new F2();
		System.out.println(f2.d1);
		System.out.println(f2.d2);
	}
}
