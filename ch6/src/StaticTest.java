class Test {
	static int i = 10;
	int j = 20;
	static void m1() {
		System.out.println(i++);
		//System.out.println(j++);
	}
	void m2() {
		System.out.println(i++);
		System.out.println(j++);		
	}
}

public class StaticTest {
	public static void main(String[] args) {
		Test.m1();
		//Test.m2();
		Test o1 = new Test();
		Test o2 = new Test();
		o1.m1();
		o1.m2();
		o2.m1();
		o2.m2();
	}
}
