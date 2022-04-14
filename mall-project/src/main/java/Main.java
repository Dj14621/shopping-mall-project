import customerpackage.Customer;
import mallpackage.BookStore;
import mallpackage.ShoeStore;
import mallpackage.BookStore;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.nio.file.Files;

import static mallpackage.KidsStore.readToyStoreFile;


public class Main {
    //public static void main(String[] args) throws IOException {
    private static final Path filePath = Paths.get("C:\\FannieProjects\\shopping-mall-project\\mall-project\\signin.txt");
    private static final Path filePath1 = Paths.get("C:\\FannieProjects\\shopping-mall-project\\mall-project\\books.txt");

    public static void main(String[] args) throws IOException {


        System.out.println("\nWelcome to Vinci Mall\n");
        Scanner scanner = new Scanner(new File("C:\\FannieProjects\\shopping-mall-project\\mall-project\\signin.txt"));
        //final Path filePath = Paths.get("C:\\FannieProjects\\mall-project\\signin.txt");
        signin();

        //pick a store
        pickStore();
        



        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch (choice) {

            case 1:
                System.out.println("Welcome to BookStore");
                BookStore.readBookStoreFile("C:\\FannieProjects\\shopping-mall-project\\books.txt");
                break;
            case 2:
                System.out.println("Welcome to shoeStore");
                ShoeStore.loadShoes("C:\\FannieProjects\\shopping-mall-project\\shoes.txt");
                break;
            case 3:
                System.out.println("Welcome to ToyStore");
                readToyStoreFile("C:\\FannieProjects\\shopping-mall-project\\mall-project\\toys.txt");
                break;
            default:
                System.out.println("Please pick either (1 - 3)");

        }
        //Shoe shoe1 = new Shoe(0001, "best shoe", 50, "qwert213456", "Nike", "green", 10, true);
        //ShoeStore.loadShoes("C:\\FannieProjects\\shopping-mall-project\\shoes.txt");
        BookStore.readBookStoreFile("C:\\FannieProjects\\shopping-mall-project\\books.txt");




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
//      public static void writeAFile() {
//        try {
//            Files.writeString(filePath, "lets do shopping today");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
    //pick a store choice

    public static void pickStore() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose a store: ");
        System.out.println("1\t BookStore");
        System.out.println("2\t ShoeStore");
        System.out.println("3\t ToyStore");
        //System.out.println("Please choose a store: ");

    }

//

    public static void readBookStoreFile() {
        String temp;
        try {
            temp = Files.readString(filePath1);
            System.out.println(temp);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
//    public static void readToyStoreFile() {
//        String temp;
//        try {
//            temp = Files.readString(filePath2);
//            System.out.println(temp);
//        } catch (Exception e) {
//            e.printStackTrace();

//
}



