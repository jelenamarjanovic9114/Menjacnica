package menjacnica;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Kurs {
	private GregorianCalendar datumKursa;
	private double prodajniKurs;
	private double kupovniKurs;
	private double srednjiKurs;
	
	public GregorianCalendar getDatumKursa() {
		return datumKursa;
	}
	public void setDatumKursa(GregorianCalendar datumKursa) {
		this.datumKursa = datumKursa;
	}
	public double getProdajniKurs() {
		return prodajniKurs;
	}
	public void setProdajniKurs(double prodajniKurs) {
		this.prodajniKurs = prodajniKurs;
	}
	public double getKupovniKurs() {
		return kupovniKurs;
	}
	public void setKupovniKurs(double kupovniKurs) {
		this.kupovniKurs = kupovniKurs;
	}
	public double getSrednjiKurs() {
		return srednjiKurs;
	}
	public void setSrednjiKurs(double srednjiKurs) {
		this.srednjiKurs = srednjiKurs;
	}
	
	@Override
	public String toString() {
		return "Datum kursa: " + new SimpleDateFormat("dd. MMM yyyy.").format(datumKursa) + "\nProdajni kurs: " + prodajniKurs
				+ ("\nKupovni kurs: ") + kupovniKurs + "\nSrednji kurs: " + srednjiKurs;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datumKursa == null) ? 0 : datumKursa.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(prodajniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(srednjiKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Kurs other = (Kurs) obj;
		if (datumKursa == null) {
			if (other.datumKursa != null)
				return false;
		} else if (!datumKursa.equals(other.datumKursa))
			return false;
		if (Double.doubleToLongBits(kupovniKurs) != Double.doubleToLongBits(other.kupovniKurs))
			return false;
		if (Double.doubleToLongBits(prodajniKurs) != Double.doubleToLongBits(other.prodajniKurs))
			return false;
		if (Double.doubleToLongBits(srednjiKurs) != Double.doubleToLongBits(other.srednjiKurs))
			return false;
		return true;
	}
	
	
	
}
