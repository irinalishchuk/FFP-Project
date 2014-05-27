package MealPackage.dish;

import MealPackage.product.Product;
import MealPackage.product.ProductDao;

import java.util.ArrayList;

public class DishDao {
    public static ArrayList<Dish> dishes = new ArrayList<Dish>() {{
        add(new Dish("AlcoDish", ProductDao.products));
    }};

    public DishDao() {
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public void deleteDish(String name) {
        for (int i = 0; i < dishes.size(); i++) {
            if (dishes.get(i).getName().equals(name)) {
                dishes.remove(i);
            }
        }
    }

    public ArrayList<Dish> getAllDishes() {
        return dishes;
    }


}
