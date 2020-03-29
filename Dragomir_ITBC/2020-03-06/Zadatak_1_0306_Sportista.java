package domaci;

public class Zadatak_1_0306_Sportista {
	
//	Napisati klasu Sportista. Sportista ima
//	1) ime i prezime (polje tipa String) koje moze da se dohvati, ali ne i postavi
//	2) sport kojim se bavi (polje tipa String) koje moze da se dohvati ali ne i postavi
//	3) klub za koji igra (polje tipa String) koje moze da se dohvati. Sportista moze da promeni klub za koji igra.
//	4) broj koji nosi na dresu (neka u ovom zadatku bude tipa int) koje moze i da se dohvati i da se postavi.
	
	//fields
	String punoIme;
	String sport;
	String klub;
	int brDresa;
	
	//methods
	public String getPunoIme() {
		return punoIme;		
	}
	
	public String getSport() {
		return sport;
		
	}
	
	public String getKlub() {
		return klub;
		
	}
	
	public String setKlub(String klub2) {
		klub = klub2;
		return klub;
	}
	
	public int getBrDresa() {
		return brDresa;
		
	}
	
	public int setBrDresa(int brDresa2) {
		brDresa = brDresa2;
		return brDresa;
		
	}

}
