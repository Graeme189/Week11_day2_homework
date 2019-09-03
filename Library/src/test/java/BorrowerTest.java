import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void setUp() {
        borrower = new Borrower();
    }

    @Test
    public void checkNoBorrowedBooks() {
        assertEquals(0, borrower.borrowedListCount());
    }

    @Test
    public void checkCanBorrowBook() {
        borrower.borrowBook(library);
        assertEquals(1, borrower.borrowedListCount());
    }
}

