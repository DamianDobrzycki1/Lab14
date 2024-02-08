package atu.ie;

public class OrderOnlineSystemApp {
    public static void main(String[] args){
        //Create an array or list of InterFace objects
        Burger myBurger;

        menuItem[] menuItems = new menuItem[]{
            //Add menu Items
            new Burger("Burger", 12, "Cheese"),
            new Pizza("Pepperoni", 14, "Cheese with Pepperoni"),
            new Salad("Sweet Salad", 8, "Sweet Chili Sauce"),
            new Dessert("Ben and Jerrys", 9, "Cookie Dough")
        };

        //Display details of each menu item
        for(menuItem menuItem : menuItems){
                //Print out the Name,Description and Price for each item
            System.out.println("Name: " + menuItem.getName());
            System.out.println("Description: "+ menuItem.getDescription());
            System.out.println("Price: "+ menuItem.getPrice());
        }

        //Calculate and display the total cost of the order
        double totalCost = 0;
        for(menuItem menuItem : menuItems){
            //totalCost of all the InterFace prices in an order
            totalCost += menuItem.getPrice();
        }
        System.out.println("Total Cost: €" + totalCost);
    }
}