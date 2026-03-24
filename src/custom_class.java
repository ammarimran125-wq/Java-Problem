class Employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);
    }
}
public class custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee ammar = new Employee(); //Instantiating a new Employee Object
        Employee seraj = new Employee(); //Instantiating a new Employee Object

        //setting Attribtes
        ammar.id = 1;
        ammar.name = "Ammar Imran";
        seraj.id = 2;
        seraj.name = "Seraj Ghaffar";
        //Printing the Attributes
        ammar.printDetails();
        seraj.printDetails();


    }
}
