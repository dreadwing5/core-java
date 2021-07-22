public class Main {

    public static void main(String[] args) {
        // DeskPhone deskPhone = new DeskPhone(1234567);

        // ITelephone cellphone = deskPhone;

        // ITelephone sachinPhone = new DeskPhone(1234567);

        ITelephone sachinphone;

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
