
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayının asal sayı olup olmadığını kontrol etmek için lütfen bir sayı giriniz...");
        int number = scanner.nextInt();
        
        int remainder = number % 2;
        
        boolean isPrime = true;
        
        if(number == 1){
            System.out.println(number + " Sayısı Asal değildir.");
            return;
        }
        
        if(number<1){
            System.out.println("Geçersiz sayı girdiniz.");
        }
        
        for(int i = 2 ; i < number ; i++) {
            if(number % i == 0){
                isPrime = false;
            }
        }
        
        if(isPrime){
            System.out.println(number + " Sayısı asaldır.");
        }
        else{
            System.out.println(number + " Sayısı asal değildir.");
        }
    }
    
    
}
