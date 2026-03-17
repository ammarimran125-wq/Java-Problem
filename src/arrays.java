public class arrays {
    public static void main(String[] args) {
//        classroom of 500 students,you have to sore marks
//        i have 2 options
//        1)make 500 variable
//        2)Use Arrays (recomended)
//        there are three main ways to create an array in java
//        1) Declaration and  memory allocation
//          int [] marks = new int[5];
//        2) Declaration and then memory allocation
//        int [] marks;
//        marks = new int[5];
//          marks [0] = 100;
//          marks [1] = 78;
//          marks [2] = 60;
//          marks [3] = 75;
//          marks [4] = 89;
//        System.out.println(marks [4]);
//      Declaration, memory allocation and initialization   together
        int[] marks = {99, 88, 65, 70, 97};
//        System.out.println(marks.length);
//        System.out.println(marks[4]);
//        Displaying the Array naive method
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);
//     Displaying the array by using for loop

//        System.out.println("Printing using for loop");
//        for (int i = 0; i < marks.length; i++) {
//            System.out.println(marks[i]);
//      Displaying the array by for loop but in reverse order
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.println("Printing using for loop but in reverse order");
        }
    }
}

