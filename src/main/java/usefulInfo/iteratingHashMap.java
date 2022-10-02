package usefulInfo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class iteratingHashMap {
    public static void main(String[] args) {

        //Taken from this link: https://stackoverflow.com/questions/1066589/iterate-through-a-hashmap
        Map<Integer, Integer> map = new HashMap<>();


        // **** Method 1 ***********
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }


        // **** Method 2 ***********
        // Iterating over keys only
        for (Integer key : map.keySet()) {
            System.out.println("Key = " + key);
        }

        // Iterating over values only
        for (Integer value : map.values()) {
            System.out.println("Value = " + value);
        }

        // **** Method 3 ***********
        Iterator<Map.Entry<Integer, Integer>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Integer, Integer> entry = entries.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

        // **** Method 3 ***********
//        Iterator entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry entry = (Map.Entry) entries.next();
            Integer key = (Integer)entry.getKey();
            Integer value = (Integer)entry.getValue();
            System.out.println("Key = " + key + ", Value = " + value);
        }
    }
}
