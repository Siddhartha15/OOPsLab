import java.util.Scanner;

class tollbooth {
static int number;
static double amt;
tollbooth()
{
  number =0;
  amt=0;
}
static void payingvehicle()
{
    number++;
    amt=amt+50;
}
static void nonpayingvehicle()
{
    number++;
}
static void display()
{
    System.out.println("paying amout "+amt+"vehicle " +number);
    //System.out.println("non paying "+number);
}
}
public class new1
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int n;
        do {
            System.out.println("enter 1 for paying 2 for non paying vehicles");
            n=input.nextInt();
            switch (n)
            {
                case 1: tollbooth.payingvehicle();
                break;
                case 2:tollbooth.nonpayingvehicle();
                break;
            }

        }while(n!=3);
        tollbooth.display();
    }
}