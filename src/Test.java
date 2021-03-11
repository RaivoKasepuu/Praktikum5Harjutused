import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Külastaja külastaja = new Külastaja();
        Vaateratas vaateratas = new Vaateratas();
        Lasketiir lasketiir = new Lasketiir();
        List<Lõbustus> lõbustused = new ArrayList<>();
        Kloun kloun = new Kloun("Piip");
        LõbustavKloun lõbustavKloun = new LõbustavKloun(kloun);

        TasulineLõbustus tl1 = new TasulineLõbustus(2.25, vaateratas);
        TasulineLõbustus tl2 = new TasulineLõbustus(1.5, lasketiir);
        VanuseKontrollija vanuseKontrollija = new VanuseKontrollija(10, tl2);
        //lõbustused.add(vaateratas);
       // lõbustused.add(lasketiir);
        lõbustused.addAll(Arrays.asList(tl1, vanuseKontrollija, vaateratas, lõbustavKloun));
        Lõbustuspark lõbustuspark = new Lõbustuspark(lõbustused);
        //vaateratas.lõbusta(külastaja);
        //vaateratas.lõbusta(külastaja);
        //System.out.println(külastaja.kõikKirjeldused());
        Külastaja külastaja1 = new Külastaja(9);
        Külastaja külastaja2 = new Külastaja(11);
        lõbustuspark.alustaSeiklust(külastaja1);
        lõbustuspark.alustaSeiklust(külastaja2);
    }
}
