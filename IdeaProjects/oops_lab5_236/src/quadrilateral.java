import java.util.Scanner;

class info
{
    int base, height;
    void input() {
        System.out.println("enter base and height");
//        int base, height;
        Scanner scan=new Scanner(System.in);
        base=scan.nextInt();
        height=scan.nextInt();
    }
}
class trapezium extends info
{
    void input()
    {
        super.input();
        System.out.println("enter the other base");
        int base2;
        Scanner scan=new Scanner(System.in);
        base2=scan.nextInt();
        double area=0.5*(base2+base)*height;
        System.out.println("area is "+area);
    }
}
class parallelogram extends info
{
    void input()
    {
        super.input();
//        System.out.println("enter the other base");
//        int base2;
//        Scanner scan=new Scanner(System.in);
//        base2=scan.nextInt();
        double area=base*height;
        System.out.println("area is "+area);
    }
}
class rectangle extends info
{
    void input()
    {
        super.input();
//        System.out.println("enter the other base");
//        int base2;
//        Scanner scan=new Scanner(System.in);
//        base2=scan.nextInt();
        double area=base*height;
        System.out.println("area is "+area);
    }
}
class square extends info
{
    void input()
    {
        super.input();
//        System.out.println("enter the other base");
//        int base2;
//        Scanner scan=new Scanner(System.in);
//        base2=scan.nextInt();
        double area=base*height;
        System.out.println("area is "+area);
    }
}
//class trapezium
//{
//    int x1,x2,x3,x4;
//    int y1,y2,y3,y4;
//    void area()
//    {
//        double a;
//        System.out.println("enter the vertices x coordinates followed by y coordinates");
//        Scanner input=new Scanner(System.in);
//        x1=input.nextInt();
//        x2=input.nextInt();
//        x3=input.nextInt();
//        x4=input.nextInt();
//        y1=input.nextInt();
//        y2=input.nextInt();
//        //y3=input.nextInt();
//        //y4=input.nextInt();
//        a=0.5*((x2-x1)+(x4-x3))*(y2-y1);
//        System.out.println("area is "+a);
//    }
//}
//
//class parallelogram
//{
//    int x1,x2,x3,x4;
//    int y1,y2;
//    void area()
//    {
//        double a;
//        System.out.println("enter the vertices x coordinates followed by y coordinates");
//        Scanner input=new Scanner(System.in);
//        x1=input.nextInt();
//        x2=input.nextInt();
//        x3=input.nextInt();
//        x4=input.nextInt();
//        y1=input.nextInt();
//        y2=input.nextInt();
//        //y3=input.nextInt();
//        //y4=input.nextInt();
//        a=(x2-x1)*(y2-y1);
//        System.out.println("area is "+a);
//    }
//}
//class rectangle
//{
//    int x1,x2,x3,x4;
//    int y1,y2,y3,y4;
//    void area()
//    {
//        double a;
//        System.out.println("enter the vertices x coordinates followed by y coordinates");
//        Scanner input=new Scanner(System.in);
//        x1=input.nextInt();
//        x2=input.nextInt();
//        x3=input.nextInt();
//        x4=input.nextInt();
//        y1=input.nextInt();
//        y2=input.nextInt();
//        //y3=input.nextInt();
//        //y4=input.nextInt();
//        a=((x2-x1)*(y2-y1));
//        System.out.println("area is "+a);
//    }
//}
//class square
//{
//    int x1,x2,x3,x4;
//    int y1,y2;
//    void area()
//    {
//        double a;
//        System.out.println("enter the vertices x coordinates followed by y coordinates");
//        Scanner input=new Scanner(System.in);
//        x1=input.nextInt();
//        x2=input.nextInt();
//        x3=input.nextInt();
//        x4=input.nextInt();
//        y1=input.nextInt();
//        y2=input.nextInt();
//        //y3=input.nextInt();
//        //y4=input.nextInt();
//        a=((x2-x1)*(x2-x1));
//        System.out.println("area is "+a);
//    }
//
//}
public class quadrilateral {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter ur choice");
        trapezium obj1=new trapezium();
        parallelogram obj2=new parallelogram();
        rectangle obj3=new rectangle();
        square obj4=new square();
        int ch;
        do{
            ch=input.nextInt();
            switch (ch)
            {
                case 1: obj1.input();break;
                case 2: obj2.input(); break;
                case 3: obj3.input(); break;
                case 4: obj4.input(); break;
            }
            System.out.println("enter 1,2,3,4 to continue 5 to exit");
        }while(ch!=5);
    }
}
