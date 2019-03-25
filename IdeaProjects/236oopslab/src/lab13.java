//import java.util.*;
import java.util.Scanner;

public class lab13 {
    static int front,rear;
    static int queue[];
    public lab13(int n){
        rear=-1;
        front=-1;
        queue=new int[n];
    }
    static void enq(int size)
    {
        if(rear==size-1)
        {
            System.out.println("queue is full");
        }
        else if(rear==-1)
        {
            System.out.println("enter number");
            rear++;
            front++;
            Scanner scan=new Scanner(System.in);
            int n=scan.nextInt();
            queue[rear]=n;
        }
        else
        { System.out.println("enter number");
            rear++;
            Scanner scan=new Scanner(System.in);
            int n=scan.nextInt();
            queue[rear]=n;


        }
    }
    static void deq()
    {
        if (rear==-1)
        {
            System.out.println("Queue is empty");
        }
        else if(rear==front)
        {
            System.out.println("Queue is empty");
        }
        else
        {
            int n=queue[front];
            System.out.println(n);
            front++;
        }
    }
    static void traverse()
    {
        for (int i=front;i<=rear;i++)
        {
            System.out.println(queue[i]);
        }
    }
    public static void main(String args[])
    {
        int ch,n1;

        System.out.println("enter size of queue");
        Scanner scan=new Scanner(System.in);
        n1=scan.nextInt();
        lab13 queue=new lab13(n1);
        System.out.println("enter 1 for enq");
        System.out.println("2 for deq");
        System.out.println("3 for traversing");
        System.out.println("4 for exit");
        do {
            /*Scanner scan=new Scanner(System.in);*/
            ch = scan.nextInt();
            switch (ch) {
                case 1:
                    queue.enq(n1);
                    break;
                case 2:
                    queue.deq();
                    break;
                case 3:
                    queue.traverse();
                    break;
            }
        } while (ch != 4);

        }
}

