

public class StaticDemo {
	public static void main(String[] args) {
		Employee2 kang = new Employee2();
		Employee2 kim = new Employee2();
		Employee2 park = new Employee2();
		Employee2 lee = new Employee2();
	}
}

class Employee2 {
	String	name;
	int		age;
	static int empNum = 0;
	public Employee2() {
		System.out.println("사원 객체 생성 " + ++empNum);
	}
}