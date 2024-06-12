package nyp_hafta4;

public class nyp_hafta4 {

	public static void main(String[] args) {
		Arac otomobil = new Otomobil(180, "34 MRT 293", "Citroen", "Engine v8"); //Marka ve Motor ayrı
        Arac kamyon = new Kamyon(80, "34 UCN 248", 8, 12); //Tekerlek ve Kamyon Yaşı ayrı

        otomobil.hizLimitiniYazdir();
        otomobil.aracPlakaYazdir();

        System.out.println("--------------------------");

        kamyon.hizLimitiniYazdir();
        kamyon.aracPlakaYazdir();
	}

}
