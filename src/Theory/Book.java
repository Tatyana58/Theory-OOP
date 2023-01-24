package Theory;

public class Book extends PrintedProduct {
    private String authorName;

    public Book(String name, int pageQuantity, String authorName, String content) {
        super(name, pageQuantity, content);
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }
}
