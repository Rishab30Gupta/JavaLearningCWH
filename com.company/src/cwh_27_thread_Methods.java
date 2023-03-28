class MyThr2 extends Thread {

    public void run(){
        while(true) {
            System.out.println("Thank you starting thread thr2 ");
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class MyThr3 extends Thread {

    public void run(){
        int i = 0;
        while(i < 50000) {
            System.out.println("Thank you starting thread thr3 ");
            i++;
        }
    }
}
public class cwh_27_thread_Methods {
    public static void main(String[] args) {
        MyThr2 t1 = new MyThr2();
        t1.start();

        MyThr3 t2 = new MyThr3();
        t2.start();

        /*
        try{
            t1.join(); //Usage - if we want t2 to start after completing t1 then we use join method. This should be within try catch block as it can happen thread might be killed
        }
        catch (Exception e){
            System.out.println(e);
        }
        */
    }
}
