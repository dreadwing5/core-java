import java.util.*;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>(5, .75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                return size() > 5;
            }
        };

        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(9, "Nine");

        String s = map.get(2);
        s = map.get(5);
        s = map.get(9);

        map.put(8, "Eight");

        map.forEach((k, v) -> System.out.println(k + " " + v));
    }

}
