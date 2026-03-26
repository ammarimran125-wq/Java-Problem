package demo;

public class Ps_constructor {


    public static void main(String[] args) {
        // problem no 1
        Cylinder Mycylinder = new Cylinder();
        Mycylinder.setHeight(12);
        System.out.println(Mycylinder.getHeight());
        Mycylinder.setRadius(9);
        System.out.println(Mycylinder.getRadius());

        //Pronlem No2;
        System.out.println(Mycylinder.surfaceArea());
        System.out.println(Mycylinder.volume());

    }
}
