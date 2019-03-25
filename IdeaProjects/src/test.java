import java.util.Date;
import java.util.Scanner;




class test
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
                                   case 1:
                                        book[bookCount]= new books();
                                        book[bookCount].addbook();
                                        bookCount++;

                                       break;
                                   case 2:
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

                                   case 3:
                                       for(i=0;i<bookCount;i++)
                                       {
                                           book[i].viewbook();
                                           System.out.println("");
                                       }
                                       break;
                                   case 4:                   //issue book
                                       currentuser=-1;currnebook=-1;

                                      System.out.println("enter student id ");
                                     int temp2=input.nextInt();
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
                                          book[currnebook].issued=true;
                                          book[currnebook].issuedby=students[currentuser].getName();
                                          students[currentuser].issuebook();

                                          book[currentuser].issueDate=new Date();
                                      }
                                      else
                                          System.out.println("wrong choice");

                                       break;
                                   case 5:
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

                           }while(choice2!=7);

                    break;

                case 2:


                    do{
                        System.out.println("enter choice");
                        System.out.println("1.create account 2.view recently added book 3.search 4.exit" );
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
                            case 4:
                                break;

                            default:
                                System.out.println("enter valid choice");
//
                        }
                    }while(choice2!=4);
                    break;

                case 3:

                case 4:


            }
        }while(choice!=4);














    }




}
