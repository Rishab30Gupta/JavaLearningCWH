class Phone{
    public void on(){
        System.out.println("Turning on phone");
    }
    public void showTime(){
        System.out.println("Time is 12 Pm");
    }
}
class Smartphone extends Phone{
    @Override
    public void on(){
        System.out.println("Turning on smartphone");
    }
    public void music(){
        System.out.println("Playing music");
    }
}
public class cwh_13_dynamic_Method_Dispatch {
    public static void main(String[] args) {
        //Phone obj = new Phone();
        //Smartphone smobj = new Smartphone();
        //obj.name();

        //Dynamic method dispatch / run-time Polymorphishm
        Phone obj = new Smartphone(); //allowed
        //Smartphone obj2 = new Phone(); //not allowed
        obj.showTime();
        obj.on();
        //obj.music(); //not allowed
    }
}
