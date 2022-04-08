import customerpackage.Customer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Scanner;
import java.nio.file.*;
import java.nio.file.Files;

public class Main {
    private static final Path filePath = Paths.get("C:\\FannieProjects\\mall-project\\signin.txt");
    public static void main(String[] args) throws IOException {
        System.out.println("\nWelcome to Vinci Mall");
        Scanner scanner = new Scanner(new File("C:\\FannieProjects\\mall-project\\signin.txt"));
        //final Path filePath = Paths.get("C:\\FannieProjects\\mall-project\\signin.txt");
        signin();
    }

    public static void signin() {
        System.out.println("Please sign in ");
        System.out.println("Enter your first name: ");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        System.out.println("\nEnter your last name: ");
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