package ArraysProject;
import java.util.Scanner;
import java.util.Arrays;

public class Study2 {
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
        int number;
        System.out.println("Kaç tane gireceğinizi yazınız :");
        number=in.nextInt();
        int list[]=new int[number];
        for(int i=0;i< list.length;i++){
           Scanner inp=new Scanner(System.in);

           System.out.println((i+1)+". sayıyı giriniz");
           list[i]= inp.nextInt();

        }

        Arrays.sort(list);
        System.out.println("Girilen en küçük sayı : "+list[0]);
        System.out.println("Girilen en büyük : "+list[list.length-1]);
    }
}
