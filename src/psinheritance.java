class Circle{
    public int radius;
    Circle(int r){
        System.out.println("I am circle parameterized constructor");
        this.radius = r;
    }

    public double area(){
        return Math.PI * this.radius * this.radius;

    }
}
class Cylinder extends Circle{
    Cylinder(int r, int h){
        super(r);
        System.out.println("I am Cylinder parameterized constructor");
        this.height = h;
    }
    public int height;
    public double volume(){
        return Math.PI * this.radius * this.radius * this.height;
    }
}
    public class psinheritance {
    public static void main(String[] args) {
        //Problem 1
       // Circle objC = new Circle(12);
        Cylinder obj = new Cylinder(12,4);
    }
}
