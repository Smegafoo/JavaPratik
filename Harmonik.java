package Giris;
import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {
        int harmonik;
        double result=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        harmonik = in.nextInt();
        for(int i=1;i<=harmonik;i++){
           result +=(1.0/i);
        }
        System.out.println(result);




    }
}
