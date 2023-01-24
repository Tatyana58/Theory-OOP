package Interfase.Book;

public interface Printable {
    //В восьмой версии Java была добавлена возможность прописывать реализацию методов прямо в интерфейсе. Данная реализация распространяется на все классы, имплементирующие интерфейс.
    //Однако ничего не мешает нам переопределить эти методы в реализующих классах. Такие методы называются дефолтными, или методами по умолчанию. Обозначаются они ключевым словом
    //default.
    default void print() {
        System.out.println("Default method");
    }
   // void print();
   static void read() {
       System.out.println("Static method");
   }
}
