package mallpackage;

import java.util.Map;

public class KidsStore {
    private Map <Double,Toy> ToysList;

    //Constructors

    public KidsStore() {
    }

    public KidsStore(Map<Double, Toy> toysList) {
        ToysList = toysList;
    }

    public Map<Double, Toy> getToysList() {
        return ToysList;
    }

    public void setToysList(Map<Double, Toy> toysList) {
        ToysList = toysList;
    }


    // Methods
    public void addToy(int productId, String description, float price, String brand, boolean discount){

        Double key = Math.random();
        Toy toy1=new Toy(productId, description,  price , brand, discount);

        getToysList().put(key,toy1);
    }
}
