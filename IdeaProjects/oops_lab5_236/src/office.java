import java.util.Scanner;

class employee1
{
    String name;
    int salary;
    void input()
    {
        System.out.println("enter name salary");
        Scanner input=new Scanner(System.in);
        name=input.nextLine();
        salary=input.nextInt();
    }
}
class manager1 extends employee1
{
    String dep;
    void input()
    {
        super.input();
        System.out.println("enter department");
        Scanner input=new Scanner(System.in);
        dep=input.nextLine();
    }
    void print()
    {
        System.out.println("name "+name+" salary "+salary+" department "+dep);
    }
}
class Executive extends manager1
{
    void input()
    {
        System.out.println("enter executive details");
        super.input();
    }
    void print()
    {
        System.out.println("details are");
        super.print();
    }
}
public class office {
    public static void main(String args[])
    {
        Executive exe=new Executive();
        exe.input();
        exe.print();
    }
}
