package prevoz;

import java.util.ArrayList;

public class Autobus {
	
//	Autobus poseduje naziv, vozaca, cenu karte i listu putnika koji se njime voze. 
//	Naziv i cena karte i zadaju se prilikom kreiranja. 
//	Moguce je dodati/ukloniti putnika kao i vozaca. 
//	Moguce je naplatiti kartu putnicima samo ako je vozac prisutan. 
//	Autobus ispisati u sledecem obliku:
//	Naziv ( vozac - Putnik1[novac], Putnik2 [novac],... )


	// fields
	private String naziv;
	private Vozac sofer;
	private double cenaKarte;
	private ArrayList<Putnik> lputnika;
	private boolean vozacPrisutan;

	
	// constructor
	public Autobus(String naziv, Vozac sofer, double cenaKarte) {
		super();
		this.naziv = naziv;
		this.sofer = sofer;
		this.cenaKarte = cenaKarte;
	}

	 
	// methods
	public boolean naplatiKartu() {
		if (vozacPrisutan == true) {
			return true;
		} else {
			return false;
		}
	}

	public void ispisAutobusa() {
		// naziv(vozac-putnik1[novac], putnik2[novac]...)
		System.out.print(naziv + "(" + sofer + "-");
		for (int i = 0; i < lputnika.size(); i++) {
			System.out.print(lputnika.get(i).getIme());
			System.out.print("[" + lputnika.get(i).getNovac() + "]" + ",");
		}
	}
	
	public void addPutnik(Putnik a) {
		lputnika.add(a);
	}
	
	public void removePutnik(Putnik a) {
		lputnika.remove(lputnika.size() - 1);
	}
	
	public void removeSofer() {
		vozacPrisutan = false;
	}
	
	public void addSofer() {
		vozacPrisutan = true;
	}

}
