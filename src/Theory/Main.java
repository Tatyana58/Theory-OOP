package Theory;

public class Main {
    public static void main(String[] args) {

        PrintedProduct[] products = new PrintedProduct[] {
                new Book("War and Peace", 1000, "Lev Tolstoy", "Война и мир"),
                new Magazine("Java Magazine", 100, "Много информации о Java"),
                new Magazine("Java Magazine2", 150, "Много информации о Java, 2-е издание")
        };

        for (int i = 0; i < products.length; i++) {
            PrintedProduct p = products[i];
            //p.getAuthorName(); // Будет ошибка
            // Независимо от того, книга лежит или журнал в ячейке i,
            // мы имеем ссылку типа PrintedProduct,
            // а в нем о таком методе никто не знает
            p.printContent(); // Метод сработает верно,
            // так как метод printContent существует в PrintedProduct
        }
        // Создадим 2 объекта
        Book b = new Book("War and Peace", 1000, "Lev Tolstoy", "Война и мир");
        Magazine m = new Magazine("Java Magazine", 100, "Много информации о Java");


        // И передадим их в качестве параметра в метод
        printContent(b);
        printContent(m);

    }

    public static void printContent(PrintedProduct product) {
        product.printContent();
    }
}