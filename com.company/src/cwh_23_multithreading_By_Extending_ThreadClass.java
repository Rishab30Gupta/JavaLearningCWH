class MyThread1 extends Thread {
    @Override
    public void run(){
        int i = 0;
        while(i < 10000) {
            System.out.println("My thread1 is running");
            System.out.println("I am happy");
            i++;
        }
    }
}
class MyThread2 extends Thread {
    @Override
    public void run(){
        int i = 0;
        while(i < 10000) {
            System.out.println("My thread2 is running");
            System.out.println("I am sad");
            i++;
        }
    }
}
public class cwh_23_multithreading_By_Extending_ThreadClass {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        //To start a thread use .start() method. run method is implemented in JAVA
        t1.start();
        t2.start();
    }
}
