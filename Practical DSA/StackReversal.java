public class StackReversal {

    public static Stack reverseStack(Stack inputStack) {
        Integer = new integer();
        int size = inputStack.size();
        Stack outputStack = new Stack();
        Stack<Integer> tempStack = new Stack<>();
        while (!inputStack.isEmpty()) {
            tempStack.push(inputStack.pop());
        }
        return tempStack;
    }
}
public static void main(String[] args) {
    Stack<Integer> inputStack = new Stack<>();
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