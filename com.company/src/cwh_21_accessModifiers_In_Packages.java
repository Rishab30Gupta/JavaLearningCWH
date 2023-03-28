class C1 {
    public int a = 5;
    protected int b = 10;
    int c = 15;
    private int d = 20;

    //All four modifiers can be used within same class
    public void method1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
public class cwh_21_accessModifiers_In_Packages {
    public static void main(String[] args) {

        C1 obj = new C1();
        //obj.method1();

        //Public, Protected, Default modifiers can be used only within same package
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        //System.out.println(obj.d); //not allowed as it is a private data member
    }
}
