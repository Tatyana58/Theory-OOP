package Interfase.CreatePrintable;

public class Magazine implements Printable{
    private String name;

    String getName() {
        return name;
    }

    Magazine(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }

}
