package week11projec10;

import java.util.ArrayList;

public class Lasagna extends Food implements IFood {
    public Lasagna(ArrayList<String> ingredients) {
        super(ingredients);
    }

    public Lasagna() {
        ArrayList<String> ingredients;
    }

    @Override
    public void taste() {
        System.out.println("taste like pasta");
    }

    @Override
    public double price() {
        return 5.0;
    }

    @Override
    public void cuisine() {
        System.out.println(Cuisine.ITALY);
    }
    public void sauce(){
        System.out.println("Handmade white sauce keeps the dish moist and delectable");
    }
    @Override
    public ArrayList<String> ingredients() {
        return getIngredients();
    }
}
