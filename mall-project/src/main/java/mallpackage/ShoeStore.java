package mallpackage;

import java.util.ArrayList;
import java.util.Set;

public class ShoeStore extends Stores {
    private Set <Shoe> shoeList;
    // constructor


    public ShoeStore(String storId, String name, int storeSize, String taxId, String departement) {
        super(storId, name, storeSize, taxId, departement);

    }

    // getter & setter



    public Set<Shoe> getShoeList() {
        return shoeList;
    }

    public void setShoeList(Set<Shoe> shoeList) {
        this.shoeList = shoeList;
    }

    // Methods

    public void addShoe(Shoe s){
        getShoeList().add(s);
    }
}
