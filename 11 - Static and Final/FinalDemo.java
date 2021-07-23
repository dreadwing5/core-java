class Test2 {

    public final void show() {

        System.out.println("Hello");
    }
}

final class Test3 extends Test2 {
    // @Override
    // public void show() {
    // System.out.println("Test3 -> Hello");
    // } //Can't override final method
}

// class Test4 extends Test3 {
// } //Can't extend final classes

public class FinalDemo {

    // final float PI;

    // // {
    // // PI = 3.14159f;
    // // }

    // public FinalDemo() {
    // PI = 3.14159f;
    // }

    public static void main(String[] args) {

        // PI = 3.1415926f;

        // System.out.println(PI);

    }
}
