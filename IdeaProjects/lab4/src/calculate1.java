import java.util.*;

import java.util.Scanner;

class employee1 {
    int salary;
    String name;
    int designation;
    String department;
    int age;
    String email,dob;
    public employee1(int salary1,String name1,int designation1,String department1,int age1,String email1,String dob1)
    {
        salary=salary1;
        name=name1;
//        department=department1;
        designation=designation1;
        department=department1;

        //salary=salary1;
        age=age1;
        email=email1;
        dob=dob1;
    }
}
public class calculate1
{
    public static void main(String args[])
    {

        int n,s,des,a;
        String na;
        String dep;
        String e;
        String db;
        String temp1;
        System.out.println("enter number");
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        employee1[] arr=new employee1[n];
        // employee[] arr1=new employee[n];
        //employee1 temp;
        //System.out.println("enter salary, name, designation, department, age, email, date-of-birth");
        for(int i=0;i<n;i++) {
            System.out.println("enter salary, name, designation, department, age, email, date-of-birth");
           // temp1=input.nextLine();
            s = input.nextInt();
            temp1=input.nextLine();
            na = input.nextLine();
            des = input.nextInt();
            temp1=input.nextLine();
            dep = input.nextLine();
            a=input.nextInt();
            temp1=input.nextLine();
            e=input.nextLine();
            db=input.nextLine();
            //temp1=input.nextLine();
            arr[i] = new employee1(s, na, des, dep, a, e, db);
        }
        float[] avg=new float[n];
        float[] avg1=new float[n];
        for(int i=0;i<n;i++)                      // to calculate average of salary
        {
            int k=0;
            for(int j=0;j<n;j++)
            {

                if(arr[i].department==arr[j].department){
                    avg[i]=avg[i]+arr[j].salary;
                    k++;
                }
            }
            avg[i]=avg[i]/k;
            System.out.println(avg[i]);
        }
        float max=-1;
        int maxindex=0;
        for(int i=0;i<n;i++)              //department with max average salary
        {
            if(max<avg[i])
            {
                max=avg[i];
                maxindex=i;
            }
        }
        System.out.println("the department wth highest average salary is "+arr[maxindex].department);
        for(int i=0;i<n;i++)      //sorting
        {
            for(int j=0;j<n;j++)
            {
                if(arr[maxindex].department==arr[i].department)
                {
                    if(arr[i].salary<arr[j].salary)
                    {
                        employee1 temp = new employee1(arr[j].salary,arr[j].name,arr[j].designation,arr[j].department,arr[j].age,arr[j].email,arr[j].dob);
                        arr[j]=arr[i];
                        arr[i]=temp;

                    }
                }
            }
        }
        System.out.println("salary"+" "+"name"+"  "+"designation"+"   "+"department"+"    "+"age"+" "+"email"+" "+"date-of-birth");
        for(int i=0;i<n;i++)              // printing employees with highest salary
        {
            if(arr[maxindex].department.equals(arr[i].department))
            {
                System.out.println(arr[i].salary+"    "+arr[i].name+" "+arr[i].designation+"  "+arr[i].department+"   "+arr[i].age
                +"  "+arr[i].email+"    "+arr[i].dob);
            }
        }
        for(int i=0;i<n;i++)                      // to calculate average of age
        {
            int k=0;
            for(int j=0;j<n;j++)
            {

                if(arr[i].department==arr[j].department){
                    avg1[i]=avg1[i]+arr[j].age;
                    k++;
                }
            }
            avg1[i]=avg1[i]/k;
            //System.out.println(avg1[i]);
        }
        float min=100;
        int minindex=0;
        for(int i=0;i<n;i++)              //department with max average salary
        {
            if(min>avg1[i])
            {
                min=avg1[i];
                minindex=i;
            }
        }
        System.out.println("the department wth minimum average age is "+arr[minindex].department);
        for(int i=0;i<n;i++)      //sorting
        {
            for(int j=0;j<n;j++)
            {
                if(arr[minindex].department.equals(arr[i].department))
                {
                    if(arr[i].age>arr[j].age)
                    {
                        //employee1 temp=new employee1(arr[i].name,arr[i].salary,arr[i].desig,employee[i].dep,employee[i].email,employee[i].date,employee[i].month,employee[i].year);
                        employee1 temp = new employee1(arr[i].salary,arr[i].name,arr[i].designation,arr[i].department, arr[i].age,arr[i].email,arr[i].dob);
                        arr[i]=arr[j];
                        arr[j]=temp;

                    }
                }
            }
        }
        for(int i=0;i<n;i++)              // printing employees with highest salary
        {
            if(arr[minindex].department == arr[i].department)
            {
                System.out.println(arr[i].salary+" "+arr[i].name+" "+arr[i].designation+" "+arr[i].department+" "+arr[i].age+"  "+arr[i].email+"    "+arr[i].dob);
            }
        }

    }
}