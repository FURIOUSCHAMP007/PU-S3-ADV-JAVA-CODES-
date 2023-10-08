class Resource {
    void use(String name) {
        System.out.print("[" + name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}

class MyThread extends Thread {
    String name;
    Resource r;

    MyThread(String name, Resource r) {
        super(name);
        this.name = name;
        this.r = r;
    }

    public void run() {
        synchronized (r) {
            r.use(name);
        }
    }
}

public class TestMultiThread {
    public static void main(String args[]) {
        Resource res = new Resource();
        MyThread t1 = new MyThread("1st", res);
        MyThread t2 = new MyThread("2nd", res);
        MyThread t3 = new MyThread("3rd", res);
        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException exception) {
            System.out.println("Interruption occurs in Main Thread");
        }
    }
}
