interface MyCamera2 {
    public void takeSnap();
    public void recordVideo();

    //We can also create private methods but can call them inside interface only
    private void greet(){
        System.out.println("Good Morning");
    }

    //There are default methods which are implemented in interfaces only.
    //We can override this method in class below and that method will work.
    default void record4KVideo(){
        //greet();
        System.out.println("Recording 4K Video");
    }

}
interface MyWifi2 {
    String[] getNetworks();
    void connectToNetwork (String network);
}
class MyCellPhone2 {
    void callNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone2 extends MyCellPhone2 implements MyWifi2, MyCamera2{
    @Override
    public void takeSnap() {
        System.out.println("Taking Snap");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording Video");
    }

    @Override
    public String[] getNetworks() {
        System.out.println("Getting list of networks: ");
        String[] networkList = {"Idea", "Airtel","Vodafone","Jio"};
        return networkList;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to: " + network);
    }
    public void sampleMethod(){
        System.out.println("Method calling");
    }
    //If this method is overriden this will work not above one.
    //@Override
    //public void record4KVideo() {
    //    System.out.println("Taking Snap and recording in 4K");
    //}
}
public class cwh_18_polymorphism_In_Interfaces {
    public static void main(String[] args) {

        //If we are making a reference of MyCamera2 then it can only use methods of this interface only.
        //This is a Smartphone - use it as a camera
        MyCamera2 cam1 = new MySmartPhone2();
        //cam1.getNetworks(); //not allowed
        //cam1.sampleMethod(); //not allowed

        //cam1.record4KVideo();

        MySmartPhone2 ms2 = new MySmartPhone2();
        ms2.sampleMethod();
        ms2.record4KVideo();
        ms2.getNetworks();
        ms2.callNumber(9900);

    }
}
