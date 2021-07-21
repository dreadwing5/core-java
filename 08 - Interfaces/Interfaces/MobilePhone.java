public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void answer() {

        if (isRinging) {
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn) {
            System.out.println("Calling the mobile phone");
            isRinging = true;
            System.out.println("Melody playing");
        } else {
            isRinging = false;
            System.out.println("Phone is Switched off or Wrong number");
        }
        return isRinging;
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn == true)
            System.out.println("Now Ringing " + phoneNumber + "on mobile phone");
        else
            System.out.println("The phone is off");
    }

    @Override
    public boolean isRinging() {
        if (isRinging) {
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }

        return false;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Turning on the device");

    }

}
