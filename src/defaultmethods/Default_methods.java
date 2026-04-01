package defaultmethods;
interface MyCamera {
   void takeSnap();
   void recordVedio();
   default void record4KVedio(){ //if we want to add this method but not want to call in main we use default keyword we can override this also..
       System.out.println("Recording in 4K...");
   }
}

interface MyWifi{
   String[] getNetworks();
   void connectToNetwork(String network);

}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling" +  phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");

    }
   // void takeSnap(){
   //     System.out.println("Taking Snap");
    }
//}
class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
    public void takeSnap(){
            System.out.println("Taking Snap");
    }
    public void recordVedio(){
        System.out.println("Taking Snap");
    }
    public String[] getNetworks(){
        System.out.println("Getting List Of Networks");
        String[] netweorkList = {"Harry", "Prashant", "Anjali"};
        return netweorkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to" + network);
    }


}
public class Default_methods {
    public static void main(String[] args) {
        MySmartPhone Tecno = new MySmartPhone();
       String[] ar = Tecno.getNetworks();
       for(String item:ar){
            System.out.println(item);
        }


    }
}
