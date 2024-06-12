package ogrenci_uygulama;

public class Ogrenci 
{
	private static int sayac = 0;
    
    public Ogrenci() 
    {
        sayac++;
    }
    
    public static int ogrenciGetir() 
    {
        return sayac;
    }
	
	String ad;
	String soyad;
	int numara;
}
