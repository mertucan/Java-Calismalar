package inheritance;

public class Yonetici extends Calisan {
    protected int bonus;
    
    public Yonetici(String isim, int maas, int bonus) {
        super(isim, maas);
        this.bonus = bonus;
    }

    public void bilgileriGetir() {
        System.out.println("İsim: " + isim + "\nMaaş: " + maas + "\nBonus: " + bonus);
    }
}
