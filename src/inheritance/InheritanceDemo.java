package inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        //Creating an object of base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        //Creating an object of derived class
        Derived d = new Derived();
        d.setX(43);
        System.out.println(d.getX());


    }
}

