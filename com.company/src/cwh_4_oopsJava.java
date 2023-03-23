class Employee {
    //These are attributes/properties
    int id;
    int salary;
    String name;

    //These are methods/functions/behaviour
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);
    }
    public int getSalary(){
        return salary;
    }
}
public class cwh_4_oopsJava {
    public static void main(String[] args) {
        System.out.println("This is our custom class code");

        Employee rishab = new Employee(); // Instantiating a new Employee object

        //Setting attributes
        rishab.id = 30;
        rishab.name = "CodeWithRishab";
        rishab.salary = 110000;
//        System.out.println(rishab.id);
//        System.out.println(rishab.name);

        Employee john = new Employee();
        john.id = 27;
        john.name = "John Abhrahim";
        john.salary = 650000;

        john.printDetails();
        rishab.printDetails();

        int salary = rishab.getSalary();
        System.out.println("rishab salary is : " + salary);
    }
}
