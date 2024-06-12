package inheritance;

public class Mudur extends Yonetici {
    protected int hisse;
    
    public Mudur(String isim, int maas, int bonus, int hisse) {
        super(isim, maas, bonus);
        this.hisse = hisse;
    }

    public void bilgileriGetir() {
        System.out.println("İsim: " + isim + "\nMaaş: " + maas + "\nBonus: " + bonus + "\nHisse: " + hisse);
    }
}