package my_practice;

import java.util.Scanner;
public class Ps1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int a =  sc.nextInt();

        System.out.println("Enter value of b: ");
        int b = sc.nextInt();

        System.out.println("Print value of a is: " + a);
        System.out.println("Print value of b is " + b);
        sc.close();



    }
}
