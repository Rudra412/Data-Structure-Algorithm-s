import java.util.Stack;

public class Main {
    public static void main(String[ ] args) {

        Stack<Integer> inputStack = new Stack();
        inputStack.push(1);
        inputStack.push(2);
        inputStack.push(3);
        inputStack.push(4);
        inputStack.push(5);

        Stack<Integer> reversedStack = StackReversal.reverseStack(inputStack);

        System.out.println("Reversed Stack:");
        for (Integer num : reversedStack) {
            System.out.print(num + " ");
        
    }
}

class StackReversal {
    public static Stack<Integer> reverseStack(Stack<Integer> inputStack) {
        Stack<Integer> reversedStack = new Stack<>();
        while (!inputStack.isEmpty()) {
            reversedStack.push(inputStack.pop());
        }
        return reversedStack;
    }
}