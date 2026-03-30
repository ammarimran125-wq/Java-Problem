package practiceofabstarchclassandmethod;
interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface blowHorn{
    void blowHornK3g();
    void blowHornmhn();
}
class AvonCycle implements Bicycle, blowHorn {    //it was only allowed in interfaces..!
    void blowHorn(){
        System.out.println("Pee Pee Poon Poon");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");

    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUP");
    }
    public void blowHornK3g(){
        System.out.println("Kabhi kushi kabhi gham pee pee pee pee");
    }
    public void blowHornmhn(){
        System.out.println("Main hoon naw po po po po");

    }
}
public class Interface {
    public static void main(String[] args) {
        AvonCycle cycleHarry= new AvonCycle();
        cycleHarry.applyBrake(1);
        //you can create properties in interfaces
        System.out.println(cycleHarry.a);
        //you cannot modify the properties in interfaces as they are final...!
        //cycleHarry.a=454;
        cycleHarry.blowHornK3g();
        cycleHarry.blowHornmhn();

    }
}
