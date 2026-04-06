class Practice13 extends Thread{
    public void run(){
        while(true){
            try {
                Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Good Morning!");
        }
    }
}
class Practice13b extends Thread{
    public void run(){
        while(true){

            System.out.println("Welcome");
        }
    }
}
public class ps_threads {
    //question no 1
    public static void main(String[] args) {
        Practice13 T1 = new Practice13();
        Practice13 T2 = new Practice13();
        T1.setPriority(6);
        T2.setPriority(9);
        System.out.println(T1.getPriority());
        System.out.println(T2.getPriority());
        T1.start();
        T2.start();
    }
}
