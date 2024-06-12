package nyp2_calisma2;

public class DenemeSinifi {
	static int i = 25;
	static {
		System.out.println("i'nin ilk değeri: " + i);
		i = i * 10;
		System.out.println("i'nin yeni değeri: " + i);
	}
	
	public DenemeSinifi() {
		System.out.println("i'nin değeri: " + i);
		i = i * 10;
		System.out.println("i'nin şuanki değeri: " + i);
		System.out.println("DenemeSinifi tamamlandı.");
	}
	
	static void bilgiAl() {
		System.out.println("\nBilgi");
		System.out.println("i: " + i);
	}
}
