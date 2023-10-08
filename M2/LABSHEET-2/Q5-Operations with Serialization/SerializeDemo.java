import java.io.*;
import java.io.Serializable;

class Student implements Serializable {
String name;
String regdno;
double cgpa;
}

public class SerializeDemo {
    public static void main(String[] args) throws Exception {
        try{
        Student s = new Student();
        s.name = "faizan";
        s.regdno = "20221cse021";
        s.cgpa = 7.5;
        FileOutputStream fileOut = new FileOutputStream("C:\\Users\\FAIZAN AHMED\\OneDrive\\Desktop\\VS CODE\\PROG\\SEM 3\\ADV JAVA\\M2\\LABSHEET-2\\Q5-Operations with Serialization\\123.txt");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(s);
        out.close();
        fileOut.close();
        System.out.printf("Serialized data is saved in /tmp/employee.ser");
    }
    catch(IOException e){
        System.out.println("Exception: " +e);
        System.exit(0);
    }
}


public class DeserializeDemo {
    public static void main(String[] args) throws Exception {
        Student s;
        try{
        FileInputStream fileIn = new FileInputStream("MARKS.txt");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        s = (Student) in.readObject();
        in.close();
        fileIn.close();
        System.out.println("Deserialized Student...");
        System.out.println("Name: " + s.name);
        System.out.println("Regd no: " + s.regdno);
        System.out.println("CGPA: " + s.cgpa);
    }
    catch(IOException e){
        System.out.println("Exception: " +e);
        System.exit(0);
    } 
}
}
}
