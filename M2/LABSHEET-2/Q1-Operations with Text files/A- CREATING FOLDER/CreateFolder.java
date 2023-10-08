import java.io.File;
import java.util.Scanner;

public class CreateFolder {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.println("Enter folder name");
            String foldername = sc.next();
            File f = new File(foldername);
            if (f.exists() && f.isDirectory()) {
                System.out.println("Folder already exists");
            } else if (f.mkdir()) {
                System.out.println("Folder successfully created");
            } else {
                System.out.println("Folder cannot be created");
            }
        }
    }
}
