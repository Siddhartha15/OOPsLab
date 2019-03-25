import java.util.Date;

public class Book {

    private String bookName, publisherName, authorName, borrowerName;
    private int borrowerfine=0;
    private Date  addedDate, issuedDate, dueDate, returnedDate;
    private int bookStatus=1; // 1-available , 2-issued

    public Book(String bookName, String publisherName, String authorName, Date addedDate, int bookStatus) {
        this.bookName = bookName;
        this.publisherName = publisherName;
        this.authorName = authorName;
        this.addedDate = addedDate;
        this.bookStatus=bookStatus;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public int getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(int bookStatus) {
        this.bookStatus = bookStatus;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public int getBorrowerfine() {
        return borrowerfine;
    }

    public void setBorrowerfine(int borrowerfine) {
        this.borrowerfine = borrowerfine;
    }

    public Date getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(Date issuedDate) {
        this.issuedDate = issuedDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getReturnedDate() {
        return returnedDate;
    }

    public void setReturnedDate(Date returnedDate) {
        this.returnedDate = returnedDate;
    }
}
