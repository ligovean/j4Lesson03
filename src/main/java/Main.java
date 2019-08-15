import stack.Stack;
import stack.StackImpl;

public class Main {
    public static void main(String[] args) {

        System.out.println("====================СТЕК====================");
        System.out.println("Создание стековой структуры на 10 элементов");
        Stack<Integer> st1 = new StackImpl<Integer>(10);
        System.out.println(st1);
        System.out.println("Текущий размер созданного стека: " + st1.size());
        System.out.println();

        System.out.println("Заполнение стека");
        int i=0;
        while (!st1.isFull()){
            st1.push(++i);
        }
        System.out.println();

        System.out.printf("Размер стека: %s\n", st1.size());
        System.out.printf("Текущий стек: %s\n", st1);
        System.out.println();

        System.out.printf("Верхний элемент стека: %d\n", st1.peek());
        System.out.printf("Текущий стек: %s\n", st1);
        System.out.println();

        while (!st1.isEmpty()){
            System.out.printf("Извлечение из стека: %d\n", st1.pop());
            System.out.printf("Текущий стек: %s\n", st1);
            System.out.println();
        }

    }
}
