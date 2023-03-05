package Giris;
import java.util.Scanner;

public class Not_ort {
    public static void main(String[] args) {
        System.out.println("Hello World!!");
        Scanner input=new Scanner(System.in);

        System.out.print("Enter your Mathematic note: ");
        int math=input.nextInt();

        System.out.print("Enter your Language note: ");
        int lang=input.nextInt();

        System.out.print("Enter your history note: ");
        int history=input.nextInt();

        System.out.print("Enter your geography note: ");
        int geography=input.nextInt();

        System.out.print("Enter your Music note: ");
        int music=input.nextInt();

        System.out.print("Enter your physical note: ");
        int physical =input.nextInt();

        System.out.print("Enter your biology note: ");
        int biology = input.nextInt();

        System.out.print("Enter your chemical note");
        int chemical=input.nextInt();

        int Total=(math+lang+history+geography+music+physical+biology+chemical);
        int Average=Total/8;
        System.out.println("Your Average Total note :"+Average);

        boolean result=(Average>=60);
        System.out.println(result);
    }
}
