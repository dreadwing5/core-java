public class Main {

    public static void main(String[] args) {
        ITelephone sachinPhone;
        sachinPhone = new DeskPhone(1234567890);
        sachinPhone.powerOn();
        sachinPhone.callPhone(1234567890);
        sachinPhone.answer();

        sachinPhone = new MobilePhone(98765432);
        sachinPhone.powerOn();
        sachinPhone.callPhone(98765432);
        sachinPhone.answer();
    }

}
