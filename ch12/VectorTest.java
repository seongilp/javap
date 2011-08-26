import java.util.Vector;

class Employee{
	String name;
	int id;
	double salary;
	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	@Override
	public String toString() {
      return 
      name + " : " + id + " : " + salary;
	}
	
}
public class VectorTest {
public static void main(String[] args) {
 Vector v = new Vector();//10...10
 v.add(10);
 v.add(3.14);
 v.add("java");
 v.add(new Employee("¿Ã¿⁄πŸ", 100, 99000.55));
 v.set(1, "jsp");
 v.remove("java");
 for(int i = 0; i < v.size(); i++){
	 System.out.println
	 (v.elementAt(i));//overriding
 }
}
}
