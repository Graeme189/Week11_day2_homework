import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void setUp(){
        library = new Library(1);
        book = new Book("Fear and Loathing", "Hunter Thompson", "non-fiction");
    }

    @Test
    public void libraryHasBook() {
      assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBook() {
        library.addBook(book);
        assertEquals(1, library.countBooks());

    }

    @Test
    public void cantAddBook() {
        library.addBook(book);
        library.addBook(book);
        assertEquals(1, library.countBooks());
    }


}

