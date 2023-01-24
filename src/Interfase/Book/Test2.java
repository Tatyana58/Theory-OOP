package Interfase.Book;

//Интерфейсы в преобразованиях типов
public class Test2 {
    public static void main(String[] args) {

        Printable printable = new Book("War and Peace", "Lev Tolstoy");
        printable.print();

        // Тут используется явное приведение,
        // так как в интерфейсе нет метода getName
        //Явное приведение типов —
        //(Book)printable.getName();
        // — нужно для того, чтобы через ссылку интерфейса вызывать методы класса, к которому относится наш объект.
        String name = ((Book) printable).getName();
        System.out.println(name);
    }
}
