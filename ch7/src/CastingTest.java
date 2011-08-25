class Child extends Parent {
	int su = 20;
	void pr() {
		System.out.println(su);
	}
	void c() {
		System.out.println("Child클래스");
	}
}

class Parent {
	int su = 10;
	void pr() {
		System.out.println(su);
	}
	void p() {
		System.out.println("Parent클래스");
	}
}

public class CastingTest {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		System.out.println(p1.su);
//		p1.pr();
//		p1.p();
//		Child c1 = (Child)p1;
//		c1.c();
		Parent p2 = new Child();
		System.out.println(p2.su);
		p2.pr();
		p2.p();
		Child c2 = (Child)p2;
		c2.c();
		((Child)p2).c();
	}
}
