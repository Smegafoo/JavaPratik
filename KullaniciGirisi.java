package Giris;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String userName, password;
        int a;
        System.out.print("kullanıcı adınızı giriniz :");
        userName = in.nextLine();

        System.out.print("Şifrenizi giriniz :");
        password = in.nextLine();
        //Kullanıcı adı ve şifremizi girdik.

        if(userName.equals("Emir") && password.equals("java101")){
            System.out.println("Başarılı bir şekilde giriş yaptınız !");
        }else{
            System.out.println("Kullanıcı adı veya şifreniz yanlış !");
            System.out.println("1-Şifrenizi sıfırlamak için !\n2-Geri dönmek için !");
            a = in.nextInt();
            //Yanlış girilen şifre için işlem talep edildi.

            if (a == 1){
                String newpassword1,newpassword2;
                Scanner input = new Scanner(System.in);

                System.out.println("Lütfen yeni şifre giriniz !");
                newpassword1=input.nextLine();

                System.out.println("Lütfen yeni şifrenizi tekrar giriniz");
                newpassword2=input.nextLine();
                //Şifre sıfırlama işleminde yeni şifreyi ve tekrarını istedik.

                if(!newpassword1.equals(newpassword2)){
                    System.out.println("Girdiğiniz şifreler birbirleri ile uyuşmuyor !");
                }else if(newpassword1.equals(password)){
                    System.out.println("Yeni şifreniz eski şifreniz ile aynı olamaz");
                }else{
                    System.out.println("Şifreniz başarılı bir şekilde değiştirilmiştir !");
                }
                //Yeni şifredeki yapılacak hataları eğer varsa

            }else if (a == 2){
                System.out.println("Geri dönüyorsunuz !");
            }else{
                System.out.println("Yanlış bir sayı girdiniz !");
            }
            //Şifre değiştirme istememe durumu kodlandı
        }
    }
}




