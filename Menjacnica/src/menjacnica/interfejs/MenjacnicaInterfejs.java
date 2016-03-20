package menjacnica.interfejs;

import java.util.GregorianCalendar;

import menjacnica.Kurs;
import menjacnica.Valuta;

public interface MenjacnicaInterfejs {
	public void dodajNoviKurs(Valuta valuta, Kurs kurs);
	public void obrisiKursValute(Valuta valuta, GregorianCalendar datum);
	public Kurs vratiKursValute(Valuta valuta, GregorianCalendar datum);
}
