import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;

    @Before
    public void setUp() {
        borrower = new Borrower();
    }

    @Test
    public void checkNoBorrowedBooks() {
        assertEquals(0, borrower.borrowedListCount());
    }

}

