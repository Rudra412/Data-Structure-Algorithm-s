import java.util.Stack;

public class RevStack{

    public static void main(String [ ] args)  {

        S1 = new Stack<>();

        stack = pushelements();

        for (int i=10; i>=0; i--) {
            stack.push(i);
        }

        stackpush(stack);
        printStack(stack);
    }

    void stackpushelements() {
        Stack tempstack = new Stack();
        int size = stack.size();
        while (stack.empty()) {
            tempstack.push(stack.pop());
        }
        for (int i = 0; i < size; i++) {
            stack.push(tempstack.pop());
        }
    }

    public static void printStack() {
        System.out.println("Elements in the stack are: ");
        for (int i = st.size() - 1; i >= 0; i--) {
            System.out.print(st.element(i) + " ");
        }
        System.out.println();
    }
}