class Sam {
	int a = 10;
}

class Expr {
	void add(int i) {
		System.out.println(i++);
	}
	void add(Sam s) {
		System.out.println(s.a++);
	}
}
public class ExprTest {
	public static void main(String[] args) {
		Expr e = new Expr();
		Sam t = new Sam();
		e.add(t);
		System.out.println(t.a);
//		int j = 10;
//		e.add(j);
//		System.out.println("e.add(j) ȣ�� ����  j�� " + j);
		
	}
}
