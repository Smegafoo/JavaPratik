package Giris;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int number;
        int tempnumber;
        int basNumber=0;
        int basValue;
        int basPow;
        int result=0;
        Scanner in=new Scanner(System.in);
        System.out.print("Bir Sayı giriniz :");
        number=in.nextInt();
        tempnumber=number;
        while(tempnumber !=0){
            tempnumber /=10;
            basNumber++;
        }
        tempnumber=number;
        while(tempnumber !=0){
            basValue=(tempnumber%10);
            basPow=1;
            for(int i=1;i<=basNumber;i++){
                basPow *=basValue;
            }
            result +=basPow;
            tempnumber /=10;
        }
        if(result ==number){
            System.out.println(number+" bir armstrong sayısıdır!");
        }else{
            System.out.println(number+" bir armstrong sayısı değildir!");
        }

    }


}
