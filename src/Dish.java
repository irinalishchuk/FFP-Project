import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Dish extends Menu {

    private ArrayList<Product> products;
    private String name;

    public boolean isAlcoDish() {
<<<<<<< HEAD
=======

>>>>>>> 3450e817d17605f464eef155486ea52715ea497d
        return alcoDish;
    }

    public void setAlcoDish(boolean alcoDish) {
<<<<<<< HEAD
        this.alcoDish = alcoDish;
    }

    private boolean alcoDish;

=======

        this.acloDish = acloDish;
    }
    private boolean alcoDish;




>>>>>>> 3450e817d17605f464eef155486ea52715ea497d
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dish(String name, ArrayList<Product> products) {
        this.products = products;
        this.name = name;
<<<<<<< HEAD

        for (Product product: products) {
            if (product instanceof AlcoDrinks)  {
                alcoDish = true;
=======
        for (Product product: products) {
            if (product instanceof AlcoDrinks){
                acloDish = true;
>>>>>>> 3450e817d17605f464eef155486ea52715ea497d
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