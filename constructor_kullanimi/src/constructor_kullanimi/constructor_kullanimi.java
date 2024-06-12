package constructor_kullanimi;

public class constructor_kullanimi {

	public static void main(String[] args) 
	{
		Cicek cicek1 = new Cicek("Gül", "Kırmızı"); 
		Cicek cicek2 = new Cicek(" Orkide ", "Beyaz");
	}

	public class Cicek 
	{
	    private String tur;
	    private String renk;

	    // İki parametreli kurucu
	    public Cicek(String yeniTur, String yeniRenk) {
	        tur = yeniTur;
	        renk = yeniRenk;
	    }

	    // Tek parametreli kurucu
	    public Cicek(String yeniTur) {
	        this(yeniTur, "Kırmızı"); // Burada this kullanarak diğer kurucuyu çağırıyoruz
	    }

}
