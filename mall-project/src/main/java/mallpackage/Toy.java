package mallpackage;

public class Toy extends Product{

    private String brand ;
    private boolean discount;


    // Constractors are using polymorphism, by having different set of parameters
    public Toy(int productId, String description, float price, String brand, boolean discount) {
        super(productId, description, price);
        this.brand = brand;
        this.discount = discount;
    }

    public Toy(int productId, String description, float price,  String brand) {
        super(productId, description, price);
        this.brand = brand;
    }

    public Toy(int productId, String description, float price) {
        super(productId, description, price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "brand='" + brand + '\'' +
                ", discount=" + discount +
                '}';
    }
}
