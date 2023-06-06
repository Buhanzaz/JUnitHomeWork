package practicum.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ppp {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Банан");
        fruits.add("Апельсин");
        fruits.add("Яблоко");
        fruits.add("Груша");

        System.out.println(fruits); // [Банан, Апельсин, Яблоко, Груша]

        fruits.sort(String.CASE_INSENSITIVE_ORDER);// Вызовите компаратор String.CASE_INSENSITIVE_ORDER

        System.out.println(fruits); // [Апельсин, Банан, Груша, Яблоко]
    }
}
