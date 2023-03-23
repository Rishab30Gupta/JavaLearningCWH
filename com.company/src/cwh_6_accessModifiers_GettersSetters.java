class MyEmployee{

    //If these attributes are private they cannot be accessed directly outside the class
    //To access them we need to write methods which are Getters/Setters
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String str){
        //We can use name = str and this.name = str - both works well
        this.name = str;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
       this.id = i;
    }
}
public class cwh_6_accessModifiers_GettersSetters {
    public static void main(String[] args) {
        System.out.println("Learning Access Modifiers");

        MyEmployee rishab = new MyEmployee();
         //Throws out error due to private access modifiers
         //rishab.id = 30;
         //rishab.name = "CodeWithRishab";

        rishab.setName("CodeWithRishab");
        rishab.setId(30);

        System.out.println(rishab.getName());
        System.out.println(rishab.getId());
    }
}
