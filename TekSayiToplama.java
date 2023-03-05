package Giris;

import java.util.Scanner;

public class TekSayiToplama {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int i;
        int total = 0;
        do {
            System.out.print("Sayı Giriniz :");
            i = in.nextInt();
            if ((i % 4 == 0)) {
                total += i;
            }

        } while (i % 2 == 0);
        System.out.println("Sayıların Toplamı :" + total);


    }
}
