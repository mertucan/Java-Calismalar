package composite_class;

public class Test {

	public static void main(String[] args) 
	{
		var k1 = new Kisi();
		k1.tcno = "59893002940";
		k1.ad = "Mert";
		k1.soyad = "Uçan";
		
		var a1 = new Araba();
		a1.marka = "Porsche";
		a1.model = "911 Turbo S";
		a1.yil = "2017";
		a1.hiz = 240;
		a1.mesafe = 30000;
		
		k1.arac = a1;
		a1.sahibi = k1;
		
		System.out.println(k1.getInfo());
		System.out.println(a1.getInfo());

	}

}
