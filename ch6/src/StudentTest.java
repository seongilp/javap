public class StudentTest {
	public static void main(String[] args) {		
		Student s1 = new Student(args[0], args[1], Integer.parseInt(args[2]));
		s1.refundFee = Integer.parseInt(args[2]);
		System.out.println("이름 : " + s1.name);
		System.out.println("소속 : " + s1.company);
		System.out.println("과정명 : " + s1.course);
		System.out.println("교육비 : " + s1.courseFee);
		System.out.println("- 환급금을 계산합니다.");
		if(s1.course.equals("자바프로그래밍")) {
			System.out.print("과졍명이 " + args[1] + "이면 ");
			System.out.println("입력한 교육비 "+(s1.refundFee*0.25+s1.addFee)+"");
		}
		else if(s1.course.equals("JDBC프로그래밍")) {
			System.out.print("과졍명이 " + args[1] + "이면 ");
			System.out.println("입력한 교육비 "+(s1.refundFee*0.2+s1.addFee)+"");
			
		}
		else if(s1.course.equals("JSP프로그래밍")) {
			System.out.print("과졍명이 " + args[1] + "이면 ");
			System.out.println("입력한 교육비 "+(s1.refundFee*0.15+s1.addFee)+"");			
		}
		else {
			System.out.println("잘못 입력되었습니다.");
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
	static String company = "삼성SDS";
	String course;
	int	courseFee;	
	int	refundFee;
	final static int addFee = 5000;	
}
