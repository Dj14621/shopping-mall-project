package mallpackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Map;



public class KidsStore extends Stores {
    private static final Path filePath2 = Paths.get("C:\\FannieProjects\\shopping-mall-project\\mall-project\\toys.txt");
    private Map <Double,Toy> ToysList;

    //Constructors


    public KidsStore(String storId, String name, int storeSize, String taxId) {
        super(storId, name, storeSize, taxId);
    }

    public KidsStore(String storId, String name, int storeSize, String taxId, Map<Double, Toy> toysList) {
        super(storId, name, storeSize, taxId);
        ToysList = toysList;
    }

    //getters and setters
    public Map<Double, Toy> getToysList() {
        return ToysList;
    }

    public void setToysList(Map<Double, Toy> toysList) {
        ToysList = toysList;
    }


    // Methods

    public static void readToyStoreFile(String s) {
    }


    public void addToy(int productId, String description, float price, String brand, boolean discount){

        Double key = Math.random();
        Toy toy1=new Toy(productId, description,  price , brand, discount);

        getToysList().put(key,toy1);
    }
    //toString
    @Override
    public String toString() {
        return "KidsStore{" +
                "ToysList=" + ToysList +
                '}';
    }
}
