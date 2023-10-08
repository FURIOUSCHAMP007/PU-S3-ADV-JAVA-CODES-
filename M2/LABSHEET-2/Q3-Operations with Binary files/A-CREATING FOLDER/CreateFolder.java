import java.io.*;
import java.util.Scanner;

public class CreateFolder {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter folder name");
            String foldername = sc.next();
            File f = new File(foldername);
            if (f.exists() && f.isDirectory()) {
                System.out.println("Already exists");
            } else if (f.mkdir() == true) {
                System.out.println("Successfully created");
            } else {
                System.out.println("Cannot be created");
            }
        }
    }
}
