import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class reading_file {
    
    public static void main(String[] args) throws Exception {
        File fileOBJ = new File("C:\\Users\\FAIZAN AHMED\\OneDrive\\Desktop\\VS CODE\\PROG\\SEM 3\\ADV JAVA\\3CSE1\\DEMO\\Hello.txt");
        FileReader file = new FileReader(fileOBJ);
        BufferedReader br = new BufferedReader(file);
        String line;

        while((line =br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
    }
}

    


