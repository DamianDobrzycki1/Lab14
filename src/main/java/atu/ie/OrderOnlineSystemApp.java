package atu.ie;

public class OrderOnlineSystemApp {
    public static void main(String[] args){
        //Create an arrat or lost of InterFace objects
        InterFace[] interFaces = new InterFace[]{
                //Add menu Items
        };

        //Display details of each menu item
        for(InterFace interFace : interFaces){
                //Print out the Name,Description and Price for each item
        }

        //Calculate and display the total cost of the order
        double totalCost = 0;
        for(InterFace interFace : interFaces){
            //totalCost of all the InterFace prices in an order
        }
        System.out.println("Total Cost: €" + totalCost);
    }
}