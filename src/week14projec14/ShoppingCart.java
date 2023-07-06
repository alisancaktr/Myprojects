package week14projec14;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {
    void addElectronic() {
        Scanner in = new Scanner(System.in);
        ElectronicProduct e = new ElectronicProduct() {

        };


        System.out.println("What do you want to buy ? ");
        String name1 = in.next();
        e.setName(name1);

        System.out.println("Which color do you want to choose for your product ? ");
        String color1 = in.next();
        e.setColor(color1);

        System.out.println("Where would you like your product to be made ? ");
        String madeIn1 = in.next();
        e.setMadeIn(madeIn1);



        e.setCategory(Category.ELECTRONICS);

        e.discountedPrice(e.getPrice());
        e.getData();


    }

    void addCloth() {
        Scanner in = new Scanner(System.in);
        ClothingProduct c = new ClothingProduct() {

        };
        System.out.println("What do you want to buy ? ");
        String name1 = in.next();
        c.setName(name1);

        System.out.println("Which color do you want to choose for your product ? ");
        String color1 = in.next();
        c.setColor(color1);

        System.out.println("Size ? ");
        String size1 = in.next();
        c.setSize(size1);




        c.setCategory(Category.CLOTHING);

        c.discountedPrice(c.getPrice());
        c.getData();
    }

    void addBook() {
        Scanner in = new Scanner(System.in);
        BookProduct b = new BookProduct() {

        };
        System.out.println("Which category do you want to read from ? ");
        String book1 = in.next();
        b.setBookCategory(book1);


        System.out.println("What do you want to buy ? ");
        String name1 = in.next();
        b.setName(name1);




        b.setCategory(Category.BOOKS);

        b.getData();
    }

    Double priceBook(){
        BookProduct b = new BookProduct(){

        };
        Scanner in = new Scanner(System.in);
        System.out.println("How much could you pay ? ");

        Double price1 = in.nextDouble();
        b.setPrice(price1);
      double x =   b.discountedPrice(price1);
        return x;
    }
    Double priceCloth(){
        ClothingProduct c = new ClothingProduct(){

        };
        Scanner in = new Scanner(System.in);
        System.out.println("How much could you pay ? ");
        Double price1 = in.nextDouble();
        c.setPrice(price1);
      double x =   c.discountedPrice(price1);
       return x;
    }


    Double priceElectronic(){
        ElectronicProduct e = new ElectronicProduct(){

        };
        Scanner in = new Scanner(System.in);
        System.out.println("How much could you pay ? ");
        Double price1 = in.nextDouble();
        e.setPrice(price1);
      double x =  e.discountedPrice(price1);

       return x;

    }




}
