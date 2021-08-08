import java.security.KeyStore.Entry;
import java.util.*;

class MapDemo {

    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>(Map.of(0, "A", 1, "B", 2, "C", 3, "D"));

        map.put(5, "E");
        map.put(4, "F");

        System.out.println(map.get(5));
        System.out.println(map);

    }
}