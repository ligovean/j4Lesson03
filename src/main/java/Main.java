import deque.DequeImpl;
import queue.Queue;
import queue.QueueImpl;
import stack.Stack;
import stack.StackImpl;

//Задание 1. Реализовать рассмотренные структуры данных в консольных программах (или протестировать с JUnit).
public class Main {
    public static void main(String[] args) {
        int i=0;

        System.out.println("====================СТЕК====================");
        System.out.println("Создание стековой структуры на 10 элементов");
        Stack<Integer> st1 = new StackImpl<Integer>(10);
        System.out.printf("Текущий стек: %s\n", st1);
        System.out.println("Текущий размер созданного стека: " + st1.size());
        System.out.println();

        System.out.println("Заполнение стека");

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

        System.out.println("====================ОЧЕРЕДЬ====================");
        System.out.println("Создание структуры очереди на 10 элементов");
        Queue<Integer> qu1 = new QueueImpl<Integer>(10);
        System.out.printf("Текущая очередь: %s\n", qu1);
        System.out.println();

        System.out.println("Заполнение очереди");
        i=0;

        while (!qu1.isFull()){
            qu1.insert(++i);
        }
        System.out.println();

        System.out.printf("Размер очереди: %s\n", qu1.size());
        System.out.printf("Текущая очередь: %s\n", qu1);
        System.out.println();

        System.out.printf("Извлечение из очереди: %d\n", qu1.remove());
        System.out.printf("Текущая очередь: %s\n", qu1);
        System.out.printf("Размер очереди: %s\n", qu1.size());
        System.out.println();

        System.out.printf("Извлечение из очереди: %d\n", qu1.remove());
        System.out.printf("Текущая очередь: %s\n", qu1);
        System.out.printf("Размер очереди: %s\n", qu1.size());
        System.out.println();

        System.out.println("Вставка в очередь. " + qu1.insert(15));

        System.out.printf("Текущая очередь: %s\n", qu1);
        System.out.printf("Размер очереди: %s\n", qu1.size());
        System.out.println();

        System.out.println("Вставка в очередь. " + qu1.insert(10));
        System.out.println("Вставка в очередь. " + qu1.insert(888));
        System.out.println();

        System.out.printf("Текущая очередь: %s\n", qu1);
        System.out.printf("Размер очереди: %s\n", qu1.size());
        System.out.println();

        System.out.printf("Извлечение из очереди: %d\n", qu1.remove());
        System.out.printf("Текущая очередь: %s\n", qu1);
        System.out.printf("Размер очереди: %s\n", qu1.size());
        System.out.println();


        //Задание 3. Создать класс для реализации дека.
        System.out.println("====================ДЕК====================");
        System.out.println("Создание структуры Дек на 10 элементов");

        DequeImpl<Integer> dc1 = new DequeImpl<Integer>(10);

        System.out.println("Заполнение очереди");
        i=0;
        while (!dc1.isFull()){
            dc1.insert(++i);
        }
        System.out.println();

        //System.out.println("Head: " + dc1.getHead() + ", Tale: " +dc1.getTale());
        System.out.printf("Текущая очередь: %s\n", dc1);
        System.out.printf("Размер очереди: %s\n", dc1.size());
        System.out.println();

        System.out.printf("Извлечение из очереди справа: %d\n", dc1.removeR());
        System.out.printf("Текущая очередь: %s\n", dc1);
        System.out.printf("Размер очереди: %s\n", dc1.size());
        System.out.println();

        System.out.printf("Извлечение из очереди справа: %d\n", dc1.removeR());
        System.out.printf("Текущая очередь: %s\n", dc1);
        System.out.printf("Размер очереди: %s\n", dc1.size());
        System.out.println();

        System.out.printf("Извлечение из очереди слева: %d\n", dc1.remove());
        System.out.printf("Текущая очередь: %s\n", dc1);
        System.out.printf("Размер очереди: %s\n", dc1.size());
        System.out.println();

        System.out.printf("Извлечение из очереди справа: %d\n", dc1.removeR());
        System.out.printf("Текущая очередь: %s\n", dc1);
        System.out.printf("Размер очереди: %s\n", dc1.size());
        System.out.println();

        System.out.println("Вставка в очередь справа. " + dc1.insert(15));
        System.out.println("Head: " + dc1.getHead() + ", Tale: " +dc1.getTale());
        System.out.printf("Текущая очередь: %s\n", dc1);
        System.out.printf("Размер очереди: %s\n", dc1.size());
        System.out.println();

        System.out.println("Вставка в очередь слева. " + dc1.insertL(22));
        System.out.printf("Текущая очередь: %s\n", dc1);
        System.out.printf("Размер очереди: %s\n", dc1.size());
        System.out.println();

        System.out.println("Вставка в очередь слева. " + dc1.insertL(100));
        System.out.printf("Текущая очередь: %s\n", dc1);
        System.out.printf("Размер очереди: %s\n", dc1.size());
        System.out.println();

        System.out.println("Вставка в очередь справа. " + dc1.insert(999));
        System.out.printf("Текущая очередь: %s\n", dc1);
        System.out.printf("Размер очереди: %s\n", dc1.size());
        System.out.println();

        System.out.println("Вставка в очередь слева. " + dc1.insertL(888));
        System.out.printf("Текущая очередь: %s\n", dc1);
        System.out.printf("Размер очереди: %s\n", dc1.size());
        System.out.println();

        System.out.printf("Извлечение из очереди слева: %d\n", dc1.remove());
        System.out.printf("Текущая очередь: %s\n", dc1);
        System.out.printf("Размер очереди: %s\n", dc1.size());
        System.out.println();

        System.out.println("Вставка в очередь слева. " + dc1.insertL(888));
        System.out.printf("Текущая очередь: %s\n", dc1);
        System.out.printf("Размер очереди: %s\n", dc1.size());
        System.out.println();
    }
}
