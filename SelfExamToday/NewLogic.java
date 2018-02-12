/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package self.model;

/**
 *
 * @author Tisanai.Cha
 */
public class BookCatalog {

    private int numOfBooks;
    private Book books[];

    public BookCatalog(int lengthOfCatalog) {
        this.books = new Book[lengthOfCatalog];
    }

    public int size(Book[] books) {
        return books.length;
    }

    public Book[] getBooks(Book[] books) {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public int addBook(Book bookAdded) {
        int value = -1;
        if (numOfBooks < books.length) {
            books[numOfBooks] = bookAdded;
            value = numOfBooks;
            numOfBooks++;

        }
        return value;

    }

    public int unAvailableBook(Book bookUnAvailable) {
        int value = 0;
        if (numOfBooks < books.length) {
            books[numOfBooks].equals(bookUnAvailable);
            value = numOfBooks;
            numOfBooks++;

        }
        return value;

    }

    @Override
    public String toString() {
        String listOfBooks = "***List of Books***\n";
        for (int i = 0; i < numOfBooks; i++) {
            listOfBooks += books[i] + "\n";
        }

        return listOfBooks;
    }

}
