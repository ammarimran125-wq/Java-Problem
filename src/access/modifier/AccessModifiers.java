package access.modifier;

class MyEmployee{
   private int id;
   private String name;
   //Due to usage of private access modifier we use getter and setters
   public String getName(){
       return name;
   }

    public void setName(String n) {
        name = n;
    }

    public void setId(int i){
        id = i;
    }

    public int getId() {
        return id;
    }
}


public class AccessModifiers {
    public static void main(String[] args) {
       MyEmployee harry = new MyEmployee();
       //harry.id = 45;
       //harry.name = "CodeWithHarry";----eroor throws due to private access modifierS
        harry.setName("CodeWithHarry");
        System.out.println(harry.getName());
        harry.setId(234);
        System.out.println(harry.getId());

    }
}
