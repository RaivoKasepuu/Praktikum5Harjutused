public class TasulineLõbustus implements Lõbustus{
    private double hind;
    private Lõbustus delegaat;

    public TasulineLõbustus(double hind, Lõbustus delegaat) {
        this.hind = hind;
        this.delegaat = delegaat;
    }

    @Override
    public void lõbusta(Külastaja külastaja) {
        delegaat.lõbusta(külastaja);
        külastaja.lisakulu(hind);
        külastaja.lisaKirjeldus("Tasusin külastuse eest: "+ hind + " eurot.");
    }
}
