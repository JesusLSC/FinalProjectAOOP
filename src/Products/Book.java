package Products;

public class Book extends Item {
    private String author;
    private int isbn;

    public Book(int id, String title, String author, int isbn, String genre, double price, int quantity) {
        super(id, title, genre, price, quantity);
        this.author = author;
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}
