package week14projec14;

public abstract class ClothingProduct extends Product implements Discountable {
    private String size;
    private String color;
    private double price;

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public ClothingProduct(String name, double price, Category category, String size, String color) {
        super(name, price, category);
        this.price = price;
        this.size = size;
        this.color = color;
    }

    @Override
    public double discountedPrice(double tprice) {
        double newPrice1 = (getPrice() * 80) / 100;

        return newPrice1;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ClothingProduct() {

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    void wash() {
        System.out.println("This cloth can washed maximum 30 times");
    }

    @Override
    void getData() {
        System.out.println(getName() + " is " + " with color " + getColor() + " and from category"
                +
                " of "
                + getCategory() + " and this product's size is " + getSize());
    }
}
