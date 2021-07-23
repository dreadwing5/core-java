class Test1 {

    static {
        System.out.println("Test -> Static block");
    }
}

public class StaticBlock {

    static {
        System.out.println("Static block 1");
    }

    public static void main(String[] args) {

        System.out.println("Main");
        Test1 t = new Test1();

    }

    static {
        System.out.println("Static block 2");
    }
}
