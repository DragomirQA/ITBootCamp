package prevoz;

public class Putnik extends Covek {
	
//	Putnik je covek koji poseduje novac. 
//	Inicijalno poseduje odredjenu kolicinu novca koja mu se zadaje prilikom kreiranja. 
//	Odredjena svota novca moze da mu se doda i/ili oduzme, gde je potrebno vratiti indikator uspesnosti.

	
	// fields
	private double novac;

	
	// constructor
	public Putnik(String ime, String prezime, double novac) {
		super(ime, prezime);
		this.novac = novac;
	}
	

	// methods
	public boolean addNovac(double n) {
		if (n > 0) {
			novac = novac + n;
			return true;
		} else {
			return false;
		}
	}

	public boolean removeNovac(double n) {
		if (n > 0 && n <= novac) {
			novac = novac - n;
			return true;
		} else {
			return false;
		}
	}

	public double getNovac() {
		return novac;
	}

}
