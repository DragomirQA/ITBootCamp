package prevoz;

public class Covek {
	
	// Covek poseduje ime i prezime koji se dodeljuju prilikom kreiranja objekta. 
	// Svi podaci mogu da se dohvate, ali ne i postave.

	
	// fields
	private String ime;
	private String prezime;
	
	// constructor
	public Covek(String ime, String prezime) {
		super();
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
	
	
	
	
	
	
}
