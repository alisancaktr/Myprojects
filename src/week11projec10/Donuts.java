package week11projec10;

import java.util.ArrayList;

public class Donuts extends  Food implements  IFood{
    public Donuts(ArrayList<String> ingredients) {
        super(ingredients);
    }

    public Donuts() {
        ArrayList<String> ingredients;
    }

    @Override
    public void taste() {
        System.out.println("Sweet");
    }

    @Override
    public double price() {
        return 2.0;
    }

    @Override
    public void cuisine() {
        System.out.println(Cuisine.US);
    }
    public void warning(){
        System.out.println("WARNİNG: Our donuts are very delicious");
    }
    @Override
    public ArrayList<String> ingredients() {

        return getIngredients();
    }
}
