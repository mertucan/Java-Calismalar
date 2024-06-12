package type_casting;

public class type_casting 
{

	public static void main(String[] args) 
	{
		double d = 3.5; 
		int i; 
		i = (int)d; // Casting double'dan int'e dönüştürüyor, veri kaybı oluşur 0.5 yok olduğu için.
		
		System.out.println(i);
		
		i = 3; 
		d = i; // Castinge gerek yok.
		
		System.out.println(d); // 3.0 geleceği için veri genişlemesi söz konusudur.
		
		//final int m; // Değişmeyen değişkendir.
		//m = 8;       // Compiler hatası vermez. Çünkü içi boş olduğu için sonradan veri eklemesi yapıyoruz.

		i = 1; 
	    d = 3.5d; 
		//i = i + d; Hata! Casting gerekli 
		i = (int) (i + d);  //ok       
		i = 1; 
		i += d; // Otomatik olarak casting yapılıyor.   i=i+d;
		i -= d; // Otomatik olarak casting yapılıyor.     i=i-d;
		i *= d; // Otomatik olarak casting yapılıyor.    i=i*d;
		i/= d; // Otomatik olarak casting yapılıyor.    i=i/d;

		String s1 = new String("Merhaba"); 
		String s2 = new String("Merhaba"); 
		if (s1 == s2) 
				System.out.println("eşit"); 
		else 
				System.out.println("Farklı"); 
		s1 = s2; 
		if (s1 == s2) 
				System.out.println("eşit"); 
		else 
				System.out.println("Farklı"); 
		
		i = 1; // 0000 0000 0000 0001 
		i = i << 7; // 0000 0000 1000 0000 
		i = i >> 7; // 0000 0000 0000 0001 
		i = 64; // 0000 0000 0000 0000 0000 0000 0100 0000 
		i = i >>> 5; // 0000 0000 0000 0000 0000 0000 0000 0010 
		i = -128;
		i = i >> 2; // 1111 1111 1110 0000     -32 olur.
	}

}
