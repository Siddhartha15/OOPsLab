import java.util.*;

public class Librarian {

    ArrayList<Book> books = new ArrayList<Book>();
    ArrayList<Student> students = new ArrayList<Student>();
    ArrayList<Faculty> faculties = new ArrayList<Faculty>();

    public void addBooks(){
        System.out.println("Enter details of Books to add");
        Scanner in = new Scanner(System.in);
        String bookName,  publisherName, authorName; Date addedDate; int bookStatus;
        System.out.println("Enter Book Name");
        bookName=in.next();
        System.out.println("Enter publisher Name");
        publisherName=in.next();
        System.out.println("Enter author Name");
        authorName=in.next();
        books.add(new Book(bookName,publisherName,authorName,new Date(),1));
    }
    public void deleteBooks(){
        System.out.println("Enter the Book name and author name and publisher name to Delete the book");
        String bkname, aname, pname;
        Scanner in = new Scanner(System.in);
        bkname = in.next();
        aname=in.next();
        pname=in.next();
        for(int i=0; i<books.size();i++)
        {
            Book bk = books.get(i);
            if(( bk.getBookName().compareTo(bkname) == 0 )&&(bk.getAuthorName().compareTo(aname) == 0)&&(bk.getPublisherName().compareTo(pname) == 0)) {
                if(bk.getBookStatus() == 1)
                {
                    books.remove(bk);
                    System.out.println("Successful Deletion !!!!!!!!");
                   return;
                }
                else if( bk.getBookStatus() == 2)
                {
                    System.out.println("Book is issued by someone -- Cannot Delete !!!!!!!!");
                    return;
                }
            }
        }
        System.out.println("Book Not Found !!!!!!!!!!");

    }
    public void viewBooks(){
        System.out.println("The Books Available =====================================");
        for(int i=0;i<books.size();i++)
        {
            if(books.get(i).getBookStatus() == 1)
            {
                System.out.print(books.get(i).getBookName()+"\n"+books.get(i).getAuthorName()+"\n"+books.get(i).getAddedDate().toString()+"\n=============");
            }
        }
    }
    public void issueBooks(){
        int mode;
        while (true)
        {
            System.out.println("Enter 1-Student 2-Faculty 3-exit");
            Scanner in = new Scanner(System.in);
            mode= in.nextInt();
            if( mode == 1)
            {
                int noofBooksissued=0;
                Student student = new Student();
                System.out.println("Enter Borrower Name");
                student.Name = in.next();
                int c;
                while (true) {
                    System.out.println("enter 1-issue || 2-exit");
                    c=in.nextInt();
                    if(c == 1)
                    {
                        if(noofBooksissued >=5 )
                        {
                            System.out.println("Maximum issuing reached !!!!!!!!!");
                            break;
                        }
                        else {

                            System.out.println("Enter the Book name & Author name & Pub name ========= ");
                            String bname,aname,pname;
                            bname=in.next();
                            aname=in.next();
                            pname=in.next();
                            int flag=0;
                            for(int i=0 ;i< books.size();i++)
                            {
                                Book bk = books.get(i);
                                if(( bk.getBookName().compareTo(bname) == 0 )&&(bk.getAuthorName().compareTo(aname) == 0)&&(bk.getPublisherName().compareTo(pname) == 0) )
                                {
                                    if(bk.getBookStatus() == 1)
                                    {
                                        Date date = new Date();
                                        bk.setIssuedDate(date);
                                        bk.setBookStatus(2);
                                        bk.setBorrowerName(student.Name);
                                        bk.setDueDate((Date)(new GregorianCalendar(date.getYear(), date.getMonth(), date.getDay()+15).getTime()));
                                        student.issuedBooks[noofBooksissued] = bk;
                                        noofBooksissued++;
                                        flag=1;
                                        System.out.println("Successfully Added )))))))");
                                        break;
                                    }
                                    else if(bk.getBookStatus() == 2)
                                    {
                                        flag=1;
                                        System.out.println("Already issued !!!!!!!!!!!!");
                                        break;
                                    }
                                }
                            }
                            if(flag == 0)
                            {
                                System.out.println("Book Not Available !!!!!!!!!!");
                            }
                        }
                    }
                    else break;
                }
            }
            else if(mode ==2)
            {
                int noofBooksissued=0;
                Faculty faculty = new Faculty();
                System.out.println("Enter Borrower Name");
                faculty.Name = in.next();
                int c;
                while (true) {
                    System.out.println("enter 1-issue || 2-exit");
                    c=in.nextInt();
                    if(c == 1)
                    {
                        if(noofBooksissued >=10 )
                        {
                            System.out.println("Maximum issuing reached !!!!!!!!!");
                            break;
                        }
                        else {

                            System.out.println("Enter the Book name & Author name & Pub name ========= ");
                            String bname,aname,pname;
                            bname=in.next();
                            aname=in.next();
                            pname=in.next();
                            int flag=0;
                            for(int i=0 ;i< books.size();i++)
                            {
                                Book bk = books.get(i);
                                if(( bk.getBookName().compareTo(bname) == 0 )&&(bk.getAuthorName().compareTo(aname) == 0)&&(bk.getPublisherName().compareTo(pname) == 0) )
                                {
                                    if(bk.getBookStatus() == 1)
                                    {
                                        Date date = new Date();
                                        bk.setIssuedDate(date);
                                        bk.setBookStatus(2);
                                        bk.setBorrowerName(faculty.Name);
                                        bk.setDueDate((Date)(new GregorianCalendar(date.getYear(), date.getMonth(), date.getDay()+30).getTime()));
                                        faculty.issuedBooks[noofBooksissued] = bk;
                                        noofBooksissued++;
                                        flag=1;
                                        System.out.println("Successfully Added )))))))");
                                        break;
                                    }
                                    else if(bk.getBookStatus() == 2)
                                    {
                                        flag=1;
                                        System.out.println("Already issued !!!!!!!!!!!!");
                                        break;
                                    }
                                }
                            }
                            if(flag == 0)
                            {
                                System.out.println("Book Not Available !!!!!!!!!!");
                            }
                        }
                    }
                    else break;
                }
            }
            else break;
        }

    }
    public void viewIssuedBooks(){
        System.out.println("The Books Issued =====================================");
        for(int i=0;i<books.size();i++)
        {
            if(books.get(i).getBookStatus() == 2)
            {
                System.out.print(books.get(i).getBookName()+"\n"+books.get(i).getIssuedDate().toString()+"\n"+books.get(i).getBorrowerName()+"\n=============");
            }
        }
    }

    public void returnBooks(){}
    public void sendOverdueNotice(){}
    public void sendAddOverdueNotice(){}

    public void viewIssuedBooksDue(){}
}

