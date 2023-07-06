package week14projec14;

public abstract class BookProduct extends Product implements Discountable {
    private String bookCategory;
    private double price;

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public BookProduct(String name, double price, Category category, String bookCategory) {
        super(name, price, category);
        this.price = price;
        this.bookCategory = bookCategory;
    }

    @Override
    public double discountedPrice(double tprice) {
        double newPrice1 = (getPrice() * 70) / 100;

        return newPrice1;
    }

    public BookProduct() {

    }

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    void fontSize() {
        System.out.println("This book has 11 size of font");
    }

    @Override
    void getData() {
        System.out.println(getName() + " is " + "  from " + getBookCategory() + " and also from "
                +
                "category"
                +
                " of "
                + getCategory());
    }

}
