import java.util.Calendar;
import java.util.Formatter;

public class FormatterTest {
	public static void main(String[] args) {
		StringBuffer sb  = new StringBuffer();
		Formatter f = new Formatter(sb);
		Calendar c = Calendar.getInstance();
		int i  = 10;
		int j  = 20;
		int k = i + j; 
		String s = "���� ����Դϴ�.";

		f.format("%s%n",s);
		f.format
		("%d �� %d �� ���ϸ� %d �� �˴ϴ�. %n", i, j, k);
		f.format
		 ("���� �ð��� %tk �� %tM ��  %tS ���Դϴ�. %n ",
		 c, c, c);
		System.out.println(f);
	}
}

