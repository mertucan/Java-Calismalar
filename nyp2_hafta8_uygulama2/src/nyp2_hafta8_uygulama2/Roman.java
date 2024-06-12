package nyp2_hafta8_uygulama2;

class Roman extends Kitap {
	public Roman(String baslik, String yazar, String yayinEvi) {
        super(baslik, yazar, yayinEvi);
    }

    @Override
    void metinYazdir() {
        System.out.println("Roman Kitabı: " + baslik + " - " + yazar + " - " + yayinEvi);
        System.out.println("Üstte adı verilen roman bir olay zinciri anlatır.");
    }
}
