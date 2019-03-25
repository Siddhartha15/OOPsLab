import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//public static String getFileExtension(String fullName) {
//        checkNotNull(fullName);
//        String fileName = new File(fullName).getName();
//        int dotIndex = fileName.lastIndexOf('.');
//        return (dotIndex == -1) ? "" : fileName.substring(dotIndex + 1);
//        }

public class program {
    public static void main(String args[]) throws IOException {
        Scanner input = new Scanner(System.in);
        String filename = input.nextLine();
        File file1 = new File(filename);
        if (file1.exists()) {
            System.out.println("file exists");
        } else {
            System.out.println("file do not exists");
        }
        if (file1.canRead()) {
            System.out.println(file1.getAbsolutePath() + " can read");
        } else {
            System.out.println(file1.getAbsolutePath() + " cannot read");
        }
        if (file1.canWrite()) {
            System.out.println(file1.getAbsolutePath() + " can write");
        } else {
            System.out.println(file1.getAbsolutePath() + " cannot write");
        }
        System.out.println("file length " + file1.length());
        System.out.println("file is of type " + getFileExtension(file1));
    }

    private static String getFileExtension(File file) {
        String fileName = file.getName();
        if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            return fileName.substring(fileName.lastIndexOf(".") + 1);
        else return "";
    }
}
