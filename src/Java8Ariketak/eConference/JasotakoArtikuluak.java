package Java8Ariketak.eConference;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class JasotakoArtikuluak {
    private List<Artikulu> artikuluKol= new ArrayList<Artikulu>();
    private JasotakoArtikuluak nJA= new JasotakoArtikuluak();

    private JasotakoArtikuluak(){}

    public JasotakoArtikuluak getnJA() {
        return nJA;
    }

    public List<Artikulu> nazioKopuruzOrdenatu(){
        return artikuluKol.stream()
                .sorted(Comparator.comparing(Artikulu::zenbNazionalitateak)
                        .reversed())
                .collect(Collectors.toList());
    }

    public List<Artikulu> nazionalitatezAdinezOrdenatu(){
        return artikuluKol.stream()
                .sorted(Comparator.comparing(Artikulu::zenbNazionalitateak)
                        .reversed()
                        .thenComparing(Artikulu::avgEgileak))
                .collect(Collectors.toList());
    }


}
