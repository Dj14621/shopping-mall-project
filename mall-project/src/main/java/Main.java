import customerpackage.Customer;
import mallpackage.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Scanner;
import java.nio.file.*;
import java.nio.file.Files;
import java.util.Set;

public class Main {
    private static final Path filePath = Paths.get("C:\\FannieProjects\\shopping-mall-project\\mall-project\\signin.txt");
    public static void main(String[] args) throws IOException {


        Shoe shoe1 = new Shoe(0001, "best shoe", 50, "qwert213456", "Nike", "green", 10, true);
        //Shoe shoe2 = new Shoe(0002, "best shoe", 50, "qwert213456", "Nike", "green", 10, true);



        ShoeStore myShoeList = new ShoeStore("00001", "DSC", 1000, "234567890", "Kids");
        myShoeList.toString();
        myShoeList.addShoe(shoe1);
        myShoeList.toString();


       // BookStore bookStore = new BookStore();


//
//        Book book1 = new Book(0004, "good book", 20, "2132efdbgnh", "History", "arabic", true)
//
//        Toy toy1 = new Toy(0005, "doll", 10, "Toys'r us", false);
//
//
//        System.out.println("\nWelcome to Vinci Mall\n");
//        Scanner scanner = new Scanner(new File("C:\\FannieProjects\\shopping-mall-project\\mall-project\\signin.txt"));
//        //final Path filePath = Paths.get("C:\\FannieProjects\\mall-project\\signin.txt");
//        signin();

    }

    public static void signin() {
        System.out.println("Please sign in: \n");
        System.out.println("Enter your first name: \n");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        System.out.println("\nEnter your last name: \n");
        String lastName = scanner.next();
        System.out.println("Enter your password: ");
        String password = scanner.next();
        Customer customer1 = new Customer(firstName, lastName, password);
        Customer customer2 = new Customer(firstName, lastName, password);


        //Update
        //System.out.print("\nCalling the update file method.");
        //writeAFile();

        //Read a file
        readAFile();
    }

    //Read
    public static void readAFile() {
        String temp;
        try {
            temp = Files.readString(filePath);
            System.out.println(temp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Update
//    public static void writeAFile() {
//        try {
//            Files.writeString(filePath, "lets do shopping today");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }


}