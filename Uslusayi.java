package Giris;
import java.util.Scanner;

public class Uslusayi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,k;
        int result=1;
        System.out.print("Üssü alınacak sayıyı giriniz :");
        n=in.nextInt();
        System.out.print("Üs olacak sayıyı giriniz :");
        k=in.nextInt();
        for(int i=1;i<=k;i++){
            result *=n;

        }
        System.out.println(result);
    }

}
