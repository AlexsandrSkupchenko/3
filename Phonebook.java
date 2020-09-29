package lesson3;

public class Phonebook {
    public static void main(String[] args) {
       Notebook notebook = new Notebook();
        notebook.add("Александр", "+79064333555");
        notebook.add("Евгений", "+79246794216");
        notebook.add("Виталий", "+73297456811");
        notebook.add("Александр", "4951248");
        notebook.get("Александр");
        notebook.get("Евгений");
        notebook.get("Виталий");
    }
}
