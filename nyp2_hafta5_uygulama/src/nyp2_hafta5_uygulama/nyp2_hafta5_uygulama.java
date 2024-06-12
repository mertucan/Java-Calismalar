package nyp2_hafta5_uygulama;

public class nyp2_hafta5_uygulama {

	public static void main(String[] args) {
		System.out.println(SonUygulama.i);
		System.out.println("************");
		SonUygulama u = new SonUygulama();
		System.out.println("************");
		new SonUygulama();
		System.out.println("************");
		B b = new B();
		b.f();
		SonUygulama s = new SonUygulama();
		System.out.println(s.isim);
	}
	
	static final D d = new D();
	
}
