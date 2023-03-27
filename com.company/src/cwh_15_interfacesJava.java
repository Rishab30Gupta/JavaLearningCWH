//Interface is a group of similar methods with no implementation
interface Bicycle{
    int x = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    void blowHorn1();
    void blowHorn2();
}

//Whenever we implement Bicycle we need to add all above methods in this class and
//all methods must be public
class AvonCycle implements Bicycle, HornBicycle{
    public void blowHorn(){
        System.out.println("Pii Pii........");
    }
    @Override
    public void applyBrake(int decrement) {
        System.out.println("Applying Brake");
    }
    @Override
    public void speedUp(int increment) {
        System.out.println("Speeding up the bicycle");
    }
    @Override
    public void blowHorn1() {
        System.out.println("Blowing Horn1 Pii Pii Pii......");
    }
    @Override
    public void blowHorn2() {
        System.out.println("Blowing Horn2 Poo Poo Poo......");
    }
}
public class cwh_15_interfacesJava {
    public static void main(String[] args) {
        AvonCycle myCycle = new AvonCycle();
        myCycle.applyBrake(1);
        System.out.println(myCycle.x); //you can create properties in interfaces
        //myCycle.x = 10; //you cannot modify properties in interfaces.

        myCycle.blowHorn1();
        myCycle.blowHorn2();
    }
}
