package constructor_uygulama;

public class Cicek 
{
	private String tur;
    private String renk;

    // İki parametreli kurucu
    public Cicek(String yeniTur, String yeniRenk) 
    {
        tur = yeniTur;
        renk = yeniRenk;
    }
    
    public void cicegiYazdir() 
    {
        System.out.println("Çiçeğin türü: " + tur + ", Rengi: " + renk);
    }

    public Cicek(String yeniTur) 
    {
        this(yeniTur, "Kırmızı"); 
    }
    
    public Cicek() 
    {
        this("Gül", "Kırmızı"); 
    }

}
