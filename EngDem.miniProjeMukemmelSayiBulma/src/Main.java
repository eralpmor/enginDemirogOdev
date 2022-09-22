
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz (Negatif değerler, 1 ve 0 hariç) : ");
        int number = scanner.nextInt();
        int total = 0;
        
        boolean mukemmelMi = true;
            for(int i = 1 ; i < number ; i++){
                if(number % i == 0){
                    total = total + i;
                }
            } 
            
            if(number <= 1){
            System.out.println("Geçersiz sayı girdiniz.");
            return;
            }
            
            if (total == number){
                System.out.println("Bu sayı bir mükemmel sayıdır.");
            }
            else {
                System.out.println("Bu sayı mükemmel bir sayı değildir.");
            }
    }
    
}
