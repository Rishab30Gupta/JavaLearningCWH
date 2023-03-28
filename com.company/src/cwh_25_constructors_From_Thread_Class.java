class MyThr extends Thread {
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i = 0;
        while(i < 100) {
            System.out.println("I am a thread");
            i++;
        }
    }
}
public class cwh_25_constructors_From_Thread_Class {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Rishab");
        MyThr t2 = new MyThr("Candr");

        t1.start();
        t2.start();

        System.out.println("The id of thread is " + t1.getId());
        System.out.println("The name of thread is " + t1.getName());

        System.out.println("The id of thread is " + t2.getId());
        System.out.println("The name of thread is " + t2.getName());
    }
}
