package Giris;

import java.util.Scanner;

public class CiftSayi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i;
        int toplam = 0, sayac = 0;
        System.out.print("Bir sayı giriniz :");
        i = in.nextInt();

        for (int k = 1; k <= i; k++) {
            if ((k % 3 == 0) && (k % 4 == 0)) {
                sayac +=1;
                toplam+=k;
                System.out.println(k);
            }

        }
        double ort = (toplam/sayac);
        System.out.println(ort);
    }

}

