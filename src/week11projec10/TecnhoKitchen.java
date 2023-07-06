package week11projec10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TecnhoKitchen {

    private ArrayList<Double> priceList;
    private int customerOrder;
    Scanner in = new Scanner(System.in);
    public TecnhoKitchen() {
    }
    public void takeOrder(int customerOrder) {
        ArrayList<Double> priceList = new ArrayList<>();

        boolean ronaldo = true;
        while (ronaldo) {
            int a = in.nextInt();
            switch (a) {
                case 1:
                    ArrayList<String> brs  = new ArrayList<>();
                    brs.add("soup");
                    Borscht borscht = new Borscht(brs);
                    priceList.add(borscht.price());

                    System.out.println(orderTotal(priceList));
                    ronaldo = false;
                case 2:
                    Donuts donuts = new Donuts();

                    priceList.add(donuts.price());
                    ronaldo = false;
                case 3:
                    Dosa dosa = new Dosa();

                    priceList.add(dosa.price());
                    ronaldo = false;
                case 4:
                    Kebab kebab = new Kebab();

                    priceList.add(kebab.price());
                    ronaldo = false;
                case 5:
                    Lasagna lasagna = new Lasagna();
                    priceList.add(lasagna.price());
                    ronaldo = false;
            }
        }


    }
    public double orderTotal(ArrayList<Double> priceList) {
        double sum = 0;
        for (int i = 0; i < priceList.size(); i++) {
            sum = sum + priceList.get(i);
        }

        return sum;
    }

    public ArrayList<Double> getPriceList() {
        return priceList;
    }

    public void setPriceList(ArrayList<Double> priceList) {
        this.priceList = priceList;
    }

    public int getCustomerOrder() {
        return customerOrder;
    }

    public void setCustomerOrder(int customerOrder) {
        this.customerOrder = customerOrder;
    }
}
