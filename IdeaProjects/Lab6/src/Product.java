import java.util.Scanner;

public class Product {
    private String itemName;
    private int unitPrice;

    Product(){
        itemName = "no_product";
        unitPrice = 0;
    }

    Product(String s, int i){
        itemName = s;
        unitPrice = i;
    }

    public int getPrice(){
        return unitPrice;
    }

    public String toString(){
        return (itemName+" @$"+unitPrice+"/-  ");
    }
}

class WeightedProduct extends Product{
    private int weight;

    WeightedProduct(String itemName, int unitPrice, int weight){
        super(itemName, unitPrice);
        this.weight = weight;
    }

    @Override
    public int getPrice(){
        return (weight * super.getPrice());
    }

    @Override
    public String toString(){
        return (super.toString()+""+weight+" Kgs $"+this.getPrice()+"/-");
    }
}

class CountedProduct extends Product{
    private int quantity;

    CountedProduct(String itemName, int unitPrice, int quantity){
        super(itemName, unitPrice);
        this.quantity = quantity;
    }

    @Override
    public int getPrice(){
        return (quantity * super.getPrice());
    }

    @Override
    public String toString(){
        return (super.toString()+""+quantity+" units $"+this.getPrice()+"/-");
    }
}

class Test{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the itemName, unitPrice and Weight : ");
        String s = in.next();
        int price = in.nextInt();
        int wt = in.nextInt();
        Product p1 = new WeightedProduct(s, price, wt);
        System.out.println("Price : "+p1.getPrice()+" String : "+p1.toString());

        System.out.println("Enter the itemName, unitPrice and Quantity : ");
        s = in.next();
        price = in.nextInt();
        int q = in.nextInt();
        Product p2 = new CountedProduct(s, price, q);
        System.out.println("Price : "+p2.getPrice()+" String : "+p2.toString());
    }
}
