package MealPackage.product;

import MealPackage.AlcoDrinks;
import MealPackage.VegFr;

import java.util.ArrayList;


public class ProductDao {

    public static ArrayList<Product> products = new ArrayList<Product>() {{
        add(new Product("Potato", 5, 3.99f, "kg"));
        add(new Product("Khortitsa", 3, 40.99f, "l"));
    }};

    public ProductDao() {
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void deleteProduct(String name) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)) {
                products.remove(i);
            }
        }
    }

    public ArrayList<Product> getAllProducts() {
        return products;
    }


    public static Product getProductByName(String name) {
        Product found = null;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)) {
                found = products.get(i);
            }
        }
        System.out.println("FOUND PRODUCT" + found.getName());
        return found;
    }
}
