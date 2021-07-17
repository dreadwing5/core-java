
class Car {
    private boolean engine = true;
    private int cylinders;
    private String name;
    private int wheels = 4;

    public Car(int cylinders, String name) {
        this.name = name;
        this.cylinders = cylinders;

    }

    public String startEngine() {
        return "Car -> startEngine()";

    }

    public String accelerate() {
        return "Car -> accelerate()";

    }

    public String brake() {
        return "Car -> brake()";

    }

    public int getCylinders() {
        return this.cylinders;
    }

    public String getName() {
        return this.name;
    }

}

class Mitsubishi extends Car {

    Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine() {
        return "Mitsubishi -> startEngine()";

    }

    public String accelerate() {
        return "Mitsubishi -> accelerate()";

    }

    public String brake() {
        return "Mitsubishi -> brake()";

    }

}

class Holden extends Car {
    Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine() {
        return "Holden -> startEngine()";

    }

    public String accelerate() {
        return "Holden -> accelerate()";

    }

    public String brake() {
        return "Holden -> brake()";

    }
}

class Ford extends Car {
    Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine() {
        return "Ford -> startEngine()";

    }

    public String accelerate() {
        return "Ford -> accelerate()";

    }

    public String brake() {
        return "Ford -> brake()";

    }

}

public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Holden holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

        Ford ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

    }
}
