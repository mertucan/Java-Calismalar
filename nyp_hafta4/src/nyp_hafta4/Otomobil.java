package nyp_hafta4;

public class Otomobil extends Arac {
    private String plaka;
    private String marka;
    private String motor;

    public Otomobil(int hizLimiti, String plaka, String marka, String motor) {
        super(hizLimiti);
        this.plaka = plaka;
        this.marka = marka;
        this.motor = motor;
    }

    @Override
    protected String bilgiGetir() {
        return plaka + "\nMarka: " + marka + "\nMotor: " + motor;
    }
}

