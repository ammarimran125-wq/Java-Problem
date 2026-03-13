import java.util.Scanner;
import static java.lang.System.*;

public class ps4 {
    public static void main(String[] args) {
//        int a = 10;
//        if(a==10) {
//            ;
//            out.println("I am 10");
//        } else {
//            out.println("I am not 10");
//        }
//problem no 2
//        byte m1,m2,m3;
//        Scanner sc = new Scanner(System.in);
//        out.println("Enter your marks in physics");
//        m1 = sc.nextByte();
//        out.println("Enter your marks in chemistry");
//        m2 = sc.nextByte();
//        out.println("Enter your marks in maths");
//        m3 = sc.nextByte();
//        float avg = (m1+m2+m3)/3.0f;
//        out.println("Your Overall Per is: " + avg);
//        if(avg>=40 && m1>33 && m2>33 && m3>33){
//            out.println("Congrats,you have been promoted!");
//        }
//        else out.println("Sorry,you have not promoted,try again");
//    }
//}
//      Problem 3 calculate income tax
        try (Scanner sc = new Scanner(System.in)) {
            out.println("Enter Your Income in lacs per annum");
            float tax = 0;
            float income = sc.nextFloat();
            if (income<=2.5){
                tax = tax + 0;
            }
            else if (income>2.5f && income<=5f){
                tax = income + 0.05f * (income - 2.5f);
            }
            else if (income>5f && income<=10.0f){
                tax = tax + 0.05f * (5.0f - 2.5f);
                tax = tax + 0.2f * (income - 5f);
            }
            else if (income>10.0f) {
                tax = tax + 0.05f * (5.0f - 2.5f);
                tax = tax + 0.2f * (10.0f - 5f);
                tax = tax + 0.3f * (income - 10.0f);
            }
            out.println("The total tax paid by an employee is: " + tax);
        }
    }
}

