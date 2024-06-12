package static_method_overloading;

public class Deneme 
{
	public static int benimMetotum(int x) 
	{
		System.out.println("int tipi için static metot çağrıldı: " + x);
		return x;
	}
		
	
	public static float benimMetotum(float x) 
	{
		System.out.println("float tipi için static metot çağrıldı: " + x);
		return x;
	}
		
		
	public static double benimMetotum(double x, double y)
	{
		System.out.println("double tipleri için static metot çağrıldı: " + x + ", " + y);
		return x + y;
	}
}
