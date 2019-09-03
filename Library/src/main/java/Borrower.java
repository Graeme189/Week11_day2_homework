import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> borrowedList;

    public Borrower() {
        this.borrowedList = new ArrayList<Book>();
    }

    public int borrowedListCount() {
        return this.borrowedList.size();
    }

    public void borrowBook(Library library) {
        Book book = library.lendBook();
        this.borrowedList.add(book);
    }
}
