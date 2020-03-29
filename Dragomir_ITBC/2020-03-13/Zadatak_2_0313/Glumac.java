package drama;

public class Glumac extends Zaposleni {
	
//	Glumac je zaposleni koji ima i naziv uloge. 
//	Tekstualni oblik je uloga_ime[naziv_pozorista].
	
	// fields 
	private String uloga;

	
	// constructor
	public Glumac(String punoIme, String radnoPoz, String uloga) {
		super(punoIme, radnoPoz);
		this.uloga = uloga;
	}
	
	
	// methods 
	public String ispisiUlogu() {
		return uloga + "_" + punoIme + "[" + radnoPoz + "]";
	}

	
	

}
