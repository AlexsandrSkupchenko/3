package lesson3;

import java.util.*;

public class HW31 {
    public static void main(String[] args) {


        String[] elements = {"Александр", "Виктор", "Алексей", "Александр", "Виктор", "Николай", "Леонид", "Виктор", "Виталий", "Павел", "Николай"};
        Map<String, Integer> map = new HashMap<>();
        Set<String> uniqElements = new HashSet<>(Arrays.asList(elements));
        System.out.println(uniqElements);
        System.out.println("");

        for (String element : elements) {
            map.merge(element, 1, (a, b) -> a + b);
        }
        System.out.println(map);
        System.out.println("");
    }
}