package ucionica;

public class Laptop {

//	Laptop poseduje listu polaznika koji ga koriste i marku koji se zadaju prilikom kreiranja. 
//	Marka moze samo da se dohvati. 
//	Lista polaznika koji koriste laptop moze da se prosiri i da se smanji. 
//	Moze da se ispise u obliku (koristiti metodu): MARKA{POLAZNIK 1, POLAZNIK 2,.....}

	// fields
	private Polaznik[] polaznici;
	private String marka;
	private int poz = 0;
	private Polaznik p;

	// constructor
	public Laptop(String m) {
		polaznici = new Polaznik[50];
		marka = m;
	}

	public String getMarka() {
		return marka;
	}

	public void dodajPolaznika(Polaznik p) {
		polaznici[poz] = p;
		poz++;
	}

	public void ispisMarkaKorisnci() {
		int i = 0;
		System.out.print(marka.toUpperCase() + "{");

		for (i = 0; i < polaznici.length; i++) {
			String t = polaznici[i].getIme() + " " + polaznici[i].getPrezime();
			System.out.print(t.toUpperCase() + ", ");
		}
		System.out.println("}");
	}

}
