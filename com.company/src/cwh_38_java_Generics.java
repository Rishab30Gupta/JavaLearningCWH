import java.util.ArrayList;
class myGeneric<T1>{
    int val;
    private T1 t1;
    public myGeneric(int val, T1 t1){
        this.val = val;
        this.t1 = t1;
    }

    public int getVal() {
        return val;
    }
    public void setVal(int val){
        this.val = val;
    }
    public T1 getT1() {
        return t1;
    }
    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}
public class cwh_38_java_Generics {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        //arrayList.add("str1");
        arrayList.add(54);
        arrayList.add(640);

        //int a = arrayList.get(1);
        //System.out.println(a);

        myGeneric<String> g1 = new myGeneric(20, "My string");
        String str = g1.getT1();
        System.out.println(str);
    }
}
