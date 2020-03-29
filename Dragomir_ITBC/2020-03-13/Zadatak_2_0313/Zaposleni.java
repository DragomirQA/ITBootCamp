package drama;

public class Zaposleni {
	

//	Zaposleni u pozoristu je opisan imenom (i prezimenom, jedno polje) i pozoristem u kojem je zaposlen. 
//	Svi podaci mogu da se dohvate. Moze da se sastavi tekstualni opis u obliku ime[naziv_pozorista].

	// fields
	public String punoIme;
	public String radnoPoz;
	

	// constructor
	public Zaposleni(String punoIme, String radnoPoz) {
		super();
		this.punoIme = punoIme;
		this.radnoPoz = radnoPoz;
	}
	
	
	// methods
	public String getPunoIme() {
		return punoIme;
	}
	
	public String getRadnoPoz() {
		return radnoPoz;
	}
	
	public String ispisZaposlenog() {
		return punoIme;
	}
	
	
	
	
}
