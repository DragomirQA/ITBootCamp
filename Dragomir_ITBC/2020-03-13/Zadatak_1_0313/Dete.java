package klikeri;

public class Dete {

//	Dete ima ime, prezime, broj godina i broj klikera. 
//	Napraviti mogucnost da se kreira vise objekata klase Dete. 
//	Ako se pozove metoda dodajKlikere ili metoda oduzmiKlikere, broj klikera se azurira.
//	Napraviti metodu koja ce ispisivati broj klikera i 
//	metodu koja ispisuje prosecan broj decjih godina
//	(ako imamo troje dece, broj prosecnih godina za njih troje; 
//	ako imamo dvoje racunamo prosecne godine za to dvoje) .

	
	// fields
	private String ime;
	private String prezime;
	private int brGodina;
	private int brKlikera;
	private int ukGod;
	private int brDece=0;

	
	// constructor
	public Dete(String ime, String prezime, int brGodina, int brKlikera) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.brGodina = brGodina;
		this.brKlikera = brKlikera;
		brDece++;
	}

	
	// methods
	public int addKliker(int bkliker) {
		brKlikera = brKlikera + bkliker;
		return brKlikera;
	}

	public int removeKliker(int bkliker) {
		if (bkliker < brKlikera) {
			brKlikera = brKlikera - bkliker;
		}
		return brKlikera;
	}
	
	public int getBrKlikera() {
		return brKlikera;
	}
	
	public double prosekGodina () {
		int x = ukGod / brDece;
		return x;
		
	}


}
