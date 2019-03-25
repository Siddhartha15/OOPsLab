import java.util.Scanner;

public class Vehicle {

    protected String regNumber, mileage, color, ownerName;

    public void showData() {
        System.out.println("This is a vehicle class\n");
    }

}

class Bus extends Vehicle {

    private String routeNumber;

    public Bus(String regNumber, String mileage, String color, String ownerName, String routeNumber) {
        this.regNumber = regNumber;
        this.mileage = mileage;
        this.color = color;
        this.ownerName = ownerName;
        this.routeNumber = routeNumber;
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Details : \n\tRegistration No. : " +regNumber + "\n\tMileage : " + mileage + "\n\tColor : " + color + "\n\tOwner Name : " + ownerName + "\n\tRoute No. : " + routeNumber);
    }
}

class Car extends Vehicle {

    private String manufacturerName;

    public Car(String regNumber, String mileage, String color, String ownerName, String manufacturerName) {
        this.regNumber = regNumber;
        this.mileage = mileage;
        this.color = color;
        this.ownerName = ownerName;
        this.manufacturerName = manufacturerName;
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Details : \t Registration No. : " +regNumber + "\n\tMileage : " + mileage + "\n\tColor : " + color + "\n\tOwner Name : " + ownerName + "\n\tManufacturer Name : " + manufacturerName);
    }
}

class TestClass {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter the details of the vehicle : ");
        String reg = in.next();
        String mile = in.next();
        String col = in.next();
        String own = in.next();
        System.out.println("\nEnter the bus route : ");
        String route = in.next();
        Vehicle b = new Bus(reg, mile, col, own, route);
        b.showData();
        System.out.println("\nEnter the car Manufacturer : ");
        String man = in.next();
        Vehicle c = new Car(reg, mile, col, own, man);
        c.showData();
    }
}
