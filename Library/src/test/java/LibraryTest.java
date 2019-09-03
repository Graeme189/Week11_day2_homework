import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void setUp(){
        library = new Library();
        book = new Book("Fear and Loathing", "Hunter Thompson", "non-fiction");
    }

    @Test
    public void libraryHasBook() {
      assertEquals(0, library.countBooks());
    }
}

