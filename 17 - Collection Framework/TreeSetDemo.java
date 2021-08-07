import java.util.*;

class Point implements Comparable<Point> {

    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public int compareTo(Point p) {

        if (this.x == p.x) {
            return Integer.compare(this.y, p.y);
        } else {
            return Integer.compare(this.x, p.x);
        }

    }
}

public class TreeSetDemo {

    public static void main(String[] args) {

        // TreeSet<Integer> set = new TreeSet<Integer>(List.of(10, 30, 50, 70, 10, 40));

        // set.add(25);

        // System.out.println(set.ceiling(55));
        // System.out.println(set.floor(55));
        // System.out.println(set.comparator());
        // System.out.println(set);

        TreeSet<Point> set = new TreeSet<Point>();
        set.add(new Point(1, 2));
        set.add(new Point(3, 4));
        set.add(new Point(5, 6));
        set.add(new Point(2, 1));
        set.add(new Point(2, 2));
        set.add(new Point(2, 4));
        set.add(new Point(2, 3));
        set.add(new Point(3, 2));

        System.out.println(set);
    }

}
