class DemoClass {
    int a;
    public int getA(){
        return a;
    }
    DemoClass(int val){
        this.a = val;
    }
    public int returnOne(){
        return 1;
    }
}
class DemoClass2 extends DemoClass {
    DemoClass2(int c){
        super(c);
        System.out.println("I am a constructor");
    }
}
public class cwh_11_this_SuperKeyword {
    public static void main(String[] args) {
        DemoClass dc = new DemoClass(65);

        DemoClass2 d = new DemoClass2(5);

//        System.out.println(dc.getA());
    }
}
