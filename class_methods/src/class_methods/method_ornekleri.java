package class_methods;

public class method_ornekleri 
{
	public void selamVer() 
	{
        System.out.println("Merhaba Dünya!");
    }
	
	public void ismiYazdir(String isim) 
	{
        System.out.println("Merhaba " + isim + "!");
    }

	public String sabitMesajGetir() 
	{
        return "Sabit mesaj";
    }
	
    public int kareAl(int sayi) 
    {
        return sayi * sayi;
    }


}
