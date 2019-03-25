
import java.util.Date;
import java.util.Scanner;

public class borrower {

    String name,deparmernt;

    public int id;

    public String getName() {
        return name;
    }

    public String getDeparmernt() {
        return deparmernt;
    }

    public int getId() {
        return id;
    }

    public borrower(String name, String deparmernt, int id) {
        this.name = name;
        this.deparmernt = deparmernt;
        this.id = id;


    }
}

class student extends borrower{
    Scanner input=new Scanner(System.in);
    int maxbooks=5;
    int countbook=0;
    Date[] issueDate=new Date[10];
    int[] issuedate=new int[5];
    int i,j;
    String[] books=new String[10];

    public  student(String name,String dept,int id)
    {
        super(name,dept,id);
    }

    public  void issuebook()
    {
        System.out.println("enter book name");

        if(countbook<maxbooks) {
            books[countbook] = input.next();


            issueDate[countbook] = new Date();          //CURRENT DATE

            countbook++;
        }
        else
            System.out.println("U HAVE ISSUED MAX BOOKS");
    }
    public void viewissuedbooks()
    {
        for(i=0;i<countbook;i++)
        {
            System.out.println("bookname:"+books[i]+"\nissuedate"+issueDate[i]);
            System.out.println("");
        }
    }

    public void returnbook(String book)
    {
        for(i=0;i<countbook;i++)
        {
            if(books[i].equals(book))
            {
                j=i;
            }
        }
        for(i=j;i<countbook-1;i++)
        {
            books[i]=books[i+1];
        }
        countbook--;
        // enter todays date
        Date today=new Date();
        // or set Date

        int due=(int) (today.getTime()-issueDate[j].getTime())/(1000*60*60*24);

        if(due==0)
            System.out.println("return succeefull");
        else
        {
            System.out.println("u have due on this book "+due);
            System.out.println("pay the due");
        }
    }




}

class faculty extends borrower{

    Scanner input=new Scanner(System.in);

    int maxbooks=10;
    int  countbook=0,i;

    Date[] issueDate=new Date[10];

    String[ ] books= new String[10];
    int j;

    public  faculty(String name,String dept,int id)
    {
        super(name,dept,id);
    }



    public  void issuebook()
    {
        System.out.println("enter book name");

        if(countbook<maxbooks) {
            books[countbook] = input.next();


            issueDate[countbook] = new Date();          //CURRENT DATE

            countbook++;
        }
        else
            System.out.println("U HAVE ISSUED MAX BOOKS");
    }

    public void viewissuedbooks()
    {
        for(i=0;i<countbook;i++)
        {
            System.out.println("bookname:"+books[i]+"\nissuedate"+issueDate[i]);
            System.out.println("");
        }
    }

    public void returnbook(String book)
    {
        for(i=0;i<countbook;i++)
        {
            if(books[i].equals(book))
            {
                j=i;
            }
        }
        for(i=j;i<countbook-1;i++)
        {
            books[i]=books[i+1];
        }
        countbook--;

        // enter todays date
        Date today=new Date();
        // or set Date

        int due=(int) (today.getTime()-issueDate[j].getTime())/(1000*60*60*24);

        if(due==0)
            System.out.println("return succeefull");
        else
        {
            System.out.println("u have due on this book "+due);
            System.out.println("pay the due");
        }
    }


}
