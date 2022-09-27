
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

sayiBulmaca();
    }

    public static void sayiBulmaca() {
        boolean ok = false;

        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 0, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz : ");
        int findNumber = scanner.nextInt();

        for (int number : numbers) {
            if (number == findNumber) {
                ok = true;
                break;
            }

        }

        if (ok) {
            mesajVer("Sayı listede mevcuttur : " + findNumber);
        } else {
            mesajVer("Böyle bir numara listede bulunmamaktadır : " + findNumber);
        }
    }
    
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }

}
