//Abstract means non-existing [khyaali pulao]

//If a class is abstract and you are inheriting another class whose parent class is
//abstract then this class must contain all it's abstract methods as there in parent class
//or declare itself as abstract

abstract class Parent{
    public Parent(){
        System.out.println("I am a constructor of class Base2");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}

class child1 extends Parent{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
}

abstract class child2 extends Parent{
    public void fnc(){
        System.out.println("I am good");
    }
}

public class cwh_14_abstractClasses_Interfaces {
    public static void main(String[] args) {
        //child1 c = new child1(); //allowed

        //Parent p = new Parent(); //not allowed as it's an abstract class
    }
}
