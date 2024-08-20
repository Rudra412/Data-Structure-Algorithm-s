public class RevStack{

    public static void main(String [ ] args)  {
        Stack <Integer> s = new Stack<Integer>();

        Stack<Integer> stack = new Stack<>();

        for (int i=10; i>=0; i--) {
            stack.push(i);
        }

        stackpush(stack);
        printStack(stack);
    }

    void stackpush(Stack<Integer> stack) {
        Stack <Integer> tempstack = new Stack <Integer>();
        int size = stack.size();
        while (!stack.empty()) {
            tempstack.push(stack.pop());
        }
        for (int i = 0; i < size; i++) {
            stack.push(tempstack.pop());
        }
    }

    public static void printStack(Stack<Integer> st) {
        System.out.println("Elements in the stack are: ");
        for (int i = st.size() - 1; i >= 0; i--) {
            System.out.print(st.elementAt(i) + " ");
        }
        System.out.println();
    }
}