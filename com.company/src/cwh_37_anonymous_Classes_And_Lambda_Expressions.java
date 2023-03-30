@FunctionalInterface
interface DemoAno{
    void meth1();
    //void meth2();
}
/*
class RishabFunc implements DemoAno{
    @Override
    public void meth1() {
        System.out.println("This is new method1");
    }
}
/*
class AnonyDemo implements DemoAno{
    public void display(){
        System.out.println("Hello");
    }

    @Override
    public void meth1() {
        System.out.println("I am method 1");
    }

    @Override
    public void meth2() {
        System.out.println("I am method 2");
    }
}
 */
public class cwh_37_anonymous_Classes_And_Lambda_Expressions {
    public static void main(String[] args) {

        //AnonyDemo obj = new AnonyDemo();
        //obj.meth1();

        //Anonymous Class
        /*
        DemoAno obj = new DemoAno() {
            @Override
            public void meth1() {
                System.out.println("I am method1");
            }

            @Override
            public void meth2() {
                System.out.println("I am method2");
            }
        };
        obj.meth1();
        */


        //DemoAno obj = new RishabFunc();
        //obj.meth1();

        //Lambda Expresssions
        DemoAno obj = ()->{System.out.println("I am new method 1 from this lambda");};
        obj.meth1();
    }
}
