class StackOverFlowException extends Exception {

    @Override
    public String toString() {
        return "Stack Overflow";
    }
}

class StackUnderFlowException extends Exception {
    @Override
    public String toString() {
        return "Stack Underflow";
    }
}

class Stack {
    private int[] array;
    private int top;

    public Stack(int capacity) {
        array = new int[capacity];
        top = -1;
    }

    public void push(int value) throws StackOverFlowException {
        if (top == array.length - 1) {
            throw new StackOverFlowException();
        }
        array[++top] = value;
        System.out.println(String.format("Pushed %d to the stack", value));
    }

    public int pop() throws StackUnderFlowException {
        if (top == -1) {
            throw new StackUnderFlowException();
        }
        return array[top--];
    }
}

public class StudentChallenge {

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        for (int i = 0; i < 6; i++) {
            try {
                stack.push(i);
            } catch (StackOverFlowException e) {
                System.out.println("Caught : " + e);
            }

        }

        for (int i = 0; i < 6; i++) {
            try {
                System.out.println("" + stack.pop() + " popped");
            } catch (StackUnderFlowException e) {
                System.out.println("Caught : " + e);
            }

        }
    }

}
