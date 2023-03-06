package Giris;
import java.util.Scanner;

public class Yildiz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Bir basamak giriniz :");
        n=in.nextInt();

        for(int i=1;i<=n;i++){
            for(int k=1;k<=(n-i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int a=n-1;a>=1;a--){
           for(int b=1;b<=n-a;b++){
               System.out.print(" ");
           }
           for(int c=1;c<=(2*a)-1;c++){
               System.out.print("*");
           }
            System.out.println();
        }


    }
}
