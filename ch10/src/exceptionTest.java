public class exceptionTest {
	public static void main(String[] args) {
		try {
			int i = Integer.parseInt(args[0]);
			int j = Integer.parseInt(args[1]);
			System.out.println(i/j);
		} catch(ArithmeticException e) {
			System.out.println("0�� �ƴ� ���� �Ϸ����ּ���");
		}
		finally {
			System.out.println("�׻� ��µ˴ϴ�");
		}
		System.out.println("�Ϸ�");
	}
}