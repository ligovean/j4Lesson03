import stack.Stack;
import stack.StackImpl;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> st1 = new StackImpl<Integer>(10);
        System.out.println("Размер созданного стека: " + st1.size());
    }
}
