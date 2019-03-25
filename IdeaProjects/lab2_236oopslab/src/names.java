import java.util.Scanner;

public class names {
    public static void main(String args[]) {
        System.out.println("enter names");
        String[] a = new String[20];
        String temp;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            a[i] = input.nextLine();
        }
        int ch;
        System.out.println("enter ur choice 1.Ascending 2.descending");
//        int n = input.nextInt();
        do {
            int n = input.nextInt();
            switch (n) {
                case 1:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 1; j < 5; j++) {
                            if (a[j - 1].compareTo(a[j]) > 0) {
                                temp = a[j - 1];
                                a[j - 1] = a[j];
                                a[j] = temp;
                            }
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 1; j < 5; j++) {
                            if (a[j - 1].compareTo(a[j]) < 0) {
                                temp = a[j - 1];
                                a[j - 1] = a[j];
                                a[j] = temp;
                            }
                        }
                    }
                    break;
            }
            for (int i = 0; i < 5; i++) {
                System.out.println(a[i]);
            }
            System.out.println("enter 1 to continue else 0");
            ch=input.nextInt();
        }while(ch==1);
    }
}
