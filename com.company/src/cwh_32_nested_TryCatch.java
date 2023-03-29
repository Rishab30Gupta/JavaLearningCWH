import java.util.Scanner;

public class cwh_32_nested_TryCatch {
    public static void main(String[] args) {
        int [] arr = new int[3];
        arr[0] = 30;
        arr[1] = 50;
        arr[2] = 70;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.println("Enter the value of index: ");
            int idx = sc.nextInt();
            try{
                System.out.println("Welcome to tutorial");
                try{
                    System.out.println(arr[idx]);
                    flag = false;
                }
                catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Sorry this index does not exist");
                    System.out.println("Exception in level 2");
                }
            }
            catch (Exception e) {
                System.out.println("Exception in level 1");
           }
        }
        System.out.println("Thanks for using the program");
    }
}
