import static java.lang.Math.PI;

class Person {
	String 	name;
	int 	age;
	static String 	nation  = "대한민국";
}

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "이자바";
		p1.age = 20;
		System.out.println("p1 참고 객체 이름은 " +p1.name+"나이는"+p1.age+"국적은"+Person.nation);
		Person p2 = new Person();
		p2.name = "박상성";
		p2.age = 28;
		System.out.println("p2 참고 객체 이름은 " +p2.name+"나이는"+p2.age+"국적은"+p2.nation);
		System.out.println(Math.PI);
	}
}
