package domaci2020_03_09;

public class Sportista {
	
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
	private String ime;
	private String prezime;
	private int godRodj;
	
	// constructor
	public Sportista(String ime, String prezime, int godRodj) {
		this.ime = ime;
		this.prezime = prezime;
		this.godRodj = godRodj;
	}
	
	public String ispisSportiste(String ime, String prezime, int godRodj) {
		
		return ime.toUpperCase() + "_" + prezime.toUpperCase() + ":" + " " + godRodj;
	}

}
