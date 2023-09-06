public class MyThread extends Thread {
    public void run() {
        int a = 10;
        int b = 12;
        int result = a+b;
        System.out.println("Started running..");
        System.out.println("Sum of two numbers is"+ result);
        System.out.println("Completed");
    }

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}

