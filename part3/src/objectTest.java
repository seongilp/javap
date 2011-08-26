public class objectTest {
	public static void main(String[] args) {
		MyObject o1 = new MyObject("java");
		MyObject o2 = new MyObject("java");
		System.out.println(o1);
		//System.out.println(o1.toString());
		System.out.println(o2);
		//System.out.println(o2.toString());
		if(o1==o2)
			System.out.println("==���� true");
		if(o1.equals(o2))
			System.out.println("equals ���� true");
	}
}

class MyObject {
	String s;
	MyObject(String s) {
		this.s = s;
	}
	@Override
	public String toString() {
		return s;
	}
	// please look at below code
	public boolean equals(Object obj) {
		if(obj instanceof MyObject) {
			boolean result1 = s.equals(((MyObject)obj).s);
			return result1;
		}
		else {
			return false;
		}
	}
}
