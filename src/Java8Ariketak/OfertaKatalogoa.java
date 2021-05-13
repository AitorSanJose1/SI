package Java8Ariketak;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OfertaKatalogoa {

	private static OfertaKatalogoa nOK = new OfertaKatalogoa();
	private List<Oferta> ofertakol = new ArrayList<Oferta>();
	
	private OfertaKatalogoa(){};
	
	public static OfertaKatalogoa getOK()
	{
		return nOK;
	}
	
	
	public void addOferta(Oferta o)
	{
		ofertakol.add(o);
	}
	
	//1 ariketa
	public void printHelburuPosibleak(String pJat)
	{
		ofertakol.stream()
				.filter(p-> p.jatorriaDa(pJat))
				.map(p->p.getHelburu())
				.forEach(p->System.out.println(p));
	}
	
	//2 ariketa
	public void printHelburuPosibleak2(String pOrigen)
	{
		ofertakol.stream()
				.filter(p-> p.jatorriaDa(pOrigen))
				.map(p->p.getHelburu())
				.distinct()
				.forEach(p->System.out.println(p));
	}
	
	//3 ariketa
	public List<Oferta> getJatorrizOrdenatutakoOfertak()
	{
		return ofertakol.stream()
				.sorted(Comparator.comparing(Oferta::getJatorri))
				.collect(Collectors.toList());
	}
	
	//4 ariketa
	public List<Oferta> getJatorrizHelburuzOrdenatutakoOfertak()
	{
		return ofertakol.stream()
				.sorted(Comparator.comparing(Oferta::getJatorri)
								.thenComparing(Oferta::getHelburu))
				.collect(Collectors.toList());
	}
	
	//5 ariketa	
	public List<Oferta> getEstaziodunOfertak(String pHiri)
	{
		return ofertakol.stream()
				.filter(p->p.estazioaDu(pHiri))
				.collect(Collectors.toList());
	}
	
	//6 ariketa
	public void printOfertakJatorriHelburu(String pJat, String pHel){
		ofertakol.stream()
				.filter(p->p.jatorriaHelburuaDa(pJat,pHel))
				.sorted(Comparator.comparing(p-> (int) p.kalkKostu()))
				.forEach(p->System.out.println(p));

	}
	
	//7 ariketa
	public Map<String,Oferta> getOfertaMinEstazioJatorri()
	{
		return ofertakol.stream()
				.collect(Collectors.groupingBy(Oferta::getJatorri,
														Collectors.collectingAndThen(
																Collectors.minBy(Comparator.comparing(Oferta::estazioakKontatu)),
																p->p.get()
																)
						)
				);
	}
	
	//8 ariketa
	public Map<String,Integer> getMinEstazioJatorri()
	{
		return ofertakol.stream()
				.collect(Collectors.groupingBy(Oferta::getJatorri,
						Collectors.collectingAndThen(
								Collectors.minBy(Comparator.comparing(Oferta::estazioakKontatu)),
								p->p.get().estazioakKontatu()
						)
						)
				);
	}
}
