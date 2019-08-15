import stack.Stack;
import stack.StackImpl;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> st1 = new StackImpl<Integer>(10);
        System.out.println(st1);
        System.out.println("Размер созданного стека: " + st1.size());
        System.out.println();

        int i=0;
        while (!st1.isFull()){
            st1.push(++i);
        }

        System.out.printf("Размер стека: %d\n", st1.size());
        System.out.println(st1);
        System.out.println();

        System.out.printf("Последний элемент стека: %d\n", st1.peek());
        System.out.println(st1);
        System.out.println();

        while (!st1.isEmpty()){
            System.out.printf("Извлечение из стека: %d\n", st1.pop());
            System.out.println(st1);
            System.out.println();
        }

    }
}
