package week11projec10;

import java.util.ArrayList;

public class Dosa extends Food implements IFood {
    public Dosa(ArrayList<String> ingredients) {
        super(ingredients);
    }

    public Dosa() {
        ArrayList<String> ingredients;
    }

    @Override
    public void taste() {
        System.out.println("baked product with salty taste");
    }

    @Override
    public double price() {
        return 8.0;
    }

    @Override
    public void cuisine() {
        System.out.println(Cuisine.INDIA);
    }
    public void tricks(){
        System.out.println("TRICK: We add semolina and rice flour to adjust the consistency");
    }
    @Override
    public ArrayList<String> ingredients() {

        return getIngredients();
    }
}
