package mallpackage;

public class Book extends Product{

    private String isbn ;
    private String category;
    private String language;
    private boolean bookType;

    public Book(int productId, String description, float price, String isbn, String category, String language, boolean bookType) {
        super(productId, description, price);
        this.isbn = isbn;
        this.category = category;
        this.language = language;
        this.bookType = bookType;
    }

    public Book(int productId, String description, float price) {
        super(productId, description, price);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean getBookType() {
        return bookType;
    }

    public void setBookType(boolean bookType) {
        this.bookType = bookType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", category='" + category + '\'' +
                ", language='" + language + '\'' +
                ", bookType=" + bookType +
                '}';
    }

//Methods

    public boolean isElectronic(){
        if (getBookType()==true){
            return true;
        }else{
            return false;
        }
    }
}

