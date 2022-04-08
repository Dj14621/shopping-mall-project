package mallpackage;

public class KidsStore {
    private String toyStore;

    //Constructors

    public KidsStore() {
    }

    public KidsStore(String toyStore) {
        this.toyStore = toyStore;
    }
    //toString
    @Override
    public String toString() {
        return "KidsStore{" +
                "toyStore='" + toyStore + '\'' +
                '}';
    }
}
