import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// • enqueue() — помещает элемент в конец очереди,
// • dequeue() — возвращает первый элемент из очереди и удаляет его,
// • first() — возвращает первый элемент из очереди, не удаляя.



public class zad2 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        arrayRandomizer(ll);
        System.out.println(ll);
        enqueue(ll);
        dequeue(ll);
        System.out.println(ll);
        System.out.println("Первый элемент списка: " +first(ll));
    }

    public static void arrayRandomizer (LinkedList arr){
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            arr.add(random.nextInt(0,10));
        }
    }



    public static void enqueue(LinkedList arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите элемент, который поместится к конец списка: ");
        String elem = scanner.nextLine();
        arr.addLast(elem);
        System.out.println(arr);
    }


    public static Object dequeue(LinkedList arr) {
        Object first = arr.get(0);
        arr.remove(0);
        return first;
    }

    public static Object first(LinkedList arr) {
        Object elem = arr.get(0);
        return elem;
    }


}
