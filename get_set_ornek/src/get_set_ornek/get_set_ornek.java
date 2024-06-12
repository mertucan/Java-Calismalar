package get_set_ornek;

public class get_set_ornek {

	public static void main(String[] args) 
	{
		Kisi kisi = new Kisi();
		kisi.setIsim("Mert");
		
		System.out.println("Kişinin ismi: " + kisi.getIsim());
		
		kisi.setIsim(null);
		kisi.setIsim("");
		kisi.setIsim("Egemen");
		
		System.out.println("Kişinin yeni ismi: " + kisi.getIsim());
	}
}
