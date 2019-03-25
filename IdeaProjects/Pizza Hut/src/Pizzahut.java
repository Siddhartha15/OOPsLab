

public class Pizzahut
{
    int itemNo;
    String itemName;
    double calorie;
    double protein;
    double fat;
    double carbohydrates;
    double price;
    String comboOffer;
    double acCharges;
    double deliveryCharges;
    int isAC;
    int isSitIn;
    int isDeliverable;
    int comboTaken;
    public Pizzahut()
    {
        itemNo = 0;
        itemName = "";
        calorie = 0;
        protein = 0;
        fat = 0;
        carbohydrates = 0;
        price = 0;
        comboOffer = "";
        acCharges = 0;
        deliveryCharges = 0;
        isAC = 0;
        isSitIn = 0;
        isDeliverable = 0;
        comboTaken = 0;
    }

    public int getComboTaken() {
        return comboTaken;
    }

    public void setComboTaken(int comboTaken) {
        this.comboTaken = comboTaken;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }
    public double getCalorie() {
        return calorie;
    }

    public void setCalorie(double calorie) {
        this.calorie = calorie;
    }

    public double getAcCharges() {
        return acCharges;
    }

    public void setAcCharges(double acCharges) {
        this.acCharges = acCharges;
    }

    public double getDeliveryCharges() {
        return deliveryCharges;
    }

    public void setDeliveryCharges(double deliveryCharges) {
        this.deliveryCharges = deliveryCharges;
    }

    public double getIsAC() {
        return isAC;
    }

    public void setIsAC(int isAC) {
        this.isAC = isAC;
    }

    public double getIsSitIn() {
        return isSitIn;
    }

    public void setIsSitIn(int isSitIn) {
        this.isSitIn = isSitIn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getComboOffer() {
        return comboOffer;
    }

    public void setComboOffer(String comboOffer) {
        this.comboOffer = comboOffer;
    }
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getIsDeliverable() {
        return isDeliverable;
    }

    public void setIsDeliverable(int isDeliverable) {
        this.isDeliverable = isDeliverable;
    }
    public double calCalories(double carbohydrates, double protein, double fat)
    {
        return (carbohydrates*4 + protein*4 + fat*9);
    }
}
class ItemList extends Pizzahut
{
    void itemList(Test order,int i)throws IOException
    {
        // here give your products
        Pizzahut[] menu = new Pizzahut[50];
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        menu[0] = new Pizzahut();
        menu[0].itemNo = 1;
        menu[0].itemName = "Margerita";
        menu[0].price = 50;
        menu[0].isDeliverable = 1;
        menu[0].carbohydrates = 20;
        menu[0].protein = 10;
        menu[0].fat = 5;
        menu[0].comboOffer = "Add extra cheese topping for just Rs.10";
        if (menu[0].comboTaken == 1)
            menu[0].price += 10;
        menu[0].calorie = menu[0].calCalories(menu[0].carbohydrates, menu[0].protein, menu[0].fat);

        menu[1] = new Pizzahut();
        menu[1].itemNo = 2;
        menu[1].itemName = "Double Cheese Pizza";
        menu[1].price = 100;
        menu[1].isDeliverable = 1;
        menu[1].carbohydrates = 30;
        menu[1].protein = 20;
        menu[1].fat = 10;
        menu[1].comboOffer = "Add extra cheese topping for just Rs.5";
        if (menu[1].comboTaken == 1)
            menu[1].price += 5;
        menu[1].calorie = menu[1].calCalories(menu[1].carbohydrates, menu[1].protein, menu[1].fat);


        menu[2] = new Pizzahut();
        menu[2].itemNo = 3;
        menu[2].itemName = "Cheese Burger";
        menu[2].price = 40;
        menu[2].isDeliverable = 1;
        menu[2].carbohydrates = 10;
        menu[2].protein = 10;
        menu[2].fat = 5;
        menu[2].comboOffer = "Add extra stuffing for just Rs.15";
        if (menu[2].comboTaken == 1)
            menu[2].price += 15;
        menu[2].calorie = menu[2].calCalories(menu[2].carbohydrates, menu[2].protein, menu[2].fat);


        menu[3] = new Pizzahut();
        menu[3].itemNo = 4;
        menu[3].itemName = "Spicy pizza";
        menu[3].price = 150;
        menu[3].isDeliverable = 1;
        menu[3].carbohydrates = 10;
        menu[3].protein = 10;
        menu[3].fat = 15;
        menu[3].comboOffer = "Add extra chilly flakes for just Rs.5";
        if (menu[3].comboTaken == 1)
            menu[3].price += 5;
        menu[3].calorie = menu[3].calCalories(menu[3].carbohydrates, menu[3].protein, menu[3].fat);


        menu[4] = new Pizzahut();
        menu[4].itemNo = 5;
        menu[4].itemName = "Choco lava cake";
        menu[4].price = 99;
        menu[4].isDeliverable = 0;
        menu[4].carbohydrates = 10;
        menu[4].protein = 10;
        menu[4].fat = 15;
        menu[4].comboOffer = "Get a bigger size for just Rs.49 extra";
        if (menu[4].comboTaken == 1)
            menu[4].price += 49;
        menu[4].calorie = menu[4].calCalories(menu[4].carbohydrates, menu[4].protein, menu[4].fat);


        menu[5] = new Pizzahut();
        menu[5].itemNo = 6;
        menu[5].itemName = "Veg Exotica";
        menu[5].price = 250;
        menu[5].isDeliverable = 1;
        menu[5].carbohydrates = 30;
        menu[5].protein = 10;
        menu[5].fat = 15;
        menu[5].comboOffer = "Add extra cheese for just Rs.30";
        if (menu[5].comboTaken == 1)
            menu[5].price += 30;
        menu[5].calorie = menu[5].calCalories(menu[5].carbohydrates, menu[5].protein, menu[5].fat);


        menu[6] = new Pizzahut();
        menu[6].itemNo = 7;
        menu[6].itemName = "Grilled Sandwich";
        menu[6].price = 199;
        menu[6].isDeliverable = 0;
        menu[6].carbohydrates = 10;
        menu[6].protein = 10;
        menu[6].fat = 15;
        menu[6].comboOffer = "Get a bigger size for just Rs.70 extra";
        if (menu[6].comboTaken == 1)
            menu[6].price += 70;
        menu[6].calorie = menu[6].calCalories(menu[6].carbohydrates, menu[6].protein, menu[6].fat);


        menu[7] = new Pizzahut();
        menu[7].itemNo = 8;
        menu[7].itemName = "Today's special pizza";
        menu[7].price = 99;
        menu[7].isDeliverable = 0;
        menu[7].carbohydrates = 10;
        menu[7].protein = 20;
        menu[7].fat = 5;
        menu[7].comboOffer = "Get double cheese topping for just Rs.30 extra";
        if (menu[7].comboTaken == 1)
            menu[7].price += 30;
        menu[7].calorie = menu[7].calCalories(menu[7].carbohydrates, menu[7].protein, menu[7].fat);


        menu[8] = new Pizzahut();
        menu[8].itemNo = 9;
        menu[8].itemName = "Gadbad";
        menu[8].price = 99;
        menu[8].isDeliverable = 0;
        menu[8].carbohydrates = 20;
        menu[8].protein = 0;
        menu[8].fat = 15;
        menu[8].comboOffer = "Get another scoop for just Rs.30";
        if (menu[8].comboTaken == 1)
            menu[8].price += 30;
        menu[8].calorie = menu[8].calCalories(menu[8].carbohydrates, menu[8].protein, menu[8].fat);

        menu[9] = new Pizzahut();
        menu[9].itemNo = 10;
        menu[9].itemName = "Paneer Pizza";
        menu[9].price = 149;
        menu[9].isDeliverable = 1;
        menu[9].carbohydrates = 10;
        menu[9].protein = 20;
        menu[9].fat = 15;
        menu[9].comboOffer = "Add extra masala for just Rs.30";
        if (menu[9].comboTaken == 1)
            menu[9].price += 30;
        menu[9].calorie = menu[9].calCalories(menu[9].carbohydrates, menu[9].protein, menu[9].fat);

        int j;
        System.out.println("Item No.\t\tItem Name\t\tPrice\tCalorie\t\tCombo Offer\n");
        if(i == 1)
        {
            for (j = 0; j < 10; j++)
            {
                System.out.println(menu[j].itemNo+"\t"+menu[j].itemName+"\t"+menu[j].price+"\t"+menu[j].calorie+"\t"+menu[j].comboOffer+"\n");
            }
        }
        else
        {
            for (j = 0; j < 10; j++)
            {
                if(menu[j].isDeliverable == 1)
                    System.out.println(menu[j].itemNo+"\t"+menu[j].itemName+"\t"+menu[j].price+"\t"+menu[j].calorie+"\t"+menu[j].comboOffer+"\n");
            }
        }
        System.out.println("Choose the item number: ");
        int no = Integer.parseInt(in.readLine());
        --no;
        order.itemName = menu[no].itemName;
        order.price = menu[no].price;
        order.isDeliverable = menu[no].isDeliverable;
        order.carbohydrates = menu[no].carbohydrates;
        order.protein = menu[no].protein;
        order.fat = menu[no].fat;
        menu[no].comboOffer = "Add extra cheese topping for just Rs.10";
        System.out.println("Do you want to use the offer?\n");
        int ch = Integer.parseInt(in.readLine());
        if (ch == 1)
            menu[no].price += 10;
        order.price = menu[no].price;
        menu[no].calorie = menu[no].calCalories(menu[no].carbohydrates, menu[no].protein, menu[no].fat);
        order.calorie = menu[no].calorie;
    }
    void displayMenu(Test order)throws IOException
    {
        if(order.isSitIn == 1)
        {
            // display everything
            itemList(order,1);
        }
        else
        {
            // display only deliverable
            itemList(order,0);
        }
    }
    public void items(Test order)throws IOException
    {
        // here all the items are entered along with all their details
        // display all the items first
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        displayMenu(order);

    }
}
class Test extends ItemList {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int i, j=0, k, ch;
        double totalPrice = 0;
        Test[] order = new Test[100];
        for (i = 0; i < 10; i++)
        {
            System.out.println("Enter the type of order:\n1.Sit in order\n2.Take away order\n3.Bill\n");
            ch = Integer.parseInt(in.readLine());

            if (ch == 1)
            {
                // it is a sit in order
                ++j;
                order[j] = new Test();
                order[j].isSitIn = 1;
                System.out.println("Enter\n1.AC\n2.Non-AC\n");
                k = Integer.parseInt(in.readLine());
                if (k == 1)
                {
                    order[j].isAC = 1;
                    order[j].deliveryCharges = 0;
                    order[j].acCharges = 100;
                    // display all the orders
                    order[j].items(order[j]);
                }
                else
                {
                    order[j].isAC = 0;
                    order[j].deliveryCharges = 0;
                    order[j].acCharges = 50;
                    order[j].items(order[j]);
                }
            }
            else if(ch == 2)
            {
                ++j;
                order[j] = new Test();
                order[j].isSitIn = 0;
                order[j].isAC = 0;
                order[j].deliveryCharges = 100;
                order[j].acCharges = 0;
                order[j].items(order[j]);
                // it is a take away order
                // display only those orders which can be delivered
            }
            else if(ch == 3)
                break;
            else
                System.out.println("Please enter the right choice!\n");
        }
        System.out.println("Want to have an ice-cream?\n1.Yes\n2.No\n");
        ch = Integer.parseInt(in.readLine());
        if(ch == 1) {
            // provide different flavours
            System.out.println("Which flavour do you want?\n");
            System.out.println("1.Chocolate Rs.50\n2.Strawberry Rs.40\n3.Butterscotch Rs.30\n4.Vanilla Rs.20");
            k = Integer.parseInt(in.readLine());
            if (k == 1)
            {
                ++j;
                order[j] = new Test();
                order[j].acCharges = 15;
                order[j].isSitIn = 1;
                order[j].isDeliverable = 0;
                order[j].calorie = 20;
                order[j].itemName = "Chocolate";
                order[j].deliveryCharges = 0;
                order[j].isAC = 1;
                order[j].price = 50;
            }
            else if(k==2)
            {
                ++j;
                order[j] = new Test();
                order[j].acCharges = 15;
                order[j].isSitIn = 1;
                order[j].isDeliverable = 0;
                order[j].calorie = 20;
                order[j].itemName = "Strawberry";
                order[j].deliveryCharges = 0;
                order[j].isAC = 1;
                order[j].price = 40;
            }
            else if(k==3)
            {
                ++j;
                order[j] = new Test();
                order[j].acCharges = 15;
                order[j].isSitIn = 1;
                order[j].isDeliverable = 0;
                order[j].calorie = 20;
                order[j].itemName = "Butterscotch";
                order[j].deliveryCharges = 0;
                order[j].isAC = 1;
                order[j].price = 30;
            }
            else
            {
                ++j;
                order[j] = new Test();
                order[j].acCharges = 15;
                order[j].isSitIn = 1;
                order[j].isDeliverable = 0;
                order[j].calorie = 20;
                order[j].itemName = "Vanilla";
                order[j].deliveryCharges = 0;
                order[j].isAC = 1;
                order[j].price = 20;
            }
        }
        System.out.println("Want to have a drink?\n1.Yes\n2.No\n");
        ch = Integer.parseInt(in.readLine());
        if(ch == 1)
        {
            // ask for cold or room temperature for eat in order
            System.out.println("Enter\n1.Cold\n2.Room Temperature\n");
            k = Integer.parseInt(in.readLine());
            if (k == 1)
            {
                ++j;
                order[j] = new Test();
                order[j].acCharges = 15;
                order[j].isSitIn = 1;
                order[j].isDeliverable = 0;
                order[j].calorie = 20;
                order[j].itemName = "Cold coke";
                order[j].deliveryCharges = 0;
                order[j].isAC = 1;
                order[j].price = 50;
            }
            else
            {
                ++j;
                order[j] = new Test();
                order[j].acCharges = 15;
                order[j].isSitIn = 1;
                order[j].isDeliverable = 0;
                order[j].calorie = 20;
                order[j].itemName = "Warm coke";
                order[j].deliveryCharges = 0;
                order[j].isAC = 1;
                order[j].price = 30;

            }
        }
        System.out.println("Enter the type of order:\n1.Sit in order\n2.Take away order\n3.Bill\n");
        {
            k = Integer.parseInt(in.readLine());
            if (k == 1)
            {
                System.out.println("Do you want salad?");
                k = Integer.parseInt(in.readLine());
                if(k == 1)
                {
                    System.out.println("Enter\n1.Green leafy salad\n2.Vegetable salad\n3.Fruit salad\n");
                    k = Integer.parseInt(in.readLine());
                    if (k == 1)
                    {
                        ++j;
                        order[j] = new Test();
                        order[j].acCharges = 15;
                        order[j].isSitIn = 1;
                        order[j].isDeliverable = 0;
                        order[j].calorie = 20;
                        order[j].itemName = "Green leafy salad";
                        order[j].deliveryCharges = 0;
                        order[j].isAC = 1;
                        order[j].price = 50;
                    }
                    else if(k==2)
                    {
                        ++j;
                        order[j] = new Test();
                        order[j].acCharges = 15;
                        order[j].isSitIn = 1;
                        order[j].isDeliverable = 0;
                        order[j].calorie = 20;
                        order[j].itemName = "Vegetable salad";
                        order[j].deliveryCharges = 0;
                        order[j].isAC = 1;
                        order[j].price = 40;
                    }
                    else
                    {
                        ++j;
                        order[j] = new Test();
                        order[j].acCharges = 15;
                        order[j].isSitIn = 1;
                        order[j].isDeliverable = 0;
                        order[j].calorie = 20;
                        order[j].itemName = "Fruit salad";
                        order[j].deliveryCharges = 0;
                        order[j].isAC = 1;
                        order[j].price = 30;
                    }
                }
            }
        }
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        if(j>0)
        {
            // billing
            for(i=1;i<j;i++)
                totalPrice += (order[i].price + order[i].deliveryCharges + order[i].acCharges);
            // display all the orders
            System.out.println("Item Name\tPrice\tCalorie\n");
            for (int k1 = 1; k1 <= j; k1++)
                System.out.println(order[k1].itemName+"\t"+order[k1].price+"\t"+order[k1].calorie+"\n");
            System.out.println("Total price = Rs."+totalPrice);
        }
        else
        {
            System.out.println("Sorry! You haven't purchased any products. Please visit us next time. Thank you!\n");
        }
    }
}