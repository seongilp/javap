import java.util.HashMap;
import java.util.Date;

public class HashMapTest {
public static void main(String[] args) {
        HashMap map = new HashMap();
        
        map.put("title", "자바프로그래밍");
        map.put("name", "이자바");
        map.put("publish", "삼성SDS캠퍼스");
        map.put("date", new  Date());
        
        System.out.println("Title:" + map.get("title").toString());
        System.out.println("Name:" + map.get("name").toString());
        System.out.println("Published by:" + map.get("publish").toString());
        System.out.println("Date:" + map.get("date").toString());
        
        map.remove("date");
        
        map.put("title", "JSP프로그래밍");
        
        System.out.println("=====Date 항목 삭제 이후 =====");      
        System.out.println("Title:" + map.get("title").toString());
        System.out.println("Name:" + map.get("name").toString());
        System.out.println("Published by:" + map.get("publish").toString());
      //  System.out.println("Date:" + map.get("date").toString());  
}
}

