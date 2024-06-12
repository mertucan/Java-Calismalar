package type_casting_deneme;

public class type_casting_deneme 
{

	public static void main(String[] args) 
	{
		int a = 6, b = 5, c = 10;
		
		float sonuc = a + ++b * c / a * b;
		System.out.println("Sonuç=" +sonuc); // 66.0
		System.out.println("b=" +b); // 6
		
		sonuc = a + (++b) * ((c/a)*b);
		System.out.println("Sonuç=" +sonuc); // 55.0
		System.out.println("a="+a+" b="+b+" c="+c); // a=6 b=7 c=10
		
		a+=b+=c;
		System.out.println("a="+a+" b="+b+" c="+c); // a=23 b=17 c=10
	}

}
