package MIISC;
import java.io.*;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        // Check if two command-line arguments are provided
        if (args.length != 2) {
            System.out.println("DEMO\\DEMO.txt");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            while ((i = fin.read()) != -1) {
                fout.write(i);
            }
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        } finally {
            // Close the input and output streams in a finally block
            if (fin != null) {
                fin.close();
            }
            if (fout != null) {
                fout.close();
            }
        }

        System.out.println("File copied successfully.");
    }
}

