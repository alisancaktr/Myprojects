package week11projec10;

import java.util.ArrayList;

public class Kebab extends Food implements IFood{
    public Kebab(ArrayList<String> ingredients) {
        super(ingredients);
    }

    public Kebab() {
        ArrayList<String> ingredients;
    }

    @Override
    public void taste() {
        System.out.println("Cow beef");
    }

    @Override
    public double price() {
        return 12.0;
    }

    @Override
    public void cuisine() {
        System.out.println(Cuisine.TURKEY);
    }
    public void marinade(){
        System.out.println("The meat is prepared by marinating the day before");
    }
    public void grill(){
        System.out.println("The meat is cooked on  the grill fire slowly");
    }
    @Override
    public ArrayList<String> ingredients() {

        return getIngredients();
    }
}
