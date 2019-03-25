import java.util.Scanner;

public class Complex {
    int real, imaginary;

    public void add(int r1, int i1, int r2, int i2){
        int resr,resi;
        resr = r1+r2;
        resi = i1+i2;
        System.out.println("The result is :"+resr+"+"+resi+"i\n");
    }

    public static void main(String []args){
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        Complex result = new Complex();

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the real and imaginary nos. for complex no. 1 : ");
        c1.real = in.nextInt();
        c1.imaginary = in.nextInt();
        System.out.println("Enter the real and imaginary nos. for complex no. 2 : ");
        c2.real = in.nextInt();
        c2.imaginary = in.nextInt();

        result.add(c1.real, c1.imaginary, c2.real, c2.imaginary);
    }
}
