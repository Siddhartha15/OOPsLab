import java.io.*;
import java.util.Scanner;

class studentdetails {

    String name;
    int marks1,marks2,marks3,rollno;
     studentdetails()
    {
        name="";
        marks1=0;
        marks2=0;
        marks3=0;
        rollno=0;
    }
  studentdetails(String n1,int m1,int m2,int m3,int roll1) {
        name = n1;
        marks1 = m1;
         marks2 = m2;
        marks3 = m3;
       rollno = roll1;
    }
     studentdetails(studentdetails s2)
    {
        name=s2.name;
        marks1=s2.marks1;
        marks2=s2.marks2;
        marks3=s2.marks3;
        rollno=s2.rollno;
    }
     void display()
    {
//        studentdetails s1=new studentdetails();
      System.out.println("Name "+name);
        System.out.println("Roll No "+rollno);
        System.out.println("Marks1 "+marks1);
        System.out.println("Marks 2"+marks2);
        System.out.println("Marks3"+marks3);
        System.out.println("Rollno"+rollno);
    }
}
public class students
{
    public static void main(String args[])
    {
        studentdetails s=new studentdetails();
        System.out.println("null constructor ");
        s.display();
        Scanner input=new Scanner(System.in);
        String a=input.nextLine();
        int n1=input.nextInt();
        int n2=input.nextInt();
        int n3=input.nextInt();
        int rollno1=input.nextInt();

        System.out.println("parameterised");
        studentdetails s3=new studentdetails(a,n1,n2,n3,rollno1);//"rohan",47,48,49,8);
//        System.out.println("parameterised");
        s3.display();
        studentdetails s4=new studentdetails(s3);
        System.out.println("copy constructor");
        s4.display();
    }
}