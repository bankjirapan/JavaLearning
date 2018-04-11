
package self.model;

public class BookCatalog {

    private int numOfBooks;
    private Book books[]; //ดึงมาจาก Book

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

        int value = 0; // กำหนค่าแรกให้เท่ากับ 0
        for (int i = 0; i < books.length; i++) {         // วนลูบน้อยกว่าความยาวของ book
            if (books[i] == null) {                      // ถ้า book ช่องที่ i มันเท่ากับ null  
                books[i] = bookAdded;                    //เพิ่มหนังสือเข้าไป
                this.numOfBooks++;                       //เพิ่มหนังเข้าไปแล้วบวกค่า
                value = i;                               // กำหนดว่าความยาวที่เพิ่มไปเท่าไหร่
                break;                                   //หยุด

            } else {                                     //แต่ถ้ามันเต็มแล้ว
                value = -1;                              // รีเทิน -1
            }
        }

        return value;                                    //รีเทินค่าของ value = i;

    }

    public int unAvailableBook(Book bookUnAvailable) {
    int value = 0;                                  //กำหนดค่า เท่ากับ 0
        for (int i = 0; i < books.length; i++) {    //วนลูปความยาวน้อยว่าbook
            if (books[i].equals(bookUnAvailable)) { // เช็คว่า book ช่องที่ i มันเท่ากับ parameter ที่รับเข้ามาล่าว
                books[i] = null;                    //เซ็ค Book ช่องที่ i มันเท่ากับ null;
                this.numOfBooks++;                  //หนังสือที่ลบ มันมีเท่านี้นะ ให้บวกค่าไป
                value = i;                          // มันลบไปเท่าไหร่นับ loop 
                break;                              // หยุดการทำงาน

            } else {
                value = -1;                         // ไม่เท่ากัน รีเทิน -1
            }
        }

        return value;                               //รีเทินค่าของ value = i;


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
