package week11projec10;

import java.util.ArrayList;

public class Borscht extends Food implements IFood{
    public Borscht(ArrayList<String> ingredients) {
        super(ingredients);
    }

    public Borscht() {
        ArrayList<String> ingredients;
    }

    @Override
    public void taste() {
        System.out.println("Both salty and spicy");
    }

    @Override
    public double price() {
        return 10.0 ;
    }

    @Override
    public void cuisine() {
        System.out.println(Cuisine.RUSSIA);
    }

    @Override
    public ArrayList<String> ingredients() {


        return getIngredients();
    }



}
