package nyp2_hafta8_uygulama1;

class SUV extends Araba {
	public SUV(String model) {
        super(model);
    }

    @Override
    void uretimAsamasi() {
        System.out.println(model + " üretim aşamasında.");
    }
}
