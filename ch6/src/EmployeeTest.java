public class EmployeeTest {
	public static void main(String[] args) {
		Employee hong = new Employee("ȫ�浿",20);
		//System.out.println("�� ����� �̸���  " + hong.name + "�̰�, ���̴� " + hong.age + "�Դϴ�");
		
		Employee me = new Employee("����",30);
		//System.out.println(me.name + " " + me.age);
		me.print();
			
	}
}

class Employee {
	void print() {
		System.out.println("�̸� : " + name + ", ���� : " + age );
	}
	Employee(String name, int age) {
		this.name = name;
		this.age = age;
		//System.out.println("������ȣ��");
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
