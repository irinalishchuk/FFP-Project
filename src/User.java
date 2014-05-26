import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {

    private String name;
    private int age;
    private String pass;
    private ArrayList<Menu> menus;
    private ArrayList<Product> products;
    private ArrayList<Dish> dishes;

    public ArrayList<Product> getProducts() {
        return products;
    }
    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
    public ArrayList<Dish> getDishes() {
        return dishes;
    }
    public void setDishes(ArrayList<Dish> dishes) {
        this.dishes = dishes;
    }

    public User(String name, int age, String pass) {
        this.name = name;
        this.age = age;
        this.pass = pass;
        dishes = new ArrayList<Dish>();
        products = new ArrayList<Product>();
        menus = new ArrayList<Menu>();
    }

    public User(String name, int age, String pass, ArrayList<Menu> menus) {
        this.name = name;
        this.age = age;
        this.pass = pass;
        this.menus = menus;
        dishes = new ArrayList<Dish>();
        products = new ArrayList<Product>();
        menus = new ArrayList<Menu>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
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

}