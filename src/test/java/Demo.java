import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class Demo {

    public static void main(String args[]) {
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("JJ", "12A");
        hashtable.put("HH", "15B");
        hashtable.put("KK", "IJ9");
        hashtable.put("YU", "HJ6");
        // hashtable.put(null,"HJ6")
        // hashtable.put("YU2",null);
        hashtable.put("YU", "HJ7");
        for (String key : hashtable.keySet())
            System.out.println(key + " " + hashtable.get(key));
        System.out.println("-------------------------------");
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("JJ", "12A");
        hashMap.put("HH", "15B");
        hashMap.put("KK", "IJ9");
        hashMap.put("YU", "HJ6");
        hashMap.put("YU1", "HJ6");
        hashMap.put("YU2", null);
        hashMap.put(null, "HJ6");
        hashMap.put(null, "HJ9");
        for (String key : hashMap.keySet())
            System.out.println(key + " " + hashMap.get(key));
        //System.out.println(StringUtils.deleteWhitespace("Hello I am here   ,"));
        String str = "malayalam";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    count++;
            }
            if (count == 0) {
                System.out.println(str.charAt(i));
                break;
            }
        }


    }
}
