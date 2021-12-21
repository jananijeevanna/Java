package Assignment2;

import java.util.Scanner;

public class DessertItemMain {

    public static void main(String[] args) {

        System.out.println("Type 1 if you are the Owner \n or Type 2 if you are a Customer");
        Scanner sc=new Scanner(System.in);

        int v=sc.nextInt();

        if(v==1)
        {

            System.out.println(" Enter dessert item to be added : ");
            String newItem = sc.next();
            System.out.println(" Enter Quantity to be added : ");
            int stock = sc.nextInt();

            if(newItem.equalsIgnoreCase("candy"))
            {
                Candy candy = new Candy(stock);
                System.out.println(" Item added to storage ");
                System.out.println(" Total Candy stock available now : "+candy.getStock(stock));
            }

            if(newItem.equalsIgnoreCase("cookie"))
            {
                Cookie cookie =new Cookie(stock);
                System.out.println(" Item added to storage ");
                System.out.println(" Total Cookie stock available now : "+cookie.getStock(stock));
            }

            if(newItem.equalsIgnoreCase("IceCream"))
            {
                IceCream iceCream = new IceCream(stock);
                System.out.println(" Item added to storage ");
                System.out.println(" Total Ice cream stock available now : "+iceCream.getStock(stock));
            }

        }


        else if(v==2)
        {
            System.out.println("\n Enter your order item ");
            String newOrder = sc.next();
            System.out.println(" Enter quantity ");
            int quantity = sc.nextInt();

            if(newOrder.equalsIgnoreCase("Candy"))
            {
                Candy candy = new Candy(quantity);
                System.out.println(" total cost in rupees = "+candy.getCost());
            }

            if(newOrder.equalsIgnoreCase("Cookie"))
            {
                Cookie cookie = new Cookie(quantity);
                System.out.println(" total cost in rupees = "+cookie.getCost());
            }

            if(newOrder.equalsIgnoreCase("IceCream"))
            {
                IceCream iceCream = new IceCream(quantity);
                System.out.println(" total cost in rupees = "+iceCream.getCost());
            }
        }
    }
}

abstract class DessertItem{
    abstract int getCost();

    public static DessertItem getInstance() {
        return null;}}

class Candy extends DessertItem {
    int quantity, stock;
    int availableStock = 120;
    public Candy(int quantity) {
        this.quantity= quantity;

    }

    public int getCost() {
        int candyPrice = 2;
        int candyTax = 10;
        return (candyPrice*60*quantity + candyTax);
    }
    public int getStock(int stock)
    {
        this.stock = stock;
        return stock+availableStock;
    }

}
class Cookie extends DessertItem{

    int quantity,stock;
    int cookieStock = 150;
    public Cookie(int quantity) {

        this.quantity= quantity;
    }

    public int getCost() {
        int cookiePrice = 3;
        int cookieTax = 10;
        return (cookiePrice*70*quantity + cookieTax);

    }
    public int getStock(int stock)
    {
        this.stock = stock;
        return stock+cookieStock;
    }
}

class IceCream extends DessertItem{

    int quantity, stock;
    int iceCreamStock=200;
    public IceCream(int quantity) {
        this.quantity=quantity;
    }
    public int getCost() {
        int iceCreamPrice = 50;
        int iceCreamTax = 10;
        return (iceCreamPrice*quantity + iceCreamTax);

    }
    public int getStock(int stock)
    {
        this.stock = stock;
        return stock+iceCreamStock;
    }

}


