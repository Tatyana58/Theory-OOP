package Interfase;

public class Magazine implements Printable{
    //// Класс Magazine в данном случае реализует интерфейс Printable,
    //// и объекты этого класса имеют метод print, созданный в интерфейсе,
    //// с той реализацией, которая обозначена в самом интерфейсе
    private String name;

    String getName() {
        return name;
    }

    Magazine(String name) {
        this.name = name;
    }

    // Тут тоже необходимо реализовать метод из интерфейса
//    public void print() {
//        System.out.println(name);
//    }
}
