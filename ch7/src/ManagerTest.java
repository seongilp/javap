public class ManagerTest {
	public static void main(String[] args) {
		Manager lee = new Manager();
		lee.name = "�̲ҵ�";
		lee.jobOfManage = "�λ� ����";
		//System.out.println(lee.name + "�� " + lee.jobOfManage + "����Դϴ�.");
		//System.out.println(number);
		lee.print();
		lee.test();
	}
}

class Manager extends Employee {
	int number = 200;
	String jobOfManage;
	String boss;
	String[] subordinate;
	void print() {
		System.out.println(name + " : " + age);
		System.out.println(jobOfManage);
	}
	void test() {
		int number = 300;
		System.out.println(number);
		System.out.println(this.number);
		System.out.println(super.number);
	}
}

class Employee {
	String name;
	int number = 100;
	int age;
	String title;
	String dept;
	String grade;
	void print() {
		System.out.println(name + " : " + age);
	}
}