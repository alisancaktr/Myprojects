package week14projec14;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        ArrayList<Double> total1 = new ArrayList<>();
        while (true) {
            ShoppingCart shoppingCart = new ShoppingCart();
            BookProduct bookProduct = new BookProduct() {
            };
            ElectronicProduct electronicProduct = new ElectronicProduct() {

            };
            ClothingProduct clothingProduct = new ClothingProduct() {

            };

            Scanner in = new Scanner(System.in);

            System.out.println("Press 'e' for add electronic product");
            System.out.println("Press 'c' for add clothing product");
            System.out.println("Press 'b' for add book product");
            System.out.println("Press 'a' for see your total ");

            String choice = in.next();

            if (choice.equals("e")) {
                shoppingCart.addElectronic();
                double c = shoppingCart.priceElectronic();
                total1.add(c);

            } else if (choice.equals("c")) {
                shoppingCart.addCloth();
                double b = shoppingCart.priceCloth();
                total1.add(b);
            } else if (choice.equals("b")) {

                shoppingCart.addBook();
                double a = shoppingCart.priceBook();
                total1.add(a);
            } else if (choice.equals("a")) {
                double sum = 0;
                for (Double t2 : total1) {
                    sum += t2;
                }
                System.out.println("Discounted price is: " + sum);

            } else {
                System.out.println("Wrong command");
            }
        }
    }
}
