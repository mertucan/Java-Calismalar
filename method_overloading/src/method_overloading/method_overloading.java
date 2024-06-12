package method_overloading;

public class method_overloading 
{

	public static void main(String[] args) 
	{
		Hesapla hesapla = new Hesapla();
		
		int kareAlan = hesapla.calculateArea(5); 	
		System.out.println("Karenin Alanı: " + kareAlan); 
		
		 int dikdortgenAlan = hesapla.calculateArea(5, 10); 
		System.out.println("Dikdörtgenin Alanı: " + dikdortgenAlan);
		
		float daireAlan = hesapla.calculateArea(4.5f); 
		System.out.println("Dairenin Alanı: " + daireAlan); 
	}

}
