package user;

import MealPackage.dish.Dish;
import MealPackage.Menu;
import MealPackage.product.Product;

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

    private boolean valid;
    private boolean admin;

    public User(String name, String password, String firstName, String lastName) {
        this.username = name;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User(String name, String password, String firstName, String lastName, boolean admin) {
        this.username = name;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.admin = true;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

