import java.util.ArrayList;
import java.util.List;

public class Külastaja {
    private List<String> külastuseKirjeldused;
    private int vanus;
    private double kulud;

    public int getVanus() {
        return vanus;
    }

    public Külastaja() {
        külastuseKirjeldused = new ArrayList<String>();
    }

    public Külastaja(int vanus) {
        külastuseKirjeldused = new ArrayList<String>();
        this.vanus = vanus;
    }

    public void lisaKirjeldus(String kirjeldus){
        külastuseKirjeldused.add(kirjeldus);
    }

    public List<String> kõikKirjeldused(){
        return külastuseKirjeldused;
    }

    public void lisakulu(double kulu){
        kulud += kulu;
    }

    public double kuludeSumma(){
        return kulud;
    }
}
