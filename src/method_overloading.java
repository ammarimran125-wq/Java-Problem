public class method_overloading {
    static void foo(){
        System.out.println("Good morning bro!");
    }
    static void foo(int a){
        System.out.println("Good morning" + a + "bro!");
    }
    static void change(int a){
        a = 98;
    }
    static void change2(int[] arr){
        arr[0] = 98;
    }
    static void telljoke(){
        System.out.println("I invented a new word!\n" + "Plagriarsim!");
    }
    public static void main(String[] args) {
//        telljoke();
//        Case 1 "Changing the Integer"
//       int[]marks = {52, 73, 77,89, 98, 94};
//        int x = 45;
//        change(x);
//        System.out.println("The value of x after running change is: " + x);
//        Case 2 "Changing the Array"
//        int[]marks = {52, 73, 77,89, 98, 94};
//        change2(marks);
//        System.out.println("The value of x after running change is: " + marks[0]);
        //method overloading
        foo();
        foo(3000);//arguments are actual!
    }
}
