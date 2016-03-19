package menjacnica;

import java.util.List;

public class Valuta {
	private String nazivValute;
	private String skraceniNazivValute;
	private List<Kurs> kursevi;
	
	public String getNazivValute() {
		return nazivValute;
	}
	public void setNazivValute(String nazivValute) {
		this.nazivValute = nazivValute;
	}
	public String getSkraceniNazivValute() {
		return skraceniNazivValute;
	}
	public void setSkraceniNazivValute(String skraceniNazivValute) {
		this.skraceniNazivValute = skraceniNazivValute;
	}
	public List<Kurs> getKursevi() {
		return kursevi;
	}
	public void setKursevi(List<Kurs> kursevi) {
		this.kursevi = kursevi;
	}
	
	
}
