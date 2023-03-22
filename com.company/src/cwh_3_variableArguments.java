public class cwh_3_variableArguments {

    //Usage- As we increase the number of arguments we don't want everytime we make new methods
    //This problem is solved by varargs

    /*
    static int sum (int a, int b){
        return a+b;
    }
    static int sum (int a, int b, int c){
        return a+b+c;
    }
    static int sum (int a, int b, int c, int d){
        return a+b+c+d;
    }
    */

    // ...says whatever number of arguments we got pack it in a array and give us
    static int sum(int ...arr){

        int result = 0;
        for(int x : arr){
            result += x;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("VarArgs Tutorial");

        System.out.println("The sum of 4 and 5 is :" + sum(4, 5));
        System.out.println("The sum of 4, 5 and 6 is :" + sum(4, 5 ,6));
        System.out.println("The sum of 4, 5, 6 and 7 is :" + sum(4, 5 ,6 ,7));
    }
}
