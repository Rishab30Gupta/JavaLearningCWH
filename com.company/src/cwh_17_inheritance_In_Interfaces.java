interface sampleInterface {
    public void method1();
    public void method2();
}

//Inheriting One interface to another
interface childSampleInterface extends sampleInterface {
    public void method3();
    public void method4();
}
class mySampleClass implements childSampleInterface {

    //Here we have to define method1 and method2 also because childSampleInterface also extends sampleInterface
    @Override
    public void method3() {
        System.out.println("Calling method3");
    }

    @Override
    public void method4() {
        System.out.println("Calling method4");
    }

    @Override
    public void method1() {
        System.out.println("Calling method1");
    }

    @Override
    public void method2() {
        System.out.println("Calling method2");
    }
}
public class cwh_17_inheritance_In_Interfaces {
    public static void main(String[] args) {

        mySampleClass obj = new mySampleClass();
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
    }
}
