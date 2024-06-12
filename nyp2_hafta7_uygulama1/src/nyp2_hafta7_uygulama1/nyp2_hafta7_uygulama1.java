package nyp2_hafta7_uygulama1;

public class nyp2_hafta7_uygulama1 {

	public static void main(String[] args) 
	{
		Player player = new Player();
		Ejderha ejderha = new Ejderha();
		Zombi zombi = new Zombi();
		player.canavarSaldir(ejderha);
		player.canavarSaldir(zombi);
		
		IAttackable.basla();
	}
}
