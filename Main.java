import java.math.MathContext;
import java.util.Scanner;
public class Main {
    static void usHesaplama(){
        int num,i,us,sonuc=1;

        Scanner input = new Scanner(System.in);

        System.out.println("Taban değerini giriniz: ");
        num = input.nextInt();

        System.out.println("Üs değerini giriniz: ");
        us = input.nextInt();

        if(num == 0 ){
            sonuc = 0;
          
        }
        if(us ==0){

            System.out.println("Sonuç: "+sonuc);
        }
        else{
            sonuc =(int) Math.pow(num,us);
            System.out.println("Sonuç: "+sonuc);
        }
    }

    public static void main(String[] args) {
        usHesaplama();


    }
}
