import java.io.File;
class FileDemo {
static void print(String s) {
System.out.println(s);
}
public static void main(String args[]) {
File f1 = new File("M2\\demo.txt");
print("File Name: " + f1.getName());
print("Path: " + f1.getPath());
print("Abs Path: " + f1.getAbsolutePath());
print("Parent: " + f1.getParent());
print(f1.exists() ? "exists" : "does not exist");
print("File last modified: " + f1.lastModified());
print("File size: " + f1.length() + " Bytes");
}
}
