package ArraysProject;
import java.util.Scanner;

public class Study1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceğinizi yazınız :");
        int number = in.nextInt();
        int list[]=new int[number];
        int sum=0;
        int div=0;
        for(int i=0;i< list.length;i++){
            Scanner inp=new Scanner(System.in);
            System.out.println((i+1)+". sayıyı giriniz :");
            list[i]=inp.nextInt();
            sum +=list[i];
            div++;

        }
        double average=(sum/div);
        System.out.println("Girdiğiniz sayıların toplamı :"+sum);
        System.out.println("Girdiğiniz sayıların ortalaması :"+average);


    }
}
