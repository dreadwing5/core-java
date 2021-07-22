public class DeskPhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void answer() {

        if (isRinging) {
            System.out.println("Answering the desk phone");
            isRinging = false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber) {
            System.out.println("Calling the desk phone");
            isRinging = true;
            return true;
        }
        return false;

    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Dialing " + phoneNumber);

    }

    @Override
    public boolean isRinging() {
        if (isRinging) {
            System.out.println("Answering the desk phone");
            isRinging = false;
        }

        return false;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, desk phone does not have a power button");

    }

    public void powerOff() {
        System.out.println("Shutting off the deskphone, goodbye");
    }

}
