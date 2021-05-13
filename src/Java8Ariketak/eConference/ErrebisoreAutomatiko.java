package Java8Ariketak.eConference;

import java.util.ArrayList;
import java.util.List;

public class ErrebisoreAutomatiko {
    private String id;
    private List<String> alorKol= new ArrayList<String>();

    public ErrebisoreAutomatiko(String id) {
        this.id = id;
    }

    public float getPortzentaiaAlorErrebisore(Artikulu pArtikulu){
        return (float) (alorKol.stream()
                .filter(s->pArtikulu.alorraDu(s))
                .count()*1.0 / pArtikulu.getAlorKop());
    }

}
