class MyThread extends Thread { 
    String name;
    
    MyThread(String name) { 
        setName(name); 
        this.name = name;
        System.out.println("A New thread: " + name + " is created\n"); 
    } 
    
    public void run() { 
        try { 
            for (int j = 5; j > 0; j--) { 
                System.out.println(name + ": " + j); 
                Thread.sleep(1000); 
            } 
        } catch (InterruptedException e) { 
            System.out.println(name + " thread Interrupted"); 
        } 
        System.out.println(name + " thread exiting."); 
    } 
}

public class TestMultiThread { 
    public static void main(String args[]) { 
        MyThread t1 = new MyThread("one");
        MyThread t2 = new MyThread("two");
        MyThread t3 = new MyThread("three");
        t1.start();
        t2.start();
        t3.start(); 
        try { 
            Thread.sleep(8000); 
        } catch (InterruptedException exception) { 
            System.out.println("Interruption occurs in Main Thread"); 
        } 
        System.out.println("We are exiting from Main Thread"); 
    }
}
