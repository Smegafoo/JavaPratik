package Giris;

import java.util.Scanner;

public class HesapMakinasi {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, select;

        System.out.print("İlk sayınızı giriniz :");
        a = in.nextInt();
        System.out.print("İkinci sayınızı giriniz :");
        b = in.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select = in.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplama :" + (a + b));
                break;
            case 2:
                System.out.println("Çıkarma :"+(a-b));
                break;
            case 3:
                System.out.println("Çarpma :"+(a*b));
                break;
            case 4:
                if(b!=0){
                    System.out.println("Bölme :"+(a/b));
                }else{
                    System.out.println("Bir sayı sıfır ile bölünemez.");
                }
                break;
            default:
                System.out.println("Yanlış bir sayı seçtiniz lütfen bir daha deneyiniz.");
        }


    }
}
