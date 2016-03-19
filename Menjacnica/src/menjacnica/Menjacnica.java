package menjacnica;

import java.util.List;

public class Menjacnica {
	private List<Valuta> valute;

	public List<Valuta> getValute() {
		return valute;
	}

	public void setValute(List<Valuta> valute) {
		if(valute == null){
			throw new NullPointerException("Lista valuta ne sme biti null!");
		}
		this.valute = valute;
	}

	@Override
	public String toString() {
		return "Menjacnica (Valute): " + valute;
	}

	
	
}
