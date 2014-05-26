package AppLogic.user;

import MealPackage.Dish;
import MealPackage.Menu;
import MealPackage.Product;

import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private String firstName;
    private String lastName;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String[] getDevices() {
        return devices;
    }

    public void setDevices(String[] devices) {
        this.devices = devices;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    private String[] devices;
    private boolean valid;
    private boolean admin;
    private ArrayList<Menu> menus;
    private ArrayList<Product> products;
    private ArrayList<Dish> dishes;


    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }



    public ArrayList<Product> getProducts() {
        return UserDAO.getProducts(this);
    }
    public ArrayList<Dish> getDishes() {
        return UserDAO.getDishes(this);
    }






    public void setDishes(ArrayList<Dish> dishes) {
        this.dishes = dishes;
    }

    public User(String name,  String password) {
        UserDAO.initAll();
        this.username = name;
        this.password = password;
        dishes = new ArrayList<Dish>();
        products = new ArrayList<Product>();
        menus = new ArrayList<Menu>();
    }

    public User(String name, int age, String password, ArrayList<Menu> menus) {
        this.username = name;
        this.password = password;
        this.menus = menus;
        dishes = new ArrayList<Dish>();
        products = new ArrayList<Product>();
        menus = new ArrayList<Menu>();
    }

    public String getName() {
        return username;
    }

    public void setName(String name) {
        this.username = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Menu> getMenus() {
        return menus;
    }

    public void setMenus(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public boolean isAll() {
        return UserDAO.ready;
    }

}
