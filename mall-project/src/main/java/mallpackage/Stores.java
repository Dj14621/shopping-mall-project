package mallpackage;

import java.util.ArrayList;

public class Stores {
    //Fields
    private String storId;
    private String name;
    private int storeSize;
    private String taxId;
    private String departement;

    //ArrayList<Integer> shoppingcart = new ArrayList<>();

    //Constructor

    public Stores(String storId, String name, int storeSize, String taxId, String departement) {
        this.storId = storId;
        this.name = name;
        this.storeSize = storeSize;
        this.taxId = taxId;
        this.departement = departement;
    }


    //Getters and setters

    public String getStorId() {
        return storId;
    }

    public void setStorId(String storId) {
        this.storId = storId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStoreSize() {
        return storeSize;
    }

    public void setStoreSize(int storeSize) {
        this.storeSize = storeSize;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    //Methodes
    // To String



}
