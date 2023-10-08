import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class copying_File {
    
    public static void main(String[] args) throws Exception{
        File source = new File("M2\\LABSHEET-2\\Q1-Operations with Text files\\D-COPYING FILE\\DEMO.txt");
        File target = new File("M2\\LABSHEET-2\\Q1-Operations with Text files\\D-COPYING FILE\\Hello.txt");
        FileReader SourceRead = new FileReader(source);
        FileWriter targWriter = new FileWriter(target);
        BufferedReader trReader = new BufferedReader(SourceRead);
        PrintWriter printing = new PrintWriter(targWriter,true);
        String Str;
        while((Str = trReader.readLine()) != null){
            //targWriter.write(Str);
            printing.println(Str);
        }
        trReader.close();
        printing.close();

    }
}