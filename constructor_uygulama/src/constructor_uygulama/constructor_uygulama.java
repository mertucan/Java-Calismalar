package constructor_uygulama;

public class constructor_uygulama {

	public static void main(String[] args) 
	{
		Cicek cicek1 = new Cicek();
	    cicek1.cicegiYazdir();
	    Cicek cicek2 = new Cicek("Menekşe");
	    cicek2.cicegiYazdir();
	    Cicek cicek3 = new Cicek("Papatya", "Beyaz");
	    cicek3.cicegiYazdir();
	}

}
