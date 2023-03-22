public class cwh_2_methodOverloading {

    static void change1 (int a){
        a = 25;
    }

    static void change2 (int [] arr){
        arr[0] = 65;
    }

    static void tellJoke(){
        System.out.println("I invented a new word!\n" + "Plagiarism");
    }
    public static void main(String[] args) {
        //tellJoke();

        //changing integer using method - will not change as it is passed as a copy
        int x = 10;
        System.out.println("Value before changing x: " + x);
        change1(x);
        System.out.println("Value after changing x: " + x);

        //changing array value using method - will change as it is passed as an reference
        int [] marks = {77,91,52,97};  // Its a marks object storing addresses - passed reference
        System.out.println("Value before changing x: " + marks[0]);
        change2(marks);
        System.out.println("Value after changing x: " + marks[0]);

        fnc1();
        fnc1(3000);
    }

    //Method Overloading - same method name but performing different functionalities
    static void fnc1(){
        System.out.println("Good Morning");
    }
    static void fnc1(int a){
        System.out.println("Good Morning " + a);
    }
}
