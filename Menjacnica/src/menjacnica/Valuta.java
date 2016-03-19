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
		if(nazivValute == null){
			throw new RuntimeException("Naziv valute ne sme biti null!");
		}
		if(nazivValute.isEmpty()){
			throw new RuntimeException("Naziv ne sme biti prazan string!");
		}
		this.nazivValute = nazivValute;
	}
	public String getSkraceniNazivValute() {
		return skraceniNazivValute;
	}
	public void setSkraceniNazivValute(String skraceniNazivValute) {
		if(skraceniNazivValute == null){
			throw new RuntimeException("Skraceni naziv valute ne sme biti null!");
		}
		if(skraceniNazivValute.isEmpty()){
			throw new RuntimeException("Skraceni naziv ne sme biti prazan string!");
		}
		this.skraceniNazivValute = skraceniNazivValute;
	}
	public List<Kurs> getKursevi() {
		return kursevi;
	}
	public void setKursevi(List<Kurs> kursevi) {
		if(kursevi == null){
			throw new RuntimeException("Lista kurseva ne sme biti null!");
		}
		this.kursevi = kursevi;
	}
	
	@Override
	public String toString() {
		return "Valuta: " + nazivValute + "\nSkraceni naziv valute: " + skraceniNazivValute;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nazivValute == null) ? 0 : nazivValute.hashCode());
		result = prime * result + ((skraceniNazivValute == null) ? 0 : skraceniNazivValute.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (nazivValute == null) {
			if (other.nazivValute != null)
				return false;
		} else if (!nazivValute.equals(other.nazivValute))
			return false;
		if (skraceniNazivValute == null) {
			if (other.skraceniNazivValute != null)
				return false;
		} else if (!skraceniNazivValute.equals(other.skraceniNazivValute))
			return false;
		return true;
	}
	
	
	
}
