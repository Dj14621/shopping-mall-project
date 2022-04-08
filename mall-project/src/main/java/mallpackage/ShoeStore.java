package mallpackage;

import java.util.ArrayList;

public class ShoeStore extends Stores {
    private String brand;
    private  String name;
    // constructor

    public ShoeStore(String name, int numcustomers, String taxid, String storid, ArrayList<Integer> shoppingcart, String brand, String name1) {
        super(name, numcustomers, taxid, storid, shoppingcart);
        this.brand = brand;
        this.name = name1;
    }
    //Getters and setters

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String getName() {
        return "Adidas";
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
