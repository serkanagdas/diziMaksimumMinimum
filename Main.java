import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Diziyi Tanımlama
        int[] array = {15,12,788,1,-1,-778,2,0};

        //kullanıcıdan sayı alma
        Scanner input = new Scanner(System.in);
        Arrays.sort(array);
        for (int i : array){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Girilen Sayı: ");
        int number = input.nextInt();


        //En yakın sayıları bulma
        int enKucukYakın = bulEnKucukYakinSayi(array, number);
        int enBuyukkYakın = bulEnBuyukYakinSayi(array, number);

        //Sonuçları Ekrana Yazdırma kısmı
        System.out.println("Girilen sayı: "+number);
        System.out.println("Girilen sayıdan buyuk en yakın sayı: "+enKucukYakın);
        System.out.println("Girilen sayıdan kucuk en yakın sayı: "+enBuyukkYakın);

    }

    private static int bulEnKucukYakinSayi(int[] array, int number)
    {
        Arrays.sort(array);
        for(int i=array.length-1;i>=0;i--)
        {
            if(array[i]<number)
            {
                return array[i];
            }
        }
        return -1;
    }

    private static int bulEnBuyukYakinSayi(int[] array, int number) {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] > number) {
                return array[i];
            }
        }
        return -1;
    }

}