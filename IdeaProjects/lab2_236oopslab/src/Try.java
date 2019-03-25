import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Try {
public static void main(String args[]) throws IOException
{
     File file=new File("/home/student/Desktop/file.txt");
     file.createNewFile();
     System.out.println(file);
    FileWriter fileWriter=new FileWriter(file);
    System.out.println("enter message");
    Scanner input=new Scanner(System.in);
    String a=input.nextLine();
    fileWriter.write(a);
    fileWriter.close();

}
}
