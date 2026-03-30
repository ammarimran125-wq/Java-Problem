package dynamicmethod;

public class Dynamic_method_dispatch {
    public static void main(String[] args) {
       // Phone obj = new Phone();             //making object in this line and its allowed in java
       // SmartPhone smobj = new SmartPhone(); //making object in this line and its allowed in java
       // obj.name();

        Phone obj = new SmartPhone(); // super class ka refernce  haii ye braber ho sakta ha sub class ke object ke..!
        //SmartPhone obj2 = new Phone();// not allowed for ex we can say nokia 3310 a Smart Phone....!
        obj.showTime();
        obj.on(); //object ka method run hoga,,refernce ka on run nai hoga..!
        //obj.music(); //not allowed
    }
}
class Phone{
    public void showTime(){
        System.out.println("Time is 8 AM");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music....");
    }
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}