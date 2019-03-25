import java.util.Scanner;

class Rectangle extends shape
{
    void print()
{
    shape f=new Rectangle();
    Scanner input=new Scanner(System.in);
    System.out.println("enter lenght and breadth");
    f.a=input.nextInt();
    f.b=input.nextInt();
    System.out.println("area of rectangle is"+f.a*f.b);
}
}
class circle extends shape
{
    void print()
    {
        shape c=new circle();
        Scanner input=new Scanner(System.in);
        System.out.println("enter radius");
        c.a=input.nextInt();
        //f.b=input.nextInt();
        System.out.println("area of circle is"+3.14*c.a*c.a);
    }

}
class triangle extends shape
{
    void print()
    {
        shape d=new triangle();
        Scanner input=new Scanner(System.in);
        System.out.println("enter base and height");
        d.a=input.nextInt();
        d.b=input.nextInt();
        System.out.println("Area of triangle is "+0.5*d.a*d.b);

    }
}
abstract class shape {
    int a,b;
//    Scanner input=new Scanner(System.in);
//    a=input.nextInt();
//    b=input.nextInt();
    abstract void print();
}
class New
        {
            public static void main(String args[])
        {
            shape s =new Rectangle();
            s.print();
            shape g=new circle();
            g.print();
            shape r=new triangle();
            r.print();

        }
        }