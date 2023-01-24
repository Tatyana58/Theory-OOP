package Interfase.CreatePrintable;

public class Book implements Printable{
    String name;
    String author;

    Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public void print() {
        System.out.println(name + " - " + author);
    }

}
