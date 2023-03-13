package Giris;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String UserName,password;
        int right=3;
        int balance=1500;
        while(right > 0){
        System.out.print("Lütfen kullanıcı adınızı giriniz :");
        UserName = in.nextLine();
        System.out.print("Lütfen Şifrenizi giriniz :");
        password = in.nextLine();
        if(UserName.equals("Emir Uyar") && password.equals("java123")){
            Scanner inp = new Scanner(System.in);
            System.out.println("Yapmak istediğiniz işlemi seçiniz :\n1)Para yatırma.\n2)Para çekme.\n3)Bakiye sorgulama.\n4)Çıkış yapma.");
            int select =inp.nextInt();
            switch(select){
                case 1:
                    System.out.print("Yatıracğınız miktarı yazınız :");
                    int price=inp.nextInt();
                    balance+=price;
                    break;
                case 2:
                    System.out.println("Çekmek istediğiniz miktarı yazınız :");
                    price=inp.nextInt();
                    if(price>balance){
                        System.out.println("Yeterli miktarda bakiyeniz bulunmamaktadır!");
                    }else{
                        balance-=price;
                    }
                    break;
                case 3:
                    System.out.println("Bakiyeniz :"+balance);
                    break;
                case 4:
                    System.out.println("Çıkış yapılıyor!");
                    break;
                default:
                    System.out.println("Yanlış bir numara girdiniz lütfen tekrar deneyiniz!");
            }
        }else{
            System.out.println("Girdiğiniz kullanıcı adı veya şifre yanlıştır lütfen tekrar deneyiniz!");
        }
        right--;
            if(right==0){
                System.out.println("Hesabınız bloke olmuştur lütfen bankamızla temasa geçiniz");
            }else{
               System.out.println("Kalan deneme hakkınız :"+right);
            }


        }

    }
}
