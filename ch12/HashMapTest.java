import java.util.HashMap;
import java.util.Date;

public class HashMapTest {
public static void main(String[] args) {
        HashMap map = new HashMap();
        
        map.put("title", "�ڹ����α׷���");
        map.put("name", "���ڹ�");
        map.put("publish", "�ＺSDSķ�۽�");
        map.put("date", new  Date());
        
        System.out.println("Title:" + map.get("title").toString());
        System.out.println("Name:" + map.get("name").toString());
        System.out.println("Published by:" + map.get("publish").toString());
        System.out.println("Date:" + map.get("date").toString());
        
        map.remove("date");
        
        map.put("title", "JSP���α׷���");
        
        System.out.println("=====Date �׸� ���� ���� =====");      
        System.out.println("Title:" + map.get("title").toString());
        System.out.println("Name:" + map.get("name").toString());
        System.out.println("Published by:" + map.get("publish").toString());
      //  System.out.println("Date:" + map.get("date").toString());  
}
}

