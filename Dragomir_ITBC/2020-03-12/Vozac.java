package prevoz;

public class Vozac extends Covek {
	
	// Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).

	
	// fields
	private String zanimanje;

	
	// constructor
	public Vozac(String ime, String prezime, String zanimanje) {
		super(ime, prezime);
		this.zanimanje = zanimanje;
	}
	

	

}
