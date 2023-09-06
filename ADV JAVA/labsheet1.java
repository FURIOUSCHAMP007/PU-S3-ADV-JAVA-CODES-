class labsheet1 implements Runnable{
    public void run(){
        System.out.print( Thread.currentThread().getName());

    }
    public static void main(String args[]){
        labsheet1 obj = new labsheet1();
        labsheet1 obj2 = new labsheet1();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj2);
        t1.setName(" satvik ");
        t2.setName(" KR ");
    
        t1.start();
        t2.start();



    }

}
