
public class Main {

    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel...";
        String yeniMesaj = mesaj.substring(0, 2);
        System.out.println(yeniMesaj);
        System.out.println(sehirVer());
        System.out.println(topla(22, 33));

        System.out.println(topla2(3, 4, 5, 6, 7, 8));

    }

    public static void ekle() {
        System.out.println("Eklendi");
    }

    public static void sil() {
        System.out.println("Silindi");
    }

    public static void guncelle() {
        System.out.println("Güncellendi");
    }

    public static int topla(int sayi1, int sayi2) {
        int toplam = 0;
        toplam = sayi1 + sayi2;
        return toplam;
    }

    public static int topla2(int... sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;

        }
        return toplam;

    }

    public static String sehirVer() {
        return "Ankara";
    }
}
