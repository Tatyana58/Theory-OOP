package Interfase;

public class Test {
    public static void main(String[] args) {
        Book book = new Book("War and Peace", "Lev Tolstoy");
        book.print();

    // В данном случае мы можем определить тип ссылки на объект
    // равным типу интерфейса
    Printable printable = new Book("War and Peace", "Lev Tolstoy");
      printable.print(); //  Lev Tolstoy — War and Peace

    printable = new Magazine("National Geografic");
      printable.print(); // National Geografic
}
}
