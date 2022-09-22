
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

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
            System.out.println("Sayı listede mevcuttur.");
        } else {
            System.out.println("Böyle bir numara listede bulunmamaktadır.");
        }
    }

}
