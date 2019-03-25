import java.util.Scanner;

public class Sample {
    String a;
    public Sample()
    {
        System.out.println("enter message");
        Scanner input=new Scanner(System.in);
        a=input.nextLine();
    }
    public static void main(String args[])
    {
        Sample obj=new Sample();
        System.out.println("message is "+obj.a);
    }
}
