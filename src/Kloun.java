public class Kloun {
    private String nimi;

    public Kloun(String nimi) {
        this.nimi = nimi;
    }
    public void esine(Külastaja külastaja){
        külastaja.lisaKirjeldus("Nägin klouni nimega " + nimi + ".");
    }
}
