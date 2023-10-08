import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter file name and folder name");
            String filename = sc.next();
            String foldername = sc.next();
            FileOutputStream output = new FileOutputStream(foldername + "\\" + filename + ".dat");
            System.out.println("File created");
            String header = "Name\tRegdno\tEssaysubmitted";
            byte[] arrheader = header.getBytes();
            output.write(arrheader);
            System.out.println("File written");
            output.close();
        }
    }
}
  