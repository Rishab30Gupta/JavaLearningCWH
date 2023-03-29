@FunctionalInterface
interface myFunctionalInterface {
    void thisMethod();
//    void thisMethod2();
}
class NewPhone extends Phone{
    @Override
    public void showTime() {
        System.out.println("Time is 5 Pm");
    }

    @Deprecated
    public int sum(int a , int b){
        return a + b;
    }
}
public class cwh_36_annotations_Java {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        NewPhone np = new NewPhone();
        np.showTime();

        int x = np.sum(10,20);
        System.out.println(x);
    }
}
