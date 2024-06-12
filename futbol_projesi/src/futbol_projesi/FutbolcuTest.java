package futbol_projesi;

public class FutbolcuTest 
{

	public static void main(String[] args) 
	{
		Futbol f1 = new Futbol();
		f1.formano = 7;
		f1.ad = "Mert";
		f1.oyundami = true;
		f1.oynamasuresi = 0;
		f1.golsayisi = 0;
		
		f1.oyna(90);
		f1.golsay();
		
		System.out.println("Gol sayısı = " +f1.golsayisi);
		System.out.println("Oynama süresi = " + f1.oynamasuresi);
	}

}
