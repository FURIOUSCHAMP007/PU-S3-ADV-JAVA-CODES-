

class Task implements Runnable { 
 public void run() {
 System.out.println(Thread.currentThread()+" printing "); 
 System.out.println("Welcome"); 
 } 
}
 public class TestThread { 
 public static void main(String[] args) { 
 Task task = new Task();
 Thread t1= new Thread(task); 
 t1.setName("first");
 t1.start(); 
System.out.println(Thread.currentThread()+" printing ");
System.out.println("to Java"); 
 }
 }
