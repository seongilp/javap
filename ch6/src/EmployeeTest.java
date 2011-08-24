public class EmployeeTest {
	public static void main(String[] args) {
		Employee hong = new Employee("홍길동",20);
		//System.out.println("한 사원의 이름은  " + hong.name + "이고, 나이는 " + hong.age + "입니다");
		
		Employee me = new Employee("장길산",30);
		//System.out.println(me.name + " " + me.age);
		me.print();
			
	}
}

class Employee {
	void print() {
		System.out.println("이름 : " + name + ", 나이 : " + age );
	}
	Employee(String name, int age) {
		this.name = name;
		this.age = age;
		//System.out.println("생성자호출");
	}
	Employee(String name) {
		this.name = name;
		age = -1;
	}
	Employee() {
		this("none",-1);
		//age = -1;
	}
	String 	name;
	int 	number;
	int 	age;
	String 	title;
	String 	dept;
	String 	grade;
}
