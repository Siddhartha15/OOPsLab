import java.util.Scanner;

class Rectangle11 {
    double length,width;
    String colour;
    void set_length()
    {
        System.out.println("enter length");
        Scanner input=new Scanner(System.in);
        length=input.nextDouble();
    }
    void set_width()
    {
        System.out.println("enter width");
        Scanner input=new Scanner(System.in);
        width=input.nextDouble();
    }
    void set_colour()
    {
        System.out.println("enter colour");
        Scanner input =new Scanner(System.in);
        colour=input.nextLine();
    }
    double find_area()
    {
        double area;
        area=length*width;
        return area;
    }
}
public class Rectangle
{
    public static void main(String args[])
    {
        Rectangle11 n1=new Rectangle11();
        System.out.println("enter details of r1");
        n1.set_length();
        n1.set_width();
        n1.set_colour();
        System.out.println("enter details of r2");
        Rectangle11 r2=new Rectangle11();
        r2.set_length();
        r2.set_width();
        r2.set_colour();
        if(n1.find_area() == r2.find_area() && (n1.colour.compareTo(r2.colour)==0))
        {
            System.out.println("matching");
        }
        else
        {
            System.out.println("not matching");
        }
    }
}