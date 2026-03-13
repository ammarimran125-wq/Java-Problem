//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int sub1, sub2, sub3, sub4, sub5;
        int total;
        double percentage;

        // Taking student's name
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        //taking inputs
        System.out.println("Enter marks of subject 1: ");
        sub1 = sc.nextInt();
        System.out.println("Enter marks of subject 2: ");
        sub2 = sc.nextInt();
        System.out.println("Enter marks of subject 3: ");
        sub3 = sc.nextInt();
        System.out.println("Enter marks of subject 4: ");
        sub4 = sc.nextInt();
        System.out.println("Enter marks of subject 5: ");
        sub5 = sc.nextInt();

        // Calculating Total
        total = sub1 + sub2 + sub3 + sub4 + sub5;

        // Calculating percentage
        percentage = total / 5.0;

        // Display Result
        System.out.println("\nStudent Name: " + name);
        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");

        sc.close();
    }
}