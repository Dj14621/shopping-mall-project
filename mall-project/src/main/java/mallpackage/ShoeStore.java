package mallpackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ShoeStore extends Stores {
    private static Set <Shoe> shoeList = new HashSet<>();

    // constructor


    public ShoeStore(String storId, String name, int storeSize, String taxId, String department) {
        super(storId, name, storeSize, taxId);

    }

    // getter & setter



    public Set<Shoe> getShoeList() {
        return shoeList;
    }

    public void setShoeList(HashSet<Shoe> shoeList) {
        this.shoeList = shoeList;
    }

    // Methods

    public void addShoe(Shoe s){
        getShoeList().add(s);
    }

    // to load list of shoes
        public static void  loadShoes(String filename) {
            ArrayList<String> result = new ArrayList<>();

            try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
                while (br.ready()) {
                    result.add(br.readLine());
                }

                for (int i = 0; i <= result.size() -1; i++) {

                    // line and shoe1 variables are encapsulated inside the for loop
                    String[] line = result.get(i).split(",");

                    Shoe shoe1 = new Shoe(Integer.parseInt(line[0]), line[1], Float.parseFloat(line[2]), line[3],
                            line[4], line[5], Float.parseFloat(line[6]), Boolean.parseBoolean(line[7]));
                    System.out.println(shoe1.toString());

                    shoeList.add(shoe1);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


        // to load list of stores
    public static ShoeStore  loadStoreShoes(String filename) {
        ArrayList<String> result = new ArrayList<>();
        ShoeStore ss  = null;
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            while (br.ready()) {
                result.add(br.readLine());
            }

            for (int i = 0; i <= result.size() -1; i++) {
                // line and shoe1 variables are encapsulated inside the for loop
                String[] line = result.get(i).split(",");

                 ss = new ShoeStore(line[0],line[1],Integer.parseInt(line[2]),line[3],line[4]);
                System.out.println(ss.getName());

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ss;
    }
}
