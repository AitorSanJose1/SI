package Java8Ariketak.eConference;

public class Egile {
    private String izen;
    private String nazionalitate;
    private String unibertsitate;
    private int adina;


    public Egile(String izen, String nazionalitate, String unibertsitate, int adina) {
        this.izen = izen;
        this.nazionalitate = nazionalitate;
        this.unibertsitate = unibertsitate;
        this.adina = adina;
    }

    public String getNazionalitate() {
        return nazionalitate;
    }

    public int getAdina() {
        return adina;
    }
}
