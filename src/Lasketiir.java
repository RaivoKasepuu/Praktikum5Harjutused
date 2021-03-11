public class Lasketiir implements Lõbustus{

    public void lõbusta(Külastaja külastaja){
        int tulemus = (int)Math.round(Math.random()*20);
        külastaja.lisaKirjeldus("Tabasin lasketiirus " + tulemus + " sihtmärki.");
    }
}
