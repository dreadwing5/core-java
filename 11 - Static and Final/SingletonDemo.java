class CoffeeMachine {

    private float coffeeQty;
    private float waterQty;
    private float milkQty;
    private float sugarQty;

    static private CoffeeMachine coffeeMachine = null;

    public CoffeeMachine() {
        coffeeQty = 1;
        waterQty = 1;
        milkQty = 1;
        sugarQty = 1;

    }

    public void fillWater(float Qty) {
        waterQty += Qty;
    }

    public void fillSugar(float Qty) {
        sugarQty += Qty;
    }

    public double getCoffee() {
        return 0.23f;

    }

    public static CoffeeMachine getInstance() {

        if (coffeeMachine == null) {

            coffeeMachine = new CoffeeMachine();
        }
        return coffeeMachine;
    }

}

public class SingletonDemo {
    public static void main(String[] args) {

        CoffeeMachine coffeeMachine = CoffeeMachine.getInstance();
        CoffeeMachine coffeeMachine1 = CoffeeMachine.getInstance();
        CoffeeMachine coffeeMachine2 = CoffeeMachine.getInstance();

        System.out.println(coffeeMachine.getCoffee());

        if (coffeeMachine == coffeeMachine1 && coffeeMachine == coffeeMachine2) {
            System.out.println("The coffee machine is a singleton");

        }

    }
}
