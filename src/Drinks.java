public class Drinks extends Product implements Mixable{

    public Drinks(String name, int amount, float price, String dimension) {
        super(name, amount, price, dimension);
    }

    @Override
    public void mixDrinks(Drinks first, Drinks second, Drinks result) {

    }
}