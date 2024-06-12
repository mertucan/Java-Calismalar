package static_method_overloading;

public class static_method_overloading {

	public static void main(String[] args) 
	{
		int sonucInt = Deneme.benimMetotum(7);
		float sonucFloat = Deneme.benimMetotum(3.14f);
		double sonucDouble = Deneme.benimMetotum(2.5, 4.5);
		
		System.out.println("int metot sonucu: " + sonucInt);
		System.out.println("float metot sonucu: " + sonucFloat);
		System.out.println("double metot sonucu: " + sonucDouble);
	}

}
