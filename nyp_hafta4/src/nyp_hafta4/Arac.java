package nyp_hafta4;

public class Arac {
	 protected int hizLimiti;

	    public Arac(int hizLimiti) {
	        this.hizLimiti = hizLimiti;
	    }
	    
	    public void hizLimitiniYazdir() {
	        System.out.println("Hız Limiti (Kamyon-Otomobil Ortak Özelliği): " + hizLimiti);
	    }

	    final public void aracPlakaYazdir() {
	        System.out.println("Araç Plakası: " + bilgiGetir());
	    }

	    protected String bilgiGetir() {
	        return "Boş";
	    }
}

