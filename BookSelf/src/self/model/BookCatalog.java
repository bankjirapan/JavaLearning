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
    //นำไฟล์เข้ามามันคือการผูก Class
    private Book books[];

    public BookCatalog(int lengthOfCatalog) {
        books = new Book[lengthOfCatalog];
    }

    public int size() {
        return books.length;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public int addBook(Book bookAdded) {
        
        int value = 0;
        for(int i = 0; i<books.length; i++){
            if(books[i] == null){
                books[i] = bookAdded;
                this.numOfBooks++;
                value = i;
                break;
             
            } else {
               value = -1;
            }
            
            
             
        }
        
        return value;

    }

    public int unAvailableBook(Book bookUnAvailable) {
       int value = 0;
       for(int i = 0; i<books.length; i++){
           if(books[i].equals(bookUnAvailable)){
       
               this.numOfBooks++;
               value = i;
               break;
               
           } else {
               value = -1;
           }
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
