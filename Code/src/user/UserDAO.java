package user;

import MealPackage.dish.Dish;
import MealPackage.product.Product;

import java.util.ArrayList;


public class UserDAO {

    public static ArrayList<User> users = new ArrayList<User>() {{
        add(new User("Ira", "Ira", "Ira", "Lishchuk"));
        add(new User("Nastya", "Nastya", "Nastya", "Kuzmenko"));
        add(new User("admin", "admin", "admin", "admin", true));
     }};

    public static User getUserByName(String name) {
        User found = null;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsername().equals(name)) {
                found = users.get(i);
            }
        }
        System.out.println("USER FOUND" + found.getUsername());
        return found;
    }

    public ArrayList<User> getAllUsers() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void deleteUser(String name) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsername().equals(name)) {
                users.remove(i);
            }
        }
    }
}
