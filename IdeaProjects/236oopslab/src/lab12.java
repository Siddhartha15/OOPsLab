//

import java.util.Scanner;
import java.util.Stack;

public class lab12 {
     static void stackpush(Stack<Integer> stack) {
        System.out.println("enter the number");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        stack.push(n);
        /*for(int i=0;i<5;i++)
        {
            stack.push(i);
        }*/
    }

     static void stackpop(Stack<Integer> stack) {
        int n = stack.pop();
        System.out.println(n);
    }

     static void stacktraverse(Stack<Integer> stack) {

        System.out.println("   ");
        while (stack.empty() != true) {
            int n = stack.pop();
            System.out.println(n);
        }
    }

    public static void main(String args[])
    {
        int ch;
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("enter 1 for push");
        System.out.println("2 for pop");
        System.out.println("3 for traversing");
        System.out.println("4 for exit");
        do {
            Scanner scan = new Scanner(System.in);
            ch = scan.nextInt();
            switch (ch) {
                case 1:
                    stackpush(stack);
                    break;
                case 2:
                    stackpop(stack);
                    break;
                case 3:
                    stacktraverse(stack);
                    break;
            }
        } while (ch != 4);

    }
}
