import static java.lang.Math.PI;

class Person {
	String 	name;
	int 	age;
	static String 	nation  = "���ѹα�";
}

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "���ڹ�";
		p1.age = 20;
		System.out.println("p1 ���� ��ü �̸��� " +p1.name+"���̴�"+p1.age+"������"+Person.nation);
		Person p2 = new Person();
		p2.name = "�ڻ�";
		p2.age = 28;
		System.out.println("p2 ���� ��ü �̸��� " +p2.name+"���̴�"+p2.age+"������"+p2.nation);
		System.out.println(Math.PI);
	}
}