package inheritance;

public class Calisan {
    protected String isim;
    protected int maas;

    public Calisan(String isim, int maas) {
        this.isim = isim;
        this.maas = maas;
    }
    
    public void bilgileriGetir() {
        System.out.println("İsim: " + isim + "\nMaaş: " + maas);
    }
}
