package futbol_projesi;

public class Futbol 
{
	int formano;
	String ad;
	boolean oyundami;
	int oynamasuresi;
	int golsayisi;
	
	void oyna(int i)
	{
		oynamasuresi = oynamasuresi + i;
	}
	
	void golsay()
	{
		golsayisi += 1;
	}
}
