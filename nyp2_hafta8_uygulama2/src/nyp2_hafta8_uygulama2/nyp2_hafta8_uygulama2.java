package nyp2_hafta8_uygulama2;

public class nyp2_hafta8_uygulama2 {

	public static void main(String[] args) {
		Roman roman = new Roman("İki Şehrin Hikayesi", "Charles Dickens", "Epsilon Kitapçılık");
        Bilim bilim = new Bilim("Kozmos", "Carl Sagan", "İletişim Yayıncılık");

        roman.metinYazdir();
        System.out.println("");
        bilim.metinYazdir();
	}
}
