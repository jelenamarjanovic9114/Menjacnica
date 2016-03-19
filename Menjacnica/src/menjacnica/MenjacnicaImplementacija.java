package menjacnica;

import java.util.GregorianCalendar;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class MenjacnicaImplementacija implements MenjacnicaInterfejs {

	@Override
	public void dodajNoviKurs(Valuta valuta, Kurs kurs) {
		valuta.getKursevi().add(kurs);
	}

	@Override
	public void obrisiKursValute(Valuta valuta, Kurs kurs, GregorianCalendar datum) {
		valuta.getKursevi().remove(kurs);
	}

	@Override
	public Kurs vratiKursValute(Valuta valuta, GregorianCalendar datum) {
		for(int i = 0; i < valuta.getKursevi().size(); i++){
			Kurs k = valuta.getKursevi().get(i);
			GregorianCalendar datumValute = k.getDatumKursa();
			if(datum.get(GregorianCalendar.DAY_OF_MONTH) == datumValute.get(GregorianCalendar.DAY_OF_MONTH) &&
					datum.get(GregorianCalendar.MONTH) == datumValute.get(GregorianCalendar.MONTH) &&
					datum.get(GregorianCalendar.YEAR) == datumValute.get(GregorianCalendar.YEAR)){
				return k;
			}
		}
		System.out.println("Kurs za taj datum ne postoji! Vraceno NULL.");
		return null;
	}

}
