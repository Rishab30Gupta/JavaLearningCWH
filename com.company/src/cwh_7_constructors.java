class MyMainEmployee{
    private int id;
    private String name;

    //Default constructor
    //Here method overloading also exists
    public MyMainEmployee(){
        id = 70;
        name = "Your-Name-Here";
    }

    //Parameterized constructor
    public MyMainEmployee(String myName) {
        id = 45;
        name = myName;
    }
    public MyMainEmployee(String myName, int myId) {
        id = myId;
        name = myName;
    }

    public String getName(){
        return name;
    }
    public void setName(String str){
        this.name = str;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        this.id = i;
    }
}
public class cwh_7_constructors {
    public static void main(String[] args) {

        //The problem here is we don't want everytime to set attributes like this.
        //It may happen we may have 100+ attributes so setting each of them like this will be tedious.
        MyMainEmployee rishab = new MyMainEmployee("rg" , 77);
        //rishab.setName("CodeWithRishab");
        //rishab.setId(30);

        System.out.println(rishab.getId());
        System.out.println(rishab.getName());
    }
}
