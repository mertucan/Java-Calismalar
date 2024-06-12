package inheritance;

public class inheritance {
    public static void main(String[] args) {
       
        Mudur mudurNesnesi = new Mudur("Mert", 36000, 4000, 27);
        Calisan calisanNesnesi = new Calisan("Sezen Hoca", 72000);
        Yonetici yoneticiNesnesi = new Yonetici("Eda", 50000, 2500);

        mudurNesnesi.bilgileriGetir();
        System.out.println("------------");
        calisanNesnesi.bilgileriGetir();
        System.out.println("------------");
        yoneticiNesnesi.bilgileriGetir();
    }
}