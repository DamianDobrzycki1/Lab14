package atu.ie;

public class OrderOnlineSystemApp {
    public static void main(String[] args){
        //Create an array or list of InterFace objects
        Burger myBurger;

        InterFace[] interFaces = new InterFace[]{
            //Add menu Items
            new Burger("Burger", 12, "Cheese"),
            new Pizza("Pepperoni", 14, "Cheese with Pepperoni"),
            new Salad("Sweet Salad", 8, "Sweet Chili Sauce")
        };

        //Display details of each menu item
        for(InterFace interFace : interFaces){
                //Print out the Name,Description and Price for each item
            System.out.println("Name: " + interFace.getName());
            System.out.println("Description: "+ interFace.getDescription());
            System.out.println("Price: "+ interFace.getPrice());
        }

        //Calculate and display the total cost of the order
        double totalCost = 0;
        for(InterFace interFace : interFaces){
            //totalCost of all the InterFace prices in an order
            totalCost += interFace.getPrice();
        }
        System.out.println("Total Cost: €" + totalCost);
    }
}