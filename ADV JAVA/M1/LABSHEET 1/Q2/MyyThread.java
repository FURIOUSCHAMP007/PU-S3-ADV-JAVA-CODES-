public class MyyThread extends Thread {
    String name;
    MyyThread (String name) {
        setName(name);
        this.name = name;
        System.out.println("A new Thread "+ name + "created\n");
    }

    public void run() {
        try {
            for (int j = 5; j >0; j++) {
                System.out.println(name +":"+ j );
                Thread.sleep(1000);
            }
        }
         catch(InterruptedException e) { 
            System.out.println(name + "thread interrupted");
         }
        System.out.println(name +"Thread exiting");
    }


public static void main(String[] args) {
    MyyThread t1 = new MyyThread("one");
    MyyThread t2 = new MyyThread("two");
    MyyThread t3 = new MyyThread("three");
    t1.start();
    t2.start();
    t3.start();
}
}