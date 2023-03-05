package Giris;
import java.util.Scanner;

public class IkininKatlari {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int number;
        int total=0,custom=0;
        System.out.print("Bir Sayı giriniz :");
        number = in.nextInt();

        System.out.println("Girdiğiniz sayıya kadar ki 2 sayısının üsleri :");

        for(int i=1;i<=number;i*=2){
            custom +=1;
            total +=i;
            System.out.println(i);
        }
        System.out.println("Çıkan sayıların toplamı :"+total);
        double avr =(total / custom);
        System.out.println("Çıkan sayıların toplamının ortalaması :"+avr);

    }
}
