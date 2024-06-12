package nyp2_hafta5_uygulama;

public class SonUygulama {
	static int i = 20;
	String isim;
	{
		isim = "mert";
		System.out.println("İsim: " + isim);
	}
	
	//static A a = new A();
	
	A a = new A();
	static {
		System.out.println("İlk değer i= " + i);
	}
	
	public SonUygulama() {
		this("SonUygulama1");
		System.out.println("SonUygulama() içinde");
	}
	
	public SonUygulama(String isim) {
		this("SonUygulama2", 1);
		System.out.println("SonUygulama(String isim) içinde");
	}
	
	public SonUygulama(String isim, int i) {
		this.isim = isim;
		System.out.println("SonUygulama(String isim, int i) içinde");
	}
}
