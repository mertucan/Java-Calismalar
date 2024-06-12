package composite_class;

public class Kisi 
{
	String tcno;
	String ad;
	String soyad;
	Araba arac;
	
	public String getInfo() 
	{
		String bilgi = "Kişi bilgileri: " + tcno + " " + ad + " " + soyad;
		
		return bilgi;
	}
}
