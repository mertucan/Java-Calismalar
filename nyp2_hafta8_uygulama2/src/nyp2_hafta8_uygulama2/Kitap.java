package nyp2_hafta8_uygulama2;

public abstract class Kitap {
	String baslik;
    String yazar;
    String yayinEvi;

    public Kitap(String baslik, String yazar, String yayinEvi) {
        this.baslik = baslik;
        this.yazar = yazar;
        this.yayinEvi = yayinEvi;
    }

    abstract void metinYazdir();
}
