package nyp_hafta5;

public class SonUygulama {
	static int i = 20;
	String isim;
	{
		System.out.println("İsim: " + isim);
	}
	
	A a = new A();
	
	static {
		System.out.println("İlk i değer: " + i);
	}
	
	public SonUygulama() {
		this("SonUygulama");
		System.out.println("SonUygulama() içinde.");
	}
	
	public SonUygulama(String isim)
	{
		this("SonUygulama", i);
		System.out.println("SonUygulama(String isim) içinde.");
	}
	
	public SonUygulama(String isim, int i)
	{
		this.isim = isim;
		System.out.println("SonUygulama(String isim, int i) içinde.");
	}
}
