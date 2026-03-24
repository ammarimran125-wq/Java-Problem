public class practicesetclass_chap8 {
   static class Employee{
        int salary;
        String name;

        public int getSalary() {
            return salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String n) {
           name = n;
        }
    }
    static class CellPhone{
       public void ring(){
           System.out.println("Ringing...");
       }
       public void vibrate(){
           System.out.println("Vibrating...");
       }
       public void callfriend(){
           System.out.println("Calling Seraj...");
       }
    }
    static class Square{
       int side;
       public int area (){
           return side*side;
       }
       public int perimeter(){
           return 4*side;

        }
    }
    public static void main(String[] args) {
       /*
        //Problem 1
        Employee harry = new Employee();
        harry.setName("CodeWithHarry");
        harry.salary = 233;
        System.out.println(harry.getSalary());
        System.out.println(harry.getName());
        //Problem 2
        CellPhone Samsung = new CellPhone();
        Samsung.callfriend();
        Samsung.ring();
        Samsung.vibrate();
       */
        //Problem 3
        Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
   }
}
