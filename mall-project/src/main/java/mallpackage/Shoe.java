package mallpackage;

public class Shoe extends Product{

    private String shoeRef;
    private String brand;
    private String color;
    private float size;
    private boolean discount;

    public Shoe(int productId, String description, float price, String shoeRef, String brand, String color, float size, boolean discount) {
        super(productId, description, price);
        this.shoeRef = shoeRef;
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.discount = discount;
    }

    public String getShoeRef() {
        return shoeRef;
    }

    public void setShoeRef(String shoeRef) {
        this.shoeRef = shoeRef;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Shoe{" +
                "shoeRef='" + shoeRef + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", discount=" + discount +
                '}';
    }
}
