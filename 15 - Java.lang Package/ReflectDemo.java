import java.lang.reflect.*;

class My {
    private int a;
    protected int b;
    public int c;
    int d;

    public My() {

    }

    public My(int x, int y) {
    }

    public void display(String s1, String s2) {
    };

    public int show(int x, int y) {
        return 0;
    }
}

public class ReflectDemo {

    public static void main(String[] args) {
        Class c = My.class;
        // System.out.println(c.getName());
        // Field field[] = c.getDeclaredFields();

        // Constructor constructor[] = c.getConstructors();

        // for (Field field2 : field) {
        // System.out.println(field2.getName());

        // }
        // for (Constructor constructor2 : constructor) {
        // System.out.println(constructor2.getName());
        // }

        Method meth[] = c.getMethods();

        // for (Method method : meth) {
        // System.out.println(method);
        // }

        // Parameter param[] = meth[0].getParameters();

        // for (Parameter parameter : param) {
        // System.out.println(parameter);
        // }

        // My m = new My();
    }

}
