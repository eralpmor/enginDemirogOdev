
public class Main {
    public static void main(String[] args) {
        System.out.println("Engin Demiroğ Java Lessons");
        
        System.out.println("-----------------------------------------------");
        //VARIABLES
        
        int ogrenciSayisi = 10;
        int ogretmenSayisi = 5;
        
        System.out.println("Öğrenci Sayısı : " + ogrenciSayisi);
        System.out.println("Öğretmen Sayısı :" + ogretmenSayisi);
        
        System.out.println("-----------------------------------------------");
        //DATA TYPES
        
        byte a = -128;
        double b = 15.5;
        int c = 21;
        char d = 'D';
        boolean dogruMu = false;
        
        System.out.println(a + b + c);
        
        System.out.println("-----------------------------------------------");
        //CONDITIONALS 
        
        int sayi = 19;
            if(sayi < 20){
                System.out.println("Sayı 20'den küçüktür.");
            }
            else if(sayi > 20) {
                System.out.println("Sayı 20'den büyüktür.");
            }
            else {
                System.out.println("Sayı 20'ye eşittir.");
            }
        
        System.out.println("-----------------------------------------------");
        //recapDemo
        
        int sayi1 = 100;
        int sayi2 = 90;
        int sayi3 = 110;
        int enBuyuk = sayi1;

        
            if(enBuyuk < sayi2){
            enBuyuk = sayi2;
            }
            if(enBuyuk < sayi3){
                enBuyuk = sayi3;
            }
        System.out.println("En Büyük Sayı : " + enBuyuk );
        
        System.out.println("-----------------------------------------------");
        //switchDemo
        
        char grade = 'A';
        
        switch (grade) {
            case 'A':
                System.out.println("Mükemmel : Geçtiniz!");
            case 'B':
                System.out.println("Çok Güzel : Geçtiniz!");
            case 'C':
                System.out.println("İyi : Geçtiniz!");
            case 'D':
                System.out.println("Fena Değil : Geçtiniz!");
            case 'F':
                System.out.println("Maalesef : Kaldınız!");
                break;
            default:
                System.out.println("Geçersiz Not Girdiniz!");
        }
        
        System.out.println("-----------------------------------------------");
        //loopDemo
            //FOR
            
        for(int f = 1 ; f < 10 ; f+=2){
            System.out.println(f);
        }
            System.out.println("For Döngüsü Bitti.");
            
            //WHILE
        
        int x = 2;
        while(x<10){
            System.out.println(x);
            x+=2;
        }
            System.out.println("While Döngüsü Bitti.");
            
            //DO WHILE
        
        int m = 100;
        do{
            System.out.println(m);
            m++;
        }while(m<10);
            System.out.println("Do - While Döngüsü Bitti.");
            
            
        System.out.println("-----------------------------------------------");
        //ARRAYS
        
        String ogrenci1 = "Eralp";
        String ogrenci2 = "İrem";
        String ogrenci3 = "Mustafa";
        String ogrenci4 = "İsmail";
            System.out.println(ogrenci1);
            System.out.println(ogrenci2);
            System.out.println(ogrenci3);
            System.out.println(ogrenci4);
            
        System.out.println("**************************");
        
        String[] ogrenciler = new String[4];
            ogrenciler[0]= "Eralp";
            ogrenciler[1]= "İrem";
            ogrenciler[2]= "Mustafa";
            ogrenciler[3]= "İsmail";
            
        for(int i = 0 ; i < ogrenciler.length ; i++){
            System.out.println(ogrenciler[i]);
        }
        System.out.println("**************************");
        
        for (String ogrenci : ogrenciler){
            System.out.println(ogrenci);   
        }
        
        System.out.println("-----------------------------------------------");
        //recapDemo2
        
        double[] myList = {1.2,1.3,3.4,5.6};
            double total = 0;
            double max = myList[0];
        for(double number : myList){
            if(max<number){
                max = number;
            }
            
            total = total + number;
            System.out.println(number);
        }
            System.out.println("Toplam = " + total);
            System.out.println("En Büyük Sayı = " + max);
            
        
        System.out.println("-----------------------------------------------");
        //multiDimensionalArrayDemo
        
        String[][] sehirler = new String[3][3];
        
        sehirler[0][0] = "İstabul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Bilecik";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Kayseri";
        sehirler[2][0] = "Diyarbakır";
        sehirler[2][1] = "Şanlıurfa";
        sehirler[2][2] = "Gaziantep";
        
        for(int i = 0 ; i <= 2 ; i++){
            System.out.println("========================");
            for(int j = 0 ; j <= 2 ; j++){
                System.out.println(sehirler[i][j]);
            }
        }
        
        System.out.println("-----------------------------------------------");
        //stringsDemo
        
        String mesaj = "Bugün hava çok güzel";
        System.out.println(mesaj);
        
        System.out.println("Eleman sayısı : " + mesaj.length());
        System.out.println("5. Eleman : " + mesaj.charAt(4));
        System.out.println( mesaj.concat(" Yaşasın!"));
        
        String mesaj2 = mesaj.concat(" Yaşasın!");
        System.out.println(mesaj2);
        
        System.out.println(mesaj.startsWith("A"));
        System.out.println(mesaj2.endsWith("!"));
        
        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);
        
        System.out.println(mesaj.indexOf('a'));
        System.out.println(mesaj.lastIndexOf('a'));
        
        
        System.out.println("-----------------------------------------------");
        //stringsDemo2
        
        System.out.println(mesaj.replace(' ', '-'));
        System.out.println(mesaj.substring(2,5));
        
        for(String kelime : mesaj.split(" ")){
            System.out.println(kelime);
        }
        
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        
        System.out.println(mesaj.trim());                                     //Başta ve sonda olan boşlukları yok eder.
       
    }
        
        
}
