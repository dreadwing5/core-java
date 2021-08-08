import java.util.*;

class My implements Comparator<Integer> {
    public int compare(Integer x, Integer y) {
        // This will reverse the order of the elements
        if (x < y)
            return 1;
        if (x > y)
            return -1;
        return 0;
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {

        // int a[] = { 2, 4, 6, 8, 1, 3, 5, 2 };
        // int b[] = { 2, 4, 6, 8, 1, 3, 5, 7 };

        // System.out.println(Arrays.compare(a, b));
        // int c[] = Arrays.copyOf(a, a.length);
        // // Arrays.sort(a);
        // // Arrays.fill(c, -1);
        // Arrays.parallelSort(a); // Multi Threading
        // System.out.println(Arrays.toString(c));
        // System.out.println(Arrays.toString(a));
        // System.out.println(Arrays.binarySearch(a, 2));

        Integer a[] = { 2, 4, 6, 8, 1, 3, 5, 2 };

        Arrays.sort(a, new My());

        System.out.println(Arrays.toString(a));

    }

}
