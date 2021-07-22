abstract class Shape {

    abstract double perimeter();

    abstract double area();

}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

}

class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double perimeter() {
        return 2 * (width + height);
    }

    @Override
    double area() {
        return width * height;
    }
}

class AbstractChallenge {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 15);
        System.out.println("Perimeter -> " + rectangle.perimeter());
        System.out.println("Area -> " + rectangle.area());

        Shape circle = new Circle(5);
        System.out.printf("Perimeter -> %.2f \n", circle.perimeter());
        System.out.printf("Area -> %.2f \n", circle.area());
    }

}