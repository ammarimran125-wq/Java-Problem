public class foreachloopandarray {
    public static void main(String[] args) {

        int[] marks = {98,55,66,77,88,99};

        System.out.println("Printing using for loop");
        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }

        System.out.println("Printing in reverse order");
        for(int i = marks.length - 1; i >= 0; i--){
            System.out.println(marks[i]);
        }

        System.out.println("Printing using for-each loop");
        for(int element : marks){
            System.out.println(element);
        }
    }
}
