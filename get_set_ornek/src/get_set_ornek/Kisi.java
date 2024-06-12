package get_set_ornek;

public class Kisi 
{
	private String isim;
	
	public String getIsim() 
	{
		return isim;
	}
	
	public void setIsim(String yeniIsim) 
	{
		if (yeniIsim != null && !yeniIsim.isEmpty()) 
		{
			isim = yeniIsim;
		} 
	
		else 
		{
			System.out.println("Geçerli bir isim giriniz.");
		}
	}

}
