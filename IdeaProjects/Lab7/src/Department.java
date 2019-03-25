import java.util.Scanner;

import static java.lang.System.exit;

public interface Department {

    String deptName = "Computer_Science";
    String deptHead = "Alwyn";

    void printDeptName();
    void printDeptHead();

}

class Hostel {

    String hostelName, hostelLocation, numberOfRooms;

    public void printHostel(){
        System.out.println("\nHostel Name :" + hostelName + "\nHostel Location :" + hostelLocation + "\nNumber of rooms :" + numberOfRooms);
    }

}

class Student extends Hostel implements Department {

    String studentName, regNo, electiveCourse, avgMarks;

    public Student(String studentName, String regNo, String electiveCourse, String avgMarks, String hostelName, String hostelLocation, String numberOfRooms) {
        this.studentName = studentName;
        this.regNo = regNo;
        this.electiveCourse = electiveCourse;
        this.avgMarks = avgMarks;
        super.hostelName = hostelName;
        super.hostelLocation = hostelLocation;
        super.numberOfRooms = numberOfRooms;
    }

    public void display(){
        System.out.println("\nStudent Name :" + studentName + "\nRegistration No. :" + regNo + "\nElective Course :" + electiveCourse + "\nAverage Marks :" + avgMarks
                             + "\nHostel Name :" + hostelName + "\nHostel Location :" + hostelLocation + "\nNumber of rooms :" + numberOfRooms);
    }

    public void printDeptName(){
        System.out.println("\nDepartment Name :" + deptName);
    }

    public void printDeptHead(){
        System.out.println("\nDepartment Head :" + deptHead);
    }

}

class Test {
    public static void main(String [] args){
        Student[] a = new Student[20];
        String name, reg, elec, avg, hname, add, room;
        int i, j, n, r, cnt=0;
        Scanner in = new Scanner(System.in);
        for (i=0;i<20;i++){
            System.out.println("\nChoose : 1.Admit\t2.Migrate\t3.Display Details\t4.Exit");
            n = in.nextInt();
            switch (n){
                case 1 : {
                    cnt++;
                    System.out.println("Enter the details :\nName :");
                    name = in.next();
                    System.out.println("\nRegistration no. :");
                    reg = in.next();
                    System.out.println("\nElective course :");
                    elec = in.next();
                    System.out.println("\nAverage Marks :");
                    avg = in.next();
                    System.out.println("\nHostel Name :");
                    hname = in.next();
                    System.out.println("\nHostel Address :");
                    add = in.next();
                    System.out.println("\nNo. of rooms :");
                    room = in.next();
                    a[i] = new Student(name, reg, elec, avg, hname, add, room);
                    break;
                }
                case 2 : {
                    System.out.println("\nEnter the register no. to migrate :");
                    r = in.nextInt();
                    for(j=0;j<cnt;j++){
                        if((a[j].regNo).compareTo(String.valueOf(r)) == 0)
                        {
                            System.out.println("\nEnter Hostel Name :");
                            hname = in.next();
                            a[j].hostelName = hname;
                            System.out.println("\nEnter Hostel Address :");
                            add = in.next();
                            a[j].hostelLocation = add;
                            System.out.println("\nEnter No. of rooms :");
                            room = in.next();
                            a[j].numberOfRooms = room;
                        }else{
                            System.out.println("Student not found");
                        }
                    }
                    break;
                }
                case 3 : {
                    System.out.println("\nEnter the register no. of student to print :");
                    r = in.nextInt();
                    for(j=0;j<cnt;j++){
                        if((a[j].regNo).compareTo(String.valueOf(r)) == 0)
                        {
                            a[j].display();
                            a[j].printDeptName();
                            a[j].printDeptHead();
                        }else{
                            System.out.println("Student not found");
                        }
                    }
                    break;
                }
                case 4 : {
                    exit(0);
                    break;
                }
            }
        }
    }
}
