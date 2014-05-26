import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Menu {

    public boolean isChildMenu() {
        return childMenu;
    }

    public void setChildMenu(boolean childMenu) {
        this.childMenu = childMenu;
    }

    private boolean childMenu;

    public Menu(ArrayList<Dish> dishes) {
        this.dishes = dishes;
    }

    private ArrayList<Dish> dishes;

    public Menu() {
        this.childMenu = false;
        dishes = new ArrayList<Dish>();
    }


    public float calculateMenuPrice() {
        float sum = 0;
        for (int i = 0; i < dishes.size(); i++) {
            sum += dishes.get(i).calculatePrice();
        }
        return sum;
    }

    public void writeMenuToFile() {
        try {
            FileWriter writer = new FileWriter("menu.txt");
            for (Dish dish: dishes) {
                writer.write(dish.toString());
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("IO Exception!");

        }

    }

    public void addDishToMenu(Dish dish) throws AlcoChildException {
        if (dish.isAlcoDish()) {
            throw new AlcoChildException("Forbidden!");
        }
        else {
            dishes.add((Dish) dish);
        }
    }

    public void addDishToMenu(Dish dish) throws AlcoChildException {
        if (dish.isAlcoDish()) {
            throw new AlcoChildException("Forbridden!");
        }
        else {
           dishes.add((Dish) dish);
        }
    }
}