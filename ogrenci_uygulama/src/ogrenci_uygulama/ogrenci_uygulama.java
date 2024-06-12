package ogrenci_uygulama;

public class ogrenci_uygulama {

	public static void main(String[] args) 
	{
		Ogrenci o1 = new Ogrenci();
		o1.ad = "Mert";
		o1.soyad = "Uçan";
		o1.numara = 360122005;
		
		Ogrenci o2 = new Ogrenci();
		o2.ad = "Egemen";
		o2.soyad = "Uçan";
		o2.numara = 360122006;
		
		Ogrenci o3 = new Ogrenci();
		o3.ad = "Eda";
		o3.soyad = "Uçan";
		o3.numara = 360122007;
		
		System.out.println("Oluşturulan Nesne Sayısı: " + o1.ogrenciGetir());
	}

}
