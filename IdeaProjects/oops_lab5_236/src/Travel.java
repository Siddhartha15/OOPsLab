import java.util.Scanner;
class Info{
    String name,sdate,place,rdate;
    void input(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter details name,starting date,place,visit date");
        name=scan.nextLine();
        sdate=scan.nextLine();
        place=scan.nextLine();
        rdate=scan.nextLine();
    }
    void output(){
        System.out.println("Display details:");
        System.out.println("Name "+name+" Start place "+sdate+ " Visit place "+place+" Date "+rdate);
    }
}
class Base{
    Info[] info;
    int n;
    Base(int m){
        n=m;
        info=new Info[n];
        System.out.println("Constructor");
    }
    void enter(){
        for(int i=0;i<n;i++){
            info[i]=new Info();
            info[i].input();
        }
    }
    void display(Info i){
        //System.out.println("Display Base Class details");
        i.output();
    }
}
class MoreInfo{
    int age;
    void input(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Age details");
        age=scan.nextInt();
    }
    void output(){
        System.out.println("Display Age  "+age);
    }
}
class derived extends Base{
    MoreInfo[] moreInfo;
    int n;
    derived(int m){
        super(m);
        n=m;
        moreInfo=new MoreInfo[n];
    }
    void enter(){
        super.enter();
        for(int i=0;i<n;i++){
            moreInfo[i]=new MoreInfo();
            moreInfo[i].input();
        }
    }
    void display(){
        //System.out.println("Display Derived Class Details");
        //super.display();
        for(int i=0;i<n;i++){
            if(moreInfo[i].age<12){
                super.display(super.info[i]);
                moreInfo[i].output();
            }

        }
    }
}
public class Travel {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n;
        System.out.println("Enter no. of passengers ");
        n=scan.nextInt();

        derived d1=new derived(n);
        d1.enter();
        d1.display();
    }
}
