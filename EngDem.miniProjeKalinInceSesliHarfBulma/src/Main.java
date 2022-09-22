
public class Main {
    public static void main(String[] args) {   
        char harf = 'e';

        switch (harf) {
            case 'A' : 
            case 'a' : 
            case 'O' : 
            case 'o' : 
            case 'I' :
            case 'ı' : 
            case 'U' : 
            case 'u' :
                System.out.println("Girdiğiniz harf kalın ünlü bir harftir.");
                break;
            case 'E' : 
            case 'e' : 
            case 'Ö' : 
            case 'ö' : 
            case 'İ' : 
            case 'i' :  
            case 'Ü' : 
            case 'ü' : 
                System.out.println("Girdiğiniz harf ince ünlü bir harftir.");
break;
            default:
                System.out.println("Girdiğiniz harf ünsüz bir harftir.");     
        }
    }
}


      

