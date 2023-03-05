package Giris;
import java.util.Scanner;

public class Uslusayi {
    public static void main(String[] args) {
        int n,k;
        Scanner in = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz :");
        n =in.nextInt();
        System.out.print("Üs olacak sayıyı giriniz :");
        k = in.nextInt();
        int total=1;
        int i=1;
        while(i<=k){
            i++;
            total *=n;
        }
        System.out.println("Cevabınız :"+total);

    }

}
