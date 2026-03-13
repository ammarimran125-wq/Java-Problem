import java.util.Scanner;
public class KmtoMiles {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double kilometers;
        double miles;
        //Input kilometers
        System.out.println("Enter distance in kilometers");
        kilometers = sc.nextDouble();
        //Convert kilometers into miles
        miles =  kilometers * 0.621371;
        //Display Result
        System.out.println("Distance in miles : " + miles);
        sc.close();

    }
}
