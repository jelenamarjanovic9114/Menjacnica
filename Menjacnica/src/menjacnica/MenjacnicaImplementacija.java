package menjacnica;

import java.util.GregorianCalendar;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class MenjacnicaImplementacija implements MenjacnicaInterfejs {

	@Override
	public void dodajNoviKurs(Valuta valuta, Kurs kurs) {
		GregorianCalendar datumKursa = kurs.getDatumKursa();
		for(int i = 0; i < valuta.getKursevi().size(); i++){
			GregorianCalendar datumValute = valuta.getKursevi().get(i).getDatumKursa();
			if(datumKursa.get(GregorianCalendar.DAY_OF_MONTH) == datumValute.get(GregorianCalendar.DAY_OF_MONTH) &&
					datumKursa.get(GregorianCalendar.MONTH) == datumValute.get(GregorianCalendar.MONTH) &&
					datumKursa.get(GregorianCalendar.YEAR) == datumValute.get(GregorianCalendar.YEAR)){
				System.out.println("Kurs na ovaj dan vec postoji!");
				return;
			}
		}

		valuta.getKursevi().add(kurs);
	}

	@Override
	public void obrisiKursValute(Valuta valuta, GregorianCalendar datum) {
		for(int i = 0; i < valuta.getKursevi().size(); i++){
			Kurs k = valuta.getKursevi().get(i);
			GregorianCalendar datumKursa = k.getDatumKursa();
			if(datum.get(GregorianCalendar.DAY_OF_MONTH) == datumKursa.get(GregorianCalendar.DAY_OF_MONTH) &&
					datum.get(GregorianCalendar.MONTH) == datumKursa.get(GregorianCalendar.MONTH) &&
					datum.get(GregorianCalendar.YEAR) == datumKursa.get(GregorianCalendar.YEAR)){
				System.out.println("Obrisan kurs za prosledjen datum.");
				valuta.getKursevi().remove(k);
				return;
			}
		}
		System.out.println("Ne postoji kurs za prosledjen datum!");
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
