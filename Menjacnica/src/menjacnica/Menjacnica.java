package menjacnica;

import java.util.List;

public class Menjacnica {
	private List<Valuta> valute;

	public List<Valuta> getValute() {
		return valute;
	}

	public void setValute(List<Valuta> valute) {
		this.valute = valute;
	}

	@Override
	public String toString() {
		return "Menjacnica (Valute): " + valute;
	}

	
	
}
