import java.io.*;
public class PrintWriterDemo {
public static void main(String[] args) {
PrintWriter pw = new PrintWriter(System.out,true);
pw.println("using print writer object");
int i=-7;
pw.println(i);
double d=4.5;
pw.println(d);
}
}
