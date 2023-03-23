class Base1 {
    Base1(){
        System.out.println("I am a constructor");
    }
    Base1(int a){
        System.out.println("I am an overloaded constructor with value of a :" + a);
    }
}

//super keyword is used when we want our parent's class parameterized constructor to be called
class Derived1 extends Base1 {
    Derived1(){
//        super(10);
        System.out.println("I am a derived class constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am an overloaded derived class constructor with value of y as: " + y);
    }
}

class childOfDerived extends Derived1{
    childOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
    childOfDerived(int x, int y, int z){
        super(x , y);
        System.out.println("I am an overloaded child of derived constructor with value of z as : " + z);
    }
}

//Note first parent class constructor is called then child class constructor is called
public class cwh_10_constructors_Inheritance {
    public static void main(String[] args) {
//        Base1 b = new Base1();
//        Derived1 d = new Derived1();

//        Derived1 d2 = new Derived1(14,9);
//        childOfDerived cd = new childOfDerived();

          childOfDerived cd2 = new childOfDerived(15,25,35);
    }
}
