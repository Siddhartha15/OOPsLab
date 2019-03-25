import java.util.Date;
import java.util.Scanner;

public class books {

    String bookname,author,publisher;
    boolean issued=false;
    String issuedby=null;
    Date issueDate=new Date();
    Scanner input=new Scanner(System.in);

    //
    public books(String bookname, String author, String publisher, boolean issued, String issuedby, Scanner input) {
        this.bookname = bookname;
        this.author = author;
        this.publisher = publisher;
        this.issued = issued;
        this.issuedby = issuedby;
        this.input = input;
    }

    //
    public  books()
          {

          }
    public void addbook()
    {

        System.out.println("book Name:");
        this.bookname=input.next();

        System.out.println("book Author:");
        this.author=input.next();
        System.out.println("bookPublisher:");
        this.publisher=input.next();

    }

    public void viewbook()
    {
        System.out.println("book Name:"+bookname+"\nbook Author:"+author+"\npublisher"+publisher);
             System.out.println("ISSUED BY:"+issuedby);


    }

    public  void getdue()

    {



        Date today=new Date();
        int due=(int) (today.getTime()-issueDate.getTime())/(1000*60*60*24);

        if(due==0)
            System.out.println("no due");
        else
        {
            System.out.println("due: "+due);

        }
    }
}
