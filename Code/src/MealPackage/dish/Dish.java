package MealPackage.dish;

import MealPackage.AlcoDrinks;
import MealPackage.Menu;
import MealPackage.product.Product;

import java.util.ArrayList;

public class Dish extends Menu {

    private ArrayList<Product> products;
    private String name;

    public Dish() {

    }

    public boolean isAlcoDish() {
        return alcoDish;
    }

    public void setAlcoDish(boolean alcoDish) {
        this.alcoDish = alcoDish;
    }
    private boolean alcoDish;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dish(String name, ArrayList<Product> products) {
        this.products = products;
        this.name = name;
        for (Product product: products) {
            if (product instanceof AlcoDrinks){
                alcoDish = true;
                break;
            }
        }
    }

    public float calculatePrice() {
        float sum = 0;
        for (int i = 0; i < products.size(); i++) {
            sum += products.get(i).productsPrice();
        }
        return sum;
    }

    public String toString() {
        String buf = new String();
        for (Product product: products) {
            buf+= product.toString() + ": " + product.getAmount() + " " + product.getDimension() + "\r\n";
        }
        return buf;
    }

}