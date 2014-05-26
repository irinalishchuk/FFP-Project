package MealPackage;

import java.util.Vector;

public class Product {

    private int amount;
    private float price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private String dimension;

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public Product(String name, int amount, float price, String dimension) {
        this.amount = amount;
        this.price = price;
        this.name = name;
        this.dimension = dimension;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float productsPrice() {
        return this.price * this.amount;
    }

    public String getDimension() {
        return dimension;
    }

    public String toString() {
        return this.getName();
    }
}