import java.util.*;
public class DateClassTest {	
	public static void main(String[] args) {
		Date d = new Date();
               String s = d.toLocaleString();
		System.out.println("현재 시각 : " + s);
		Date d2 = new Date(1078697968786L);
               String s2 = d2.toLocaleString();
		System.out.println("설정된 시각 : " + s2);
	}
}	
