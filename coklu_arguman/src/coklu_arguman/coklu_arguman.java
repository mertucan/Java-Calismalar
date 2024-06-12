package coklu_arguman;

public class coklu_arguman {

	public static void main(String[] args) 
	{
		int toplam1 = toplama(1, 2, 3, 4);
		int toplam2 = toplama(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		System.out.println("Toplam 1: " + toplam1);
		System.out.println("Toplam 2: " + toplam2);

	}
	
	public static int toplama(int... sayilar) 
	{
		int sonuc = 0;
		
		for (int i : sayilar) 
		{
			sonuc += i;
		}
		
		return sonuc;
	}

}
