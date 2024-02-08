package atu.ie;

public class Pizza implements InterFace {

    private String name;
    private double price;
    private String ingredients;

    public Pizza(String name, double price, String ingredients){
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;

    }
    @Override
    public String getName() {
        return null;
    }

    @Override
    public Double getPrice() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }
}
