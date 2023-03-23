import java.util.BitSet;

class Base {
    int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        System.out.println("I am in base class and setting x now: ");
        this.x = x;
    }
    public void printMe(){
        System.out.println("I am a constructor");
    }
}

//Using Inheritance
class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}
public class cwh_9_inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(10);
        System.out.println(b.getX());

        //As Derived class is a subclass of Base it can use it's method functions
        Derived d = new Derived();
        d.setX(40);
        System.out.println(d.getX());
    }
}
