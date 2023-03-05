package Giris;
import java.util.Scanner;

public class KDV {public static void main(String[]args){

    Scanner in =new Scanner(System.in);

    System.out.print("Enter your cost :");
    double cost=in.nextDouble();

    double kdv=0.18;

    double kdv_tutar=cost*kdv;

    double kdv_toplam_tutar=kdv_tutar+cost;

    System.out.println("Your KDV cost :"+kdv_tutar);
    System.out.println("Your Total cost with KDV :"+kdv_toplam_tutar);





}
}
