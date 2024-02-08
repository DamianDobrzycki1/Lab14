package atu.ie;

public class Salad implements InterFace{

    private String name;
    private double price;
    private String ingredients;

    public Salad(String name, double price, String ingredients){
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

