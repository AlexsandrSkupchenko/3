package lesson3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Notebook {
    Map<String, HashSet<String>> notebook;

    public Notebook(){
        notebook = new HashMap<>();
    }
    public void add(String name, String number) {
        HashSet<String> phones = notebook.getOrDefault(name, new HashSet<>());
        phones.add(number);
        notebook.put(name, phones);
    }
    public String get(String name) {
        System.out.println("номер телефона:" +" " + notebook.get(name));
        return name;
    }
}