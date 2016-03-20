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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((valute == null) ? 0 : valute.hashCode());
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
		Menjacnica other = (Menjacnica) obj;
		if (valute == null) {
			if (other.valute != null)
				return false;
		} else if (!valute.equals(other.valute))
			return false;
		return true;
	}

	
	
}
