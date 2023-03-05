package Giris;
import java.util.Scanner;

public class Ucgen {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter one side of triangle :");
        int a=in.nextInt();
        System.out.print("Enter second side of triangle");
        int b =in.nextInt();
        double c = Math.sqrt((a*a)+(b*b));
        System.out.println("Hipatenüs"+c);
        double d=(a+b+c);
        System.out.println("perimeter of triangle :"+d);
        double e=(a*b/2);
        System.out.println("area of triangle :"+e);






    }
}
