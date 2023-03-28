class MyThr1 extends Thread {
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        int i = 0;
        while(i < 1000) {
            System.out.println("Thank you " + this.getName());
            i++;
        }
    }
}
public class cwh_26_threadPriorities {
    public static void main(String[] args) {
        // Ready Queue : T1 T2 T3 T4 T5
        MyThr1 t1 = new MyThr1("Rishab Gupta [most important]"); //ideally we want it's priority at the very max
        MyThr1 t2 = new MyThr1("Raju Singh");
        MyThr1 t3 = new MyThr1("Karan Sharma");
        MyThr1 t4 = new MyThr1("Khushi Gupta");
        MyThr1 t5 = new MyThr1("Varun Russell");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        t1.setPriority(Thread.MAX_PRIORITY); //set to max priority
        t2.setPriority(Thread.MIN_PRIORITY);
    }
}
