import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collection;
    private int capacity;

    public Library(int capacity) {
        this.capacity = capacity;
        this.collection = new ArrayList<Book>();
    }

    public int countBooks() {
        return this.collection.size();
    }

    public void addBook(Book book) {
        if (this.countBooks() < this.capacity) {
            this.collection.add(book);
        }
    }

    public Book lendBook() {
        return this.collection.remove(0);
    }
}
