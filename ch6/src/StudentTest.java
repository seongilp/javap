public class StudentTest {
	public static void main(String[] args) {		
		Student s1 = new Student(args[0], args[1], Integer.parseInt(args[2]));
		s1.refundFee = Integer.parseInt(args[2]);
		System.out.println("�̸� : " + s1.name);
		System.out.println("�Ҽ� : " + s1.company);
		System.out.println("������ : " + s1.course);
		System.out.println("������ : " + s1.courseFee);
		System.out.println("- ȯ�ޱ��� ����մϴ�.");
		if(s1.course.equals("�ڹ����α׷���")) {
			System.out.print("�������� " + args[1] + "�̸� ");
			System.out.println("�Է��� ������ "+(s1.refundFee*0.25+s1.addFee)+"");
		}
		else if(s1.course.equals("JDBC���α׷���")) {
			System.out.print("�������� " + args[1] + "�̸� ");
			System.out.println("�Է��� ������ "+(s1.refundFee*0.2+s1.addFee)+"");
			
		}
		else if(s1.course.equals("JSP���α׷���")) {
			System.out.print("�������� " + args[1] + "�̸� ");
			System.out.println("�Է��� ������ "+(s1.refundFee*0.15+s1.addFee)+"");			
		}
		else {
			System.out.println("�߸� �ԷµǾ����ϴ�.");
		}
	}
}

class Student {
	Student(String name, String course, int courseFee) {
		this.name 		= name;
		this.course 	= course;
		this.courseFee 	= courseFee;		
	}
	String name;
	static String company = "�ＺSDS";
	String course;
	int	courseFee;	
	int	refundFee;
	final static int addFee = 5000;	
}