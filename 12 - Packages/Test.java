package mypack1;

class Test {

    int a = 10;
    private int b = 20;
    protected int c = 30;
    public int d = 15;

    public Test() {
        System.out.println("Test -> Constructor called");

        System.out.println(a + b + c + d);
    }

}
