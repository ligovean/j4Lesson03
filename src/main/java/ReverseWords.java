import stack.Stack;
import stack.StackImpl;

import java.io.IOException;
import java.io.InputStreamReader;

//Задание 2. Создать программу, которая переворачивает вводимые строки (читает справа налево) c применением стека или очереди.
public class ReverseWords {
    public static void main(String[] args) throws IOException {

        InputStreamReader reader = new InputStreamReader(System.in);
        Stack<Character> st1 = new StackImpl<Character>(50);
        char x;

        System.out.println("Введите слово или фразу:");
        //Чтение текста в стек
        while (true) {
            x = (char) reader.read();
            if (x==10) break;
            st1.push(x);
        }

        //Вывод из стека в консоль
        System.out.println();
        System.out.println("Перевернутая фраза:");
        while (!st1.isEmpty()){
            System.out.print(st1.pop());
        }
    }
}
