package Interfase.CreatePrintable;

public class Test {public static void main(String[] args) {

    Printable printable = createPrintable("National Geographic",false);
    printable.print();

    read(new Book("Dead Souls", "N. Gogol'"));
    read(new Magazine("New York Times"));
}

    static void read(Printable p) {
        p.print();
    }

    static Printable createPrintable(String name, boolean option) {
        if(option) {
            return new Book(name, "Undefined");
        } else {
            return new Magazine(name);
        }
    }

}
