import java.util.ArrayList;

public class Borrower {

    String  Name;
    int maxBooksAllowed;
    int Totalfine=0;

    public void viewAddedBooks(){}
    public void viewDetailsofBook(String publisherName,String authorName ){

    }
}

class Student extends Borrower{

    int  maxBooksAllowed = 5;
    Book[] issuedBooks = new Book[maxBooksAllowed];
}

class Faculty extends Borrower{
    int maxBooksAllowed = 10;

    Book[] issuedBooks = new Book[maxBooksAllowed];


}