package nyp2_hafta8_uygulama2;

class Bilim extends Kitap {
	public Bilim(String baslik, String yazar, String yayinEvi) {
        super(baslik, yazar, yayinEvi);
    }

    @Override
    void metinYazdir() {
        System.out.println("Bilim Kitabı: " + baslik + " - " + yazar + " - " + yayinEvi);
        System.out.println("Üstte adı verilen kitap bilimsel bir kitaptır.");
    }
}
