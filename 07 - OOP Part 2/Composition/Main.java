public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20, 20, 5);

        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();

        /*
         * Composition follows HAS-A relationship
         * 
         * Inheritance follows IS-A relationship
         * 
         * For example:-
         * 
         * Bathroom HAS-A Tub ----------------------> Composition
         * 
         * Dog IS-A Animal --------------------------> Inheritance
         * 
         * You cannot say Bathroom IS-A Tub, it simply doesn't make sense, hence when we
         * have HAS-A relationship, we use Composition.
         * 
         * Similarly, Dog IS-A animal, Dog HAS-A animal makes no sense.
         */

    }

}
