import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("정수2개를 입력하세요  : ");
		int result1 = key.nextInt();
		int result2 = key.nextInt();
		int add = result1 + result2;
		System.out.println(add);
		System.out.println("한글 문자열을 입력 : ");
		String result3 = key.next();
		System.out.println(result3);
	}
}