package nyp2_hafta5_uygulama;

public class D {
	static int i;
	static {
		i = 125;
		System.out.println("D() içerisinde i = " + i);
	}
	
	public D() {
		System.out.println("D() içerisinde");
	}
}
