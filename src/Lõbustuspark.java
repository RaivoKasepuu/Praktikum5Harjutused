import java.util.List;

public class Lõbustuspark {
    private List<Lõbustus> lõbustused;

    public Lõbustuspark(List<Lõbustus> lõbustus) {
        this.lõbustused = lõbustus;
    }
    public void alustaSeiklust(Külastaja külastaja){
        System.out.println("Alustan seiklust");
        for (Lõbustus lõbustus:lõbustused){
            lõbustus.lõbusta(külastaja);
        }
        System.out.println(külastaja.kõikKirjeldused());
        System.out.println("Kulude summa on " + külastaja.kuludeSumma() + " eurot.");
    }
}
