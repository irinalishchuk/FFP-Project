package AppLogic.user;

import MealPackage.*;

import java.util.ArrayList;

public class UserDAO {

    public static ArrayList<Dish> dishes;
    public static ArrayList<Product> products;
    public static boolean ready;

    public static void initAll() {
        dishes = new ArrayList<>();
        products = new ArrayList<>();

        Product potato = new VegFr("Potato", 5, 3.99f, "kg");
        Product vodka = new AlcoDrinks("Khortitsa", 3, 40.99f, "l");

        products.add(potato);
        products.add(vodka);

        Dish russianDish = new Dish("Ruskey", products);
        dishes.add(russianDish);
        Menu menu = new Menu(dishes);

        ready = true;
    }

    public static ArrayList<Dish> getDishes(User user) {
        return dishes;
    }

    public static ArrayList<Product> getProducts(User user) {
        return products;
    }
}
