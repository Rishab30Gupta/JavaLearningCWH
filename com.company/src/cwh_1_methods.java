public class cwh_1_methods {

    //Methods are functions which are used in different programming languages.\
    //DRY principle is used which say's Do not Repeat Yourself

    //Things to remember : If using normal way of methods use static keyword
    //                     Other way is to create object of class and then call this function



    /*
    static int logic (int x, int y){
        int z =  x + y;
        return z;
    }
    public static void main(String[] args) {
        int a = 30;
        int b = 20;
        if(a > b){
            int ans = logic(a , b);
            System.out.println(ans);
        }
        else System.out.println(a);
    }
     */

    //2nd way
    int logic (int x, int y){
        int z =  x + y;
        return z;
    }
    public static void main(String[] args) {
        int a = 30;
        int b = 20;

        cwh_1_methods obj = new cwh_1_methods();

        if(a > b){
            int ans = obj.logic(a , b);
            System.out.println(ans);
        }
        else System.out.println(a);
    }
}
