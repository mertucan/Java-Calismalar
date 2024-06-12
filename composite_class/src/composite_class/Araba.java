package composite_class;

public class Araba 
{
	String marka;
	String model;
	String yil;
	int hiz;
	int mesafe;
	Kisi sahibi;
	
	public String getInfo() 
	{
		String bilgi = "Araba bilgileri: " + marka + " " + model + " " + yil + " " + hiz + " " + mesafe + " ";
		
		return bilgi;
	}
}
