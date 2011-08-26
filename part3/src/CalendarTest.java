import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		int year 	= today.get(Calendar.YEAR);
		int month 	= today.get(Calendar.MONTH)+1;
		int day 	= today.get(Calendar.DAY_OF_MONTH);
		today.set(Calendar.DAY_OF_MONTH, day+3);
		int weekday = today.get(Calendar.DAY_OF_WEEK);
		int hour	= today.get(Calendar.HOUR);
		int min		= today.get(Calendar.MINUTE);
		int sec 	= today.get(Calendar.SECOND);
		System.out.println
		("오늘은  " + year + "년  " + month + "월 " + day + "일 "
		+ hour + "시 " + min + "분  " + sec + "초");
	}
}
