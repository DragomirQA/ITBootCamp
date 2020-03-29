package ucionica;

public class Polaznik {

//	Polaznik  ima ime i prezime koje se zadaje prilikom kreiranja polaznika. 
//	Ime i prezime polaznika se moze dohvatiti ali ne i postaviti. 
//	Polaznik se ispisuje u obliku: IME_PREZIME.

	// fields
	private String ime;
	private String prezime;

	// constructor
	public Polaznik(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
	}

	// methods
	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public String ispisPolaznika(Polaznik polaznik) {
		return polaznik.ime.toUpperCase() + "_" + polaznik.prezime.toUpperCase();

	}

}
