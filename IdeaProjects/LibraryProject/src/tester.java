
import java.util.Date;
        import java.util.Scanner;




class tester
{

    public  static void main(String[] args)
    {

        int i,choice2,choice;
        int currentuser,currnebook;

        int bookCount=0;
        int flag=0,index;

        Scanner input=new Scanner(System.in);

        books[] book=new books[100];


        student[] students=new student[50];
        int  stCount=0,faCount=0;

        faculty[] faculties=new faculty[50];
        String temp;

        do{

            System.out.println("1.librarian 2.student 3.faculty 4.exit ");
            choice=input.nextByte();
            switch (choice)
            {
                case 1:


                    do{
                        System.out.println("enter choice");
                        System.out.println("1.add books 2.delete books 3.view books 4.issue books  5.view issued books 6.return books 7.exit" );
                        choice2=input.nextInt();

                        switch (choice2)
                        {
                            case 1:         //add books
                                System.out.println("Enter the bookname");
                                String bkname = input.next();
                                int f=0;
                                for(i=0;i<bookCount;i++)
                                {
                                    if(book[i].bookname.equals(bkname))
                                    {
                                        f=1;
                                        book[i].quantity++;
                                    }
                                }
                                if(f == 0)
                                {
                                    book[bookCount]= new books();
                                    book[bookCount].addbook(bkname);
                                    bookCount++;
                                }


                                break;
                            case 2:         // delete books
                                System.out.println("enter book name");        //delete book
                                temp=input.next();
                                index=-1;
                                for(i=0;i<bookCount;i++)
                                {
                                    if(book[i].bookname.equals(temp))
                                    {
                                        index=i;
                                    }
                                }
                                if(index!=-1) {
                                    for (i = index; i < bookCount - 1; i++) {
                                        book[i] = book[i + 1];

                                    }
                                    bookCount--;
                                }
                                else
                                    System.out.println("book not found");

                                break;

                            case 3:         // view Books
                                for(i=0;i<bookCount;i++)
                                {
                                    book[i].viewbook();
                                    System.out.println("");
                                }
                                break;
                            case 4:                 //issue book
                                int temp2;
                                {
                                    currentuser=-1;currnebook=-1;

                                    System.out.println("Enter 1-for Student or 2-for faculty");
                                    int choice1 = input.nextInt();
                                    if( choice1 == 1)
                                    {
                                        System.out.println("enter student id ");
                                        temp2=input.nextInt();
                                        for(i=0;i<stCount;i++)
                                        {
                                            if(students[i].getId()==temp2)
                                            {
                                                currentuser=i;
                                            }
                                        }

                                        System.out.println("enter book name");
                                        temp=input.next();
                                        for(i=0;i<bookCount;i++)
                                        {
                                            if(book[i].bookname.equals(temp) &&(book[i].quantity >=1))
                                            {
                                                currnebook=i;
                                            }
                                        }

                                        if(currentuser!=-1&&currnebook!=-1)
                                        {
                                            book[currnebook].issued=true;
                                            book[currentuser].quantity--;
                                            book[currnebook].issuedby=students[currentuser].getName();
                                            students[currentuser].issuebook();

                                            book[currentuser].issueDate=new Date();
                                        }
                                        else
                                            System.out.println("wrong choice");
                                    }
                                    else if (choice1 == 2)
                                    {
                                        System.out.println("enter faculty id ");
                                        temp2=input.nextInt();
                                        for(i=0;i<faCount;i++)
                                        {
                                            if(faculties[i].getId()==temp2)
                                            {
                                                currentuser=i;
                                            }
                                        }

                                        System.out.println("enter book name");
                                        temp=input.next();
                                        for(i=0;i<bookCount;i++)
                                        {
                                            if(book[i].bookname.equals(temp) &&(book[i].quantity>=1))
                                            {
                                                currnebook=i;
                                            }
                                        }

                                        if(currentuser!=-1&&currnebook!=-1)
                                        {
                                            book[currnebook].issued=true;
                                            book[currnebook].quantity--;
                                            book[currnebook].issuedby=faculties[currentuser].getName();
                                            faculties[currentuser].issuebook();

                                            book[currentuser].issueDate=new Date();
                                        }
                                        else
                                            System.out.println("wrong choice");
                                    }
                                    else break;

                                    break;
                                }

                            case 5:                  // view issued books
                                for(i=0;i<bookCount;i++)
                                {
                                    if(book[i].issued)
                                    {
                                        book[i].viewbook();
                                        book[i].getdue();
                                        System.out.println("");
                                    }
                                }
                                break;
                            case 6:                  //return book
                                currentuser=-1;currnebook=-1;
                                {
                                    System.out.println("Enter 1-for Student or 2-for faculty");
                                    int choice3 = input.nextInt();
                                    if(choice3 == 1)
                                    {
                                        System.out.println("enter student id ");
                                        temp2=input.nextInt();
                                        for(i=0;i<stCount;i++)
                                        {
                                            if(students[i].getId()==temp2)
                                            {
                                                currentuser=i;
                                            }
                                        }

                                        System.out.println("enter book name");
                                        temp=input.next();
                                        for(i=0;i<bookCount;i++)
                                        {
                                            if(book[i].bookname.equals(temp))
                                            {
                                                currnebook=i;
                                            }
                                        }

                                        if(currentuser!=-1&&currnebook!=-1)
                                        {
                                            book[currnebook].issued=false;
                                            book[currnebook].issuedby=null;
                                            students[currentuser].returnbook(temp);



                                        }
                                        else
                                            System.out.println("wrong choice");
                                        break;
                                    }
                                    else if(choice3 == 2)
                                    {
                                        System.out.println("enter faculty id ");
                                        temp2=input.nextInt();
                                        for(i=0;i<faCount;i++)
                                        {
                                            if(faculties[i].getId()==temp2)
                                            {
                                                currentuser=i;
                                            }
                                        }

                                        System.out.println("enter book name");
                                        temp=input.next();
                                        for(i=0;i<bookCount;i++)
                                        {
                                            if(book[i].bookname.equals(temp))
                                            {
                                                currnebook=i;
                                            }
                                        }

                                        if(currentuser!=-1&&currnebook!=-1)
                                        {
                                            book[currnebook].issued=false;
                                            book[currnebook].issuedby=null;
                                            faculties[currentuser].returnbook(temp);



                                        }
                                        else
                                            System.out.println("wrong choice");
                                        break;
                                    }
                                    else break;
                                }



                        }

                    }while(choice2!=7);

                    break;

                case 2:


                    do{
                        System.out.println("enter choice as student");
                        System.out.println("1.create account 2.view recently added book 3.search 5- view issued Books 4.exit" );
                        choice2=input.nextInt();
                        switch (choice2)
                        {
                            case 1:

                                System.out.println("NAME");
                                String name=input.next();
                                System.out.println("id");
                                int id=input.nextInt();
                                System.out.println("dept");

                                String dept=input.next();


                                students[stCount]= new student(name,dept,id);
                                stCount++;

                                break;
                            case 2:
                                book[bookCount-1].viewbook();

                                break;
                            case 3:
                                System.out.println("enter bookname ");               //search book
                                temp=input.next();
                                for(i=0;i<bookCount;i++)
                                {
                                    if(book[i].bookname.equals(temp)||book[i].publisher.equals(temp)||book[i].author.equals(temp))
                                    {
                                        book[i].viewbook();
                                        flag=1;
                                    }
                                }
                                if(flag==0)
                                {
                                    System.out.println("BOOK NOT FOUND");
                                }
                                break;

                            case 5:
                                {
                                    System.out.println("Enter student id");
                                    int tp2=input.nextInt();
                                    currentuser=-1;
                                    for(i=0;i<stCount;i++)
                                    {
                                        if(students[i].getId()==tp2)
                                        {
                                            currentuser=i;
                                        }
                                    }
                                    if(currentuser!= -1)
                                    {
                                        students[currentuser].viewissuedbooks();
                                    }
                                    else System.out.println("User not found");
                                    break;
                                }
                            case 4:
                                break;

                            default:
                                System.out.println("enter valid choice");
//
                        }
                    }while(choice2!=4);
                    break;

                case 3:
                    {

                        do{
                            System.out.println("enter choice as faculty");
                            System.out.println("1.create account 2.view recently added book 3.search 5-view Issued books 4.exit" );
                            choice2=input.nextInt();
                            switch (choice2)
                            {
                                case 1:

                                    System.out.println("NAME");
                                    String name=input.next();
                                    System.out.println("id");
                                    int id=input.nextInt();
                                    System.out.println("dept");

                                    String dept=input.next();

                                    faculties[faCount]=new faculty(name,dept,id);
                                    faCount++;

                                    break;
                                case 2:
                                    book[bookCount-1].viewbook();

                                    break;
                                case 3:
                                    System.out.println("enter bookname ");               //search book
                                    temp=input.next();
                                    for(i=0;i<bookCount;i++)
                                    {
                                        if(book[i].bookname.equals(temp)||book[i].publisher.equals(temp)||book[i].author.equals(temp))
                                        {
                                            book[i].viewbook();
                                            flag=1;
                                        }
                                    }
                                    if(flag==0)
                                    {
                                        System.out.println("BOOK NOT FOUND");
                                    }
                                    break;

                                case 5:
                                    {
                                        System.out.println("Enter faculty id");
                                        int tp2=input.nextInt();
                                        currentuser=-1;
                                        for(i=0;i<faCount;i++)
                                        {
                                            if(faculties[i].getId()==tp2)
                                            {
                                                currentuser=i;
                                            }
                                        }
                                        if(currentuser!= -1)
                                        {
                                            faculties[currentuser].viewissuedbooks();
                                        }
                                        else System.out.println("User not found");
                                        break;
                                    }
                                case 4:
                                    break;

                                default:
                                    System.out.println("enter valid choice");
//
                            }
                        }while(choice2!=4);
                        break;


                    }
                case 4:
                        break;

            }
        }while(choice!=4);

    }

}
