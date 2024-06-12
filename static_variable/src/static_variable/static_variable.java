package static_variable;

public class static_variable {

	public static void main(String[] args) 
	{
		//Static değişkeni direk olarak Program class ‘ı ile çağırırsın
		System.out.println("Program boyutu: " + Program.boyut); 
		System.out.println("Program kodu (static): " + Program.static_kod);
		
		// Nesne  değişkenini yeni bir nesne oluşturarak referans üzerinden çağırırsın 
		Program p = new Program(); 
		System.out.println("Program kodu (static değil): " + p.kod); 
	}
}
