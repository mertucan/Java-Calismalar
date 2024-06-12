package nyp2_hafta7_uygulama1;

public interface IAttackable 
{
	int deger1 = 10;
	void attack();
	
	default void dur() {
		System.out.println("Durdu.");
	}
	
	static void basla() { // Direkt main'den çağırılabilir.
		System.out.println("Başladı."); 
	}
}