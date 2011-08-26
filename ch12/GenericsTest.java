import java.util.Vector;

public class GenericsTest {
public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "100";
        Integer i1 = 100;;
        
        Vector<String> v = new Vector<String>();
        v.addElement(s1);
        v.addElement(s2);
       // v.addElement(i1);
   
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i).toUpperCase());
        }

        Vector<? extends Person> persons ;

        Vector <Person> p = new Vector<Person> ();
        p.add(new Person("장길산"));
        p.add(new Person("홍길동"));
        System.out.println("-------------------------");
        persons = p;
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        } 
        
        Vector <Employee> e = new Vector<Employee> ();
        e.add(new Employee("유관순", 100));
        e.add(new Employee("정약용", 200)); 
        System.out.println("-------------------------");
        persons = e;
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }        
        
        Vector <Student> s = new Vector<Student> ();
        s.add(new Student("문재신", 1000));
        s.add(new Student("이선준", 2000));       
        System.out.println("-------------------------");
        persons = s;
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }
        
}
}

class Person{
	String name;
	Person(String name){
		this.name = name;
	}
    public String toString() {
    	return "name : " + name;
    }
}

class Employee extends Person{
	int empId;
	
    public Employee(String name, int empId) {
		super(name);
		this.empId = empId;
	}
	public String toString() {
    	return "empId : " + empId + " name : " + name;
    }	
}

class Student extends Person{
	int stuId; 
	public Student(String name, int stuId) {
		super(name);
		this.stuId = stuId;
	}
	public String toString() {
    	return "stuId : " + stuId + " name : " + name;
    }
}

