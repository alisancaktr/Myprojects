package week11projec10;

import java.util.ArrayList;

public class Food {
    private ArrayList<String> ingredients;

    public Food(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }
    public Food() {
        ArrayList<String> ingredients;
    }
    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }
}
