package atu.ie;

public class Dessert implements menuItem {
    private String name;
    private double price;
    private String ingredients;


    public Dessert(String name, double price, String ingredients){
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;

    }
    public Dessert() {
        super();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return ingredients;
    }
}
