package nyp_hafta4;

class Kamyon extends Arac {
    private String plaka;
    private int tekerlek;
    private int yas;

    public Kamyon(int hizLimiti, String plaka, int tekerlek, int yas) {
        super(hizLimiti);
        this.plaka = plaka;
        this.tekerlek = tekerlek;
        this.yas = yas;
    }

    @Override
    protected String bilgiGetir() {
        return plaka + " \nTekerlek: " + tekerlek + "\nKamyon Yaşı: " + yas;
    }
}
