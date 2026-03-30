package practiceofabstarchclassandmethod;
abstract class Parent{
    public Parent(){ //constructor
        System.out.println("I am a Base 2 constructor");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}

class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }


}
public class Abstract {
    public static void main(String[] args) {

    }
}
