package nyp2_hafta8_uygulama1;

public abstract class Araba 
{
	String model;
	
	public Araba(String model)
	{
		this.model= model;	
	}
	
	abstract void uretimAsamasi();
	
	void modelYazdir()
	{
		System.out.println("Araba model: " + model);
	}
}
