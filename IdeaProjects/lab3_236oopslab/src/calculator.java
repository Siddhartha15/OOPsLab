import java.util.Scanner;
import java.lang.String;

public class calculator {
    public static void main(String args[])
    {
        System.out.println("enter the numbers");
        System.out.println("enter the operator");
        Scanner input=new Scanner(System.in);
        //int n=input.nextInt();
        //int m=input.nextInt();
        int ch;
        //char c=input.next().charAt(0);
        float res=0;
        do {
            int n=input.nextInt();
            int m=input.nextInt();
            char c=input.next().charAt(0);
            switch (c) {
                case '+':
                    res = m + n;
                    break;
                case '-':
                    res = m - n;
                    break;
                case '/':
                    res = m / n;
                    break;
                case '*':
                    res = m * n;
                    break;
            }
            System.out.println("result is" +res);
            System.out.println("enter 1 to continue");
            ch=input.nextInt();
        }while(ch==1);
       // System.out.println("result is" +res);
    }
}
