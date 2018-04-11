/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import self.model.Book;
import self.model.BookCatalog;

/**
 *
 * @author User
 */
public class UnAvailableBookTest {

    private BookCatalog bc = new BookCatalog(2);

    public UnAvailableBookTest() {
        Book b1 = new Book(123456789, "Web Programming", "programming", true);
        Book b2 = new Book(120056110, "Database Management", "database", true);
        bc.addBook(b1);
        bc.addBook(b2);
    }

    @Test
    public void unAvailableSuccessOneBook() {
        Book b2 = new Book(120056110, "Database Management", "database", true);
        int expected = 1;
        int actual = bc.unAvailableBook(b2);
        assertEquals(expected, actual);
    }

    @Test
    public void unAvailableBookFailOneBook() {
        Book b3 = new Book(123456711, "Web Programming II", "programming", true);
        int expected = -1;
        int actual = bc.unAvailableBook(b3);
        assertEquals(expected, actual);
    }

}
