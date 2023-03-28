interface MyCamera {
    public void takeSnap();
    public void recordVideo();

    //We can also create private methods but can call them inside interface only
    private void greet(){
        System.out.println("Good Morning");
    }

    //There are default methods which are implemented in interfaces only.
    //We can override this method in class below and that method will work.
    default void record4KVideo(){
        greet();
        System.out.println("Recording 4K Video");
    }

}
interface MyWifi {
    String[] getNetworks();
    void connectToNetwork (String network);
}
class MyCellPhone {
    void callNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
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

    //If this method is overriden this will work not above one.
    //@Override
    //public void record4KVideo() {
    //    System.out.println("Taking Snap and recording in 4K");
    //}
}
public class cwh_16_Interface_Examples {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        String[] arr = ms.getNetworks();
        for(String item : arr){
            System.out.println(item);
        }

        ms.record4KVideo();
        //ms.greet(); //not allowed as it is a private method
    }
}
