abstract class Pen{
   abstract void write();
   abstract void refill();
}
class FountainPen extends Pen{
    void write(){
        System.out.println("Write...");
    }
    void refill(){
        System.out.println("Refill...!");
    }
    void changeNib(){
        System.out.println("Changing the nib");
    }

    }
    class Monkey{
      void jump(){
          System.out.println("Jumping...");
      }
      void bite(){
            System.out.println("Biting...");
        }
    }
    interface BasicAnimal{
    void eat();
    void sleep();
    }


    class Human extends Monkey implements BasicAnimal{
      void speak(){
            System.out.println("Hello Sir..!");
        }

        @Override
        public void eat() {
            System.out.println("Eating");
        }

        @Override
        public void sleep() {
            System.out.println("Sleeping");
        }
    }
    public class Ps_chap11 {
    public static void main(String[] args) {
        //Question 1&2;
        FountainPen pen = new FountainPen();
        pen.changeNib();


        //Question 3;
        Human harry = new Human();
        harry.sleep();


        //Question 5;
        Monkey m1 = new Human();
       // m1.speak(); ----> Cannot use speak method because the reference is monkey which does not have speak method.


    }
}
