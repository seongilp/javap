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
		String s = "연산 결과입니다.";

		f.format("%s%n",s);
		f.format
		("%d 과 %d 을 더하면 %d 이 됩니다. %n", i, j, k);
		f.format
		 ("현재 시간은 %tk 시 %tM 분  %tS 초입니다. %n ",
		 c, c, c);
		System.out.println(f);
	}
}

