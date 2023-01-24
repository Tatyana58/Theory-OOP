package Polimorfizm;

public class PrintedProduct {
    private String name;
    private int pageQuantity;
    private String content;

    public PrintedProduct(String name, int pageQuantity, String content) {
        this.name = name;
        this.pageQuantity = pageQuantity;
        this.content = content;
    }

    // Опишем метод, который выводит информацию в консоль
    public void printContent() {
        System.out.println(content);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageQuantity() {
        return pageQuantity;
    }

    public void setPageQuantity(int pageQuantity) {
        this.pageQuantity = pageQuantity;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
