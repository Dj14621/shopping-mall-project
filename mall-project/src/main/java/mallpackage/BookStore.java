package mallpackage;


import java.util.ArrayList;

public class BookStore {
    private String dictionaries;

    //Constructor

    public BookStore() {
    }

    public BookStore(String dictionaries) {
        this.dictionaries = dictionaries;
    }
    //Getters and setters

    public void setDictionaries(String dictionaries) {
        this.dictionaries = dictionaries;
    }

    @Override
    public String toString() {
        return "BookStore{" +
                "dictionaries='" + dictionaries + '\'' +
                '}';
    }
}
