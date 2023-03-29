public class cwh_35_finally_Block {
    public static int greet(){
        try {
            int a = 50;
            int b = 2;
            int c = a / b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Cleaning up the resouces");
        }
        return -1;
    }
    public static void main(String[] args) {
        int k = greet();
        System.out.println(k);
    }
}
