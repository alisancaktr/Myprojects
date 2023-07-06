package week14projec14;

public abstract class ElectronicProduct extends Product implements Discountable {


    private String color;

    private String madeIn;

    private double price;
    public ElectronicProduct(String name, double price, Category category, String color, String madeIn) {
        super(name, price, category);
        this.price = price;
        this.color = color;
        this.madeIn = madeIn;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double discountedPrice(double tprice) {
         double  newPrice1 =  (getPrice()*90) / 100;

         return newPrice1;
    }

    public ElectronicProduct() {

    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    void music() {
        System.out.println("You can listen music in your device");
    }

    void charge() {
        System.out.println("Your device is chargeable");
    }

    @Override
    void getData() {
        System.out.println(getName() + " is " +  " with color " + getColor() + " and from category"
                +
                " of "
                + getCategory() + " and this product made in " + getMadeIn());
    }
}
