package nyp2_hafta8_uygulama1;

class Sedan extends Araba {
	public Sedan(String model) {
        super(model);
    }

    @Override
    void uretimAsamasi() {
        System.out.println(model + " üretim aşamasında.");
    }
}
