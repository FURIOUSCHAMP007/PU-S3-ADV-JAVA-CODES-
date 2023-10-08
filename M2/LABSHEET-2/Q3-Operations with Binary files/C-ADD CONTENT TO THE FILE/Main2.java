import java.io.*;
import java.util.Scanner;

public class Main2 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        FileOutputStream output = new FileOutputStream("C:\\Users\\FAIZAN AHMED\\OneDrive\\Desktop\\VS CODE\\PROG\\SEM 3\\ADV JAVA\\3CSE1\\DEMO\\DEMO.txt", true);
        String record = new String();
        String name;
        int regdno;
        char submitted, ch = 'n';

        do {
            System.out.println("Student Name, regdno in integer, submitted or not (y/n)");
            name = sc.next();
            regdno = sc.nextInt();
            submitted = sc.next().charAt(0);
            String newrecord = record.concat("\n").concat(name).concat("\t").concat(String.valueOf(regdno)).concat("\t\t").concat(String.valueOf(submitted));
            byte[] arrheader = newrecord.getBytes();
            output.write(arrheader);
            System.out.println("Enter 'y' for more students and 'n' to stop");
            ch = sc.next().charAt(0);
        } while (ch != 'n');

        System.out.println("File written.");
        output.close();
    }
}
