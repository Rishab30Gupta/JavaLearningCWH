import java.util.Scanner;

public class cwh_31_handling_Specific_Exceptions {
    public static void main(String[] args) {
        int [] arr = new int[3];
        arr[0] = 30;
        arr[1] = 50;
        arr[2] = 70;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array index ");
        int idx = sc.nextInt();

        System.out.println("Enter the number from which index to be divided ");
        int num = sc.nextInt();

        try{
            System.out.println("Value at array index entered is: " + arr[idx]);
            System.out.println("Value of array value / number is: " + arr[idx] / num);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception occured");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound Exception occured");
        }
        catch (Exception e){
            System.out.println("Some other exception occured");
        }
    }
}
