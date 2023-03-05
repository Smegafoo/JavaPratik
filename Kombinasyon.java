package Giris;
import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,r,kombinasyon;
        int totaln=1;
        int totalr=1;
        int totalnr=1;
        System.out.print("Eleman sayısı (n) sayısını giriniz :");
        n = in.nextInt();
        for(int i=1;i<=n;i++){

            totaln *=i;
        }
        System.out.print("Seçim sayısı (r) sayısını giriniz :");
        r =in.nextInt();
        for(int i=1;i<=r;i++){
            totalr *=i;
        }
        for(int i=1;i<=(n-r);i++){
            totalnr *=i;
        }
        kombinasyon = totaln /(totalr * totalnr);
        System.out.println("Girdiğiniz sayıların kombinasyanu :"+kombinasyon);


    }
}
