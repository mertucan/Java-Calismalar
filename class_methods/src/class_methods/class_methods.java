package class_methods;

public class class_methods 
{

	public static void main(String[] args) 
	{
        method_ornekleri ornek = new method_ornekleri();
        
        ornek.selamVer();
        ornek.ismiYazdir("Mert");
        
        String mesaj = ornek.sabitMesajGetir();
        System.out.println(mesaj);
        
        int kare = ornek.kareAl(5);
        System.out.println("Sayının karesi: " + kare);
	}
	
	

}
