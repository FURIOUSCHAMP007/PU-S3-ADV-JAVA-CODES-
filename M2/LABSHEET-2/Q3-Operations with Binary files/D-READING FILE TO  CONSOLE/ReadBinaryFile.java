import java.io.*;

public class ReadBinaryFile {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\FAIZAN AHMED\\OneDrive\\Desktop\\VS CODE\\PROG\\SEM 3\\ADV JAVA\\3CSE1\\DEMO\\DEMO.txt");
        FileInputStream fis = new FileInputStream(file);

        try (BufferedReader br = new BufferedReader(new InputStreamReader(fis))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
