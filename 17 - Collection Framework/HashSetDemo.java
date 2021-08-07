import java.util.*;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<Integer>();

        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10);

        System.out.println(hs);

        HashMap<String, Integer> map = new HashMap<>();

        // Adding elements to the Map
        // using standard add() method
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);

        // Print size and content of the Map
        System.out.println("Size of map is:- " + map.size());

        // Printing elements in object of Map
        System.out.println(map);
    }
}
