package nyp2_hafta8_uygulama1;

public class nyp2_hafta8_uygulama1 {
	public static void main(String[] args) {
		SUV suv = new SUV("Land Rover Defender");
		suv.modelYazdir();
	    suv.uretimAsamasi();
	    
	    System.out.println("");
	    
	    Sedan sedan = new Sedan("Toyota Carry");
	    sedan.modelYazdir();
	    sedan.uretimAsamasi();
	}
}