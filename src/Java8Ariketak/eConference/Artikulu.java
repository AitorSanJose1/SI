package Java8Ariketak.eConference;

import java.util.ArrayList;
import java.util.List;

public class Artikulu {
    private String izenburu;
    private String fitxategi;
    private List<String> alorKol= new ArrayList<String>();
    private List<Egile> egileKol= new ArrayList<Egile>();

    public Artikulu(String pZenb, String pFitx){
        izenburu=pZenb;
        fitxategi=pFitx;
    }
    public int getAlorKop(){
        return alorKol.size();
    }

    public boolean hainbatEgileDitu(){
        return (egileKol.size()>=2);
    }

    public int zenbNazionalitateak(){
        return (int) egileKol.stream()
                .map(Egile::getNazionalitate)
                .distinct()
                .count();
    }

    public int avgEgileak() {
        return (int) egileKol.stream()
                .mapToDouble(Egile::getAdina)
                .average()
                .getAsDouble();
    }

    public Boolean alorraDu(String pALor){
        return alorKol.stream()
                .anyMatch(s->s.equals(pALor));
    }

}
