import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("����2���� �Է��ϼ���  : ");
		int result1 = key.nextInt();
		int result2 = key.nextInt();
		int add = result1 + result2;
		System.out.println(add);
		System.out.println("�ѱ� ���ڿ��� �Է� : ");
		String result3 = key.next();
		System.out.println(result3);
	}
}