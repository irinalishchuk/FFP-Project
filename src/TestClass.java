import java.util.ArrayList;

public class TestClass {

    public static void main(String args[]) {

        ArrayList<Product> base = new ArrayList<Product>();
        ArrayList<Dish> dishes = new ArrayList<Dish>();

        Product potato = new VegFr("Potato", 5, 3.99f, "kg");
        Product vodka = new AlcoDrinks("Khortitsa", 3, 40.99f, "l");

        base.add(potato);
        base.add(vodka);

        Dish russianDish = new Dish("Ruskey", base);
        dishes.add(russianDish);
        Menu menu = new Menu(dishes);

        User Ira = new User("Iren", 19, "lol");
        Ira.setProducts(base);
        Ira.addDish(russianDish);

        menu.setChildMenu(true);
        try {
            menu.addDishToMenu(russianDish);
            menu.writeMenuToFile();
<<<<<<< HEAD
        } catch (AlcoChildException e) {
            System.out.println("Please don't kill your child");
=======
        }
        catch (AlcoChildException e){
            System.out.println("Please don't kill your child!");
>>>>>>> 3450e817d17605f464eef155486ea52715ea497d
        }

    }
}
