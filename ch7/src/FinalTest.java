public class FinalTest {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		a.ma();
		b.ma();
		b.mb();
		
	}
}

final class A {
	int i = 10;
	void ma() {
		System.out.println("A");
	}
}


class B {
	int j = 20;
	void mb() {
		A a1 = new A();
		a1.ma();		System.out.println("B");
	}
	void ma() {
		System.out.println("A의 하위클래스");
	}
}