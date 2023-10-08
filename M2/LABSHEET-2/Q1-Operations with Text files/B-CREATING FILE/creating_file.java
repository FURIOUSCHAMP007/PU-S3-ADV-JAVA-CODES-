import java.io.FileWriter;
import java.util.Scanner;
public class creating_file {
    public static void main(String[] args) throws Exception {
        String essay = "this is a TEXT to enter to the  file ";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name");
        String fileName = sc.nextLine();
        System.out.println("Enter the folder name");
        String folderName = sc.nextLine();
        FileWriter Newfile = new FileWriter(folderName+"\\"+fileName+".txt");
        System.out.println("file create");
        Newfile.write(essay);
        sc.close();
        Newfile.close();
    }
}