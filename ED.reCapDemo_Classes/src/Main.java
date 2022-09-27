
public class Main {
    public static void main(String[] args) {
       
    DortIslem dortIslem = new DortIslem();
        int sonuc1 = dortIslem.Topla(4, 3);
        int sonuc2 = dortIslem.Cikar(4, 3);
        int sonuc3 = dortIslem.Carp(4,3);
        int sonuc4 = dortIslem.Bol(4, 3);
        
        System.out.println("Toplam : " + sonuc1);
        System.out.println("Fark : " + sonuc2);
        System.out.println("Çarpım :" + sonuc3);
        System.out.println("Bölüm :" + sonuc4);
        
}
}
