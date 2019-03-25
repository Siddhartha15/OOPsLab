import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.Scanner;

class Product{
    String id,prod_name;
    int quantity;
    double price;
    Product(){
        id="";prod_name="";quantity=0;price=0;
    }
    void set(){
        System.out.println("Enter Product info:");
        Scanner scan=new Scanner(System.in);
        id=scan.nextLine();
        prod_name=scan.nextLine();
        quantity=scan.nextInt();
        price=scan.nextDouble();
    }
    void get(){
        System.out.println("id:"+id+" prod_name: "+prod_name+" quantity: "+quantity+" price: "+price);
    }
    double getProductAmount(){
        if(quantity<0)
            quantity=0;
        if(price<0)
            price=0.0;
        return quantity*price;
    }
}
class Bakery extends Product{
    String item,expiry,company;
    Bakery(){
        super();
        item="";expiry="";company="";
    }
    void setCategoryDetails(){
        super.set();
        System.out.println("Enter Bakery Product info:");
        Scanner scan=new Scanner(System.in);
        item=scan.nextLine();
        expiry=scan.nextLine();
        company=scan.nextLine();
    }
}
class PersonalCare extends Product{
    String item,expiry,company;
    PersonalCare(){
        super();
        item="";expiry="";company="";
    }
    void setCategoryDetails(){
        super.set();
        System.out.println("Enter PersonalCare Product info:");
        Scanner scan=new Scanner(System.in);
        item=scan.nextLine();
        expiry=scan.nextLine();
        company=scan.nextLine();
    }
}
class ElectricalProducts extends Product{
    String item,expiry,company;
    ElectricalProducts(){
        super();
        item="";expiry="";company="";
    }
    void setCategoryDetails(){
        super.set();
        System.out.println("Enter Electrical Product info:");
        Scanner scan=new Scanner(System.in);
        item=scan.nextLine();
        expiry=scan.nextLine();
        company=scan.nextLine();
    }
}
class Grocery extends Product{
    String item,expiry,company;
    Grocery(){
        super();
        item="";expiry="";company="";
    }
    void setCategoryDetails(){
        super.set();
        System.out.println("Enter Grocery Product info:");
        Scanner scan=new Scanner(System.in);
        item=scan.nextLine();
        expiry=scan.nextLine();
        company=scan.nextLine();
    }
}
public class productTest {

    static void sort(String category,Bakery bake[],PersonalCare pc[],ElectricalProducts e[],Grocery g[]) {
        if (category.compareToIgnoreCase("Bakery") == 0) {
            for (int i = 0; i < bake.length; i++) {
                for (int j = 0; j < bake.length; j++) {
                    if (bake[j].getProductAmount() > bake[i].getProductAmount()) {
                        Bakery temp = bake[i];
                        bake[i] = bake[j];
                        bake[j] = temp;
                    }
                }
            }
            System.out.println("TotalAmount Sorted Bakery Details:");
            for (int i = 0; i < bake.length; i++) {
                System.out.println("id:" + bake[i].id + " prod_name: " + bake[i].prod_name + " quantity: " + bake[i].quantity +" company: " + bake[i].company+" TotalAmount: "+bake[i].getProductAmount());
            }
        }
        else if(category.compareToIgnoreCase("PersonalCare")==0){
            for(int i=0;i<pc.length;i++){
                for(int j=0;j<pc.length;j++){
                    if(pc[j].getProductAmount()>pc[i].getProductAmount()){
                        PersonalCare temp=pc[i];pc[i]=pc[j];pc[j]=temp;
                    }
                }
            }
            System.out.println("TotalAmount Sorted PersonalCare Details:");
            for(int i=0;i<pc.length;i++){
                System.out.println("id:" + pc[i].id + " prod_name: " + pc[i].prod_name + " quantity: " + pc[i].quantity +" company: " + pc[i].company+" TotalAmount: "+pc[i].getProductAmount());
            }
        }
        else if(category.compareToIgnoreCase("ElectricalProducts")==0){
            for(int i=0;i<e.length;i++){
                for(int j=0;j<e.length;j++){
                    if(e[j].getProductAmount()>e[i].getProductAmount()){
                        ElectricalProducts temp=e[i];e[i]=e[j];e[j]=temp;
                    }
                }
            }
            System.out.println("TotalAmount Sorted ElectricalProducts Details:");
            for(int i=0;i<e.length;i++){
                System.out.println("id:" + e[i].id + " prod_name: " + e[i].prod_name + " quantity: " + e[i].quantity +" company: " + e[i].company+" TotalAmount: "+e[i].getProductAmount());
            }
        }
        else if(category.compareToIgnoreCase("Grocery")==0){
            for(int i=0;i<g.length;i++){
                for(int j=0;j<g.length;j++){
                    if(g[j].getProductAmount()>g[i].getProductAmount()){
                        Grocery temp=g[i];g[i]=g[j];g[j]=temp;
                    }
                }
            }
            System.out.println("TotalAmount Sorted Grocery Details:");
            for(int i=0;i<g.length;i++){
                System.out.println("id:" + g[i].id + " prod_name: " + g[i].prod_name + " quantity: " +g[i].quantity +" company: " + g[i].company+" TotalAmount: "+g[i].getProductAmount());
            }
        }
    }

    static void DisplayCategoryItems(String category,Bakery bake[],PersonalCare pc[],ElectricalProducts e[],Grocery g[]){
        if(category.compareToIgnoreCase("Bakery")==0){
            for(int i=0;i<bake.length;i++){
                for(int j=0;j<bake.length;j++){
                    if(bake[j].quantity<bake[i].quantity){
                        Bakery temp=bake[i];bake[i]=bake[j];bake[j]=temp;
                    }
                }
            }
            System.out.println("Sorted Bakery Details:");
            for(int i=0;i<bake.length;i++){
                bake[i].get();
                System.out.println("item:"+bake[i].item+" expiry: "+bake[i].expiry+" company: "+bake[i].company);
            }
        }
        else if(category.compareToIgnoreCase("PersonalCare")==0){
            for(int i=0;i<pc.length;i++){
                for(int j=0;j<pc.length;j++){
                    if(pc[j].quantity<pc[i].quantity){
                       PersonalCare temp=pc[i];pc[i]=pc[j];pc[j]=temp;
                    }
                }
            }
            System.out.println("Sorted PersonalCare Details:");
            for(int i=0;i<pc.length;i++){
                pc[i].get();
                System.out.println("item:"+pc[i].item+" expiry: "+pc[i].expiry+" company: "+pc[i].company);
            }
        }
        else if(category.compareToIgnoreCase("ElectricalProducts")==0){
            for(int i=0;i<e.length;i++){
                for(int j=0;j<e.length;j++){
                    if(e[j].quantity<e[i].quantity){
                        ElectricalProducts temp=e[i];e[i]=e[j];e[j]=temp;
                    }
                }
            }
            System.out.println("Sorted ElectricalProduct Details:");
            for(int i=0;i<e.length;i++){
                e[i].get();
                System.out.println("item:"+e[i].item+" expiry: "+e[i].expiry+" company: "+e[i].company);
            }
        }
        else if(category.compareToIgnoreCase("Grocery")==0){
            for(int i=0;i<g.length;i++){
                for(int j=0;j<g.length;j++){
                    if(g[j].quantity<g[i].quantity){
                        Grocery temp=g[i];g[i]=g[j];g[j]=temp;
                    }
                }
            }
            System.out.println("Sorted Grocery Details:");
            for(int i=0;i<g.length;i++){
                g[i].get();
                System.out.println("item:"+g[i].item+" expiry: "+g[i].expiry+" company: "+g[i].company);
            }
        }
    }
    public static void main(String args[]){
        int AvgQuantity[]=new int[4];
        for(int i=0;i<3;i++)
            AvgQuantity[i]=0;

        //Bakery info
        Bakery bake[];int b;String ch;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter bakery products size:");
        b=scan.nextInt();
        //System.out.println("b="+b);
        ch=scan.nextLine();
        bake=new Bakery[b];
        for(int i=0;i<b;i++){
            System.out.println("Enter bakery products details:");
            bake[i]=new Bakery();
            bake[i].setCategoryDetails();
            AvgQuantity[0]+=bake[i].quantity;
        }
        AvgQuantity[0]/=b;

        //PersonalCare info
       PersonalCare pc[];int p;
        System.out.println("Enter PersonalCare products size:");
        p=scan.nextInt();
        System.out.println("p="+p);
        ch=scan.nextLine();
        pc=new PersonalCare[p];
        for(int i=0;i<b;i++){
            System.out.println("Enter PersonalCare products details:");
            pc[i]=new PersonalCare();
            pc[i].setCategoryDetails();
            AvgQuantity[1]+=pc[i].quantity;
            System.out.println("Press Enter");ch=scan.nextLine();
        }
        AvgQuantity[1]/=p;

        //Electrical info
        ElectricalProducts e[];int el;
        System.out.println("Enter Electrical products size:");
        el=scan.nextInt();
        System.out.println("el="+el);
        ch=scan.nextLine();
        e=new ElectricalProducts[el];
        for(int i=0;i<el;i++){
            System.out.println("Enter Electrical products details:");
            e[i]=new ElectricalProducts();
            e[i].setCategoryDetails();
            AvgQuantity[2]+=e[i].quantity;
            System.out.println("Press Enter");ch=scan.nextLine();
        }
        AvgQuantity[2]/=el;

        //Grocery info
        Grocery g[];int gr;
        System.out.println("Enter Grocery products size:");
        gr=scan.nextInt();
        System.out.println("gr="+gr);
        ch=scan.nextLine();
        g=new Grocery[gr];
        for(int i=0;i<gr;i++){
            System.out.println("Enter Grocery products details:");
            g[i]=new Grocery();
            g[i].setCategoryDetails();
            AvgQuantity[3]+=g[i].quantity;
            System.out.println("Press Enter");ch=scan.nextLine();
        }
        AvgQuantity[3]/=gr;

        System.out.println("Enter Category choise:");
        String choise=scan.nextLine();
        DisplayCategoryItems(choise,bake,pc,e,g);

        System.out.println("AvgQuantity[0]="+AvgQuantity[0]);
        System.out.println("AvgQuantity[1]="+AvgQuantity[1]);
        System.out.println("AvgQuantity[2]="+AvgQuantity[2]);
        System.out.println("AvgQuantity[3]="+AvgQuantity[3]);
        int max=0;
        for(int l=1;l<4;l++){
            if(AvgQuantity[l]>AvgQuantity[max])
                max=l;
        }
        System.out.println("max="+max);
        switch(max) {
            case 0:
                sort("Bakery", bake, pc, e, g);
                break;
            case 1:
                sort("PersonalCare", bake, pc, e, g);
                break;
            case 2:
                sort("ElectricalProducts", bake, pc, e, g);
                break;
            case 3:
                sort("Grocery", bake, pc, e, g);
                break;
        }
    }
}
