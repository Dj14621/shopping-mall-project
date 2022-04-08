package mallpackage;

import java.util.ArrayList;

public class Stores {
    //Fields
    private String name;
    private int numcustomers;
    private String taxid;
    private String storid;
    ArrayList<Integer> shoppingcart = new ArrayList<>();

    //Constructor

    public Stores(String name, int numcustomers, String taxid, String storid, ArrayList<Integer> shoppingcart) {
        this.name = name;
        this.numcustomers = numcustomers;
        this.taxid = taxid;
        this.storid = storid;
        this.shoppingcart = shoppingcart;
    }

    //Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumcustomers() {
        return numcustomers;
    }

    public void setNumcustomers(int numcustomers) {
        this.numcustomers = numcustomers;
    }

    public String getTaxid() {
        return taxid;
    }

    public void setTaxid(String taxid) {
        this.taxid = taxid;
    }

    public String getStorid() {
        return storid;
    }

    public void setStorid(String storid) {
        this.storid = storid;
    }

    public ArrayList<Integer> getShoppingcart() {
        return shoppingcart;
    }

    public void setShoppingcart(ArrayList<Integer> shoppingcart) {
        this.shoppingcart = shoppingcart;
    }
    //Methodes
    // To String


    @Override
    public String toString() {
        return "Stores{" +
                "name='" + name + '\'' +
                ", numcustomers=" + numcustomers +
                ", taxid='" + taxid + '\'' +
                ", storid='" + storid + '\'' +
                ", shoppingcart=" + shoppingcart +
                '}';
    }
}
