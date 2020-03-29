package domaci_2020_03_09;

public class Klub {

//	Sportista poseduje ime, prezime i godinu rodjenja. 
//	Ime, prezime i godina rodjenja se zadaju prilikom kreiranja i ne mogu da se promene. 
//	Sportistu ispisati u obliku: IME_PREZIME: godinaRodjenja
//
//	Klub poseduje naziv, sediste (grad), godinu osnivanja i niz sportista tipa Sportista. 
//	Sva polja mogu da se dohvate, a naziv kluba moze i da se postavi.
//	Napisati metodu koja ce ispisati ceo objekat klase klub.
//
//	Napisati glavni program, gde cete testirati kako ove klase funkcionisu.

	// fields
	public String naziv;
	public String sediste;
	public int godOsn;
	public Sportista sportista[];

	// methods
	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getSediste() {
		return sediste;
	}

	public int getGodOsn() {
		return godOsn;
	}

	public Sportista[] getSportista() {
		return sportista;
	}

	public String ispisKluba(Klub k) {
		return "Naziv kluba je " + k.naziv + "." + "Sediste kluba je " + k.sediste + "." + "Godina osnivanja kluba je "
				+ k.godOsn + ".";
	}

}
