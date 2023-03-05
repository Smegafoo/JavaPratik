package Giris;
import java.util.Scanner;

public class DortveBesinKatlari {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;
        int total1=0,total2=0,custom1=0,custom2=0;
        System.out.print("Bir sayı giriniz :");
        number = in.nextInt();
        System.out.println(number+" Sayısına kadar 4 sayısının kuvvetleri ;");

        for(int i =1;i<=number;i*=4){
            custom1 +=1;
            total1 +=i;
            System.out.print(i+" , ");
        }
        System.out.println();
        double avr1=(total1 / custom1);
        System.out.println("Çıkan sayıların toplamı :"+total1);
        System.out.println("Çıkan sayıların ortalaması :"+avr1);
        System.out.println(number+" Sayısına kadar 5 sayısının kuvvetleri ;");
        for (int k=1;k<=number;k*=5){
            custom2 +=1;
            total2 +=k;
            System.out.print(k+" , ");
        }
        System.out.println();
        double avr2 =(total2/custom2);
        System.out.println("Çıkan sayıların toplamı :"+total2);
        System.out.println("Çıkan sayıların ortalaması :"+avr2);

    }


}
