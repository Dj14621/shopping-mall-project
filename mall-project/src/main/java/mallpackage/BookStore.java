package mallpackage;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

public class BookStore extends Stores{

    private static final Path filePath1 = Paths.get("C:\\FannieProjects\\shopping-mall-project\\mall-project\\books.txt");
    private List <Book> bookList ;

    //Constructor

    public BookStore(String storId, String name, int storeSize, String taxId) {
        super(storId, name, storeSize, taxId);
    }

    public BookStore(String storId, String name, int storeSize, String taxId, List<Book> bookList) {
        super(storId, name, storeSize, taxId);
        this.bookList = bookList;
    }

    public static void readBookStoreFile(String s) {

    }
//Getters and setters

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    //Methods




    public int getNumberOfBooks(){
        int size ;
        size = bookList.size();
        return size;
    }
// Search for a book and  update isbn of the book
    public void updateBooklist(String isbnSearch ,  String newIsbn, String category, String language, boolean bookType ,int productId, String description,float price){

    for(int i =0;i<=this.bookList.size()-1;i++){
        if (getBookList().get(i).getIsbn()==isbnSearch){
            getBookList().get(i).setIsbn(newIsbn);
        }
    }

    }
// add a book to the list
    public void addBooklist(String isbn, String category, String language, boolean bookType, int productId, String description, float price) {
           Book book1 = new Book(productId, description, price, isbn, category, language, bookType);
        getBookList().add(book1);
    }

    public void deleteBooklist(  String isbnSearch) {

        for(int i =0;i<=this.bookList.size()-1;i++){
            if (getBookList().get(i).getIsbn()==isbnSearch){
                getBookList().remove(i);
            }
        }
    }
    //to string

    @Override
    public String toString() {
        return "BookStore{" +
                "bookList=" + bookList +
                '}';
    }

}
