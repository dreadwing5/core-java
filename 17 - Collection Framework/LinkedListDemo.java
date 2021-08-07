import java.util.*;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<Integer> al1 = new LinkedList<>();

        LinkedList<Integer> al2 = new LinkedList<>(List.of(50, 60, 70, 80, 90));
        al1.add(10);
        al1.add(0, 5);

        al1.addAll(1, al2);
        al1.add(5, 70);
        al1.addFirst(100);
        al1.addLast(200);
        // al1.removeFirst();
        // al1.removeLast();
        // System.out.println(al1.get(0));
        System.out.println(al1);
    }

}
