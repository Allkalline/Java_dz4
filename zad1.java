import java.util.LinkedList;
import java.util.Random;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.

public class zad1 {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        arrayRandomizer(ll);
        System.out.println(ll);
        Reverse(ll);

    }


    public static void arrayRandomizer (LinkedList arr){
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            arr.add(random.nextInt(0,10));
        }
    }

    public static void Reverse(LinkedList arr) {
        for (int i = arr.size()-1; i>=0;i--){
            System.out.print(arr.get(i) + ", ");
    }
    }
}

