package drama;

public class Reditelj extends Zaposleni {
	
//	Reditelj je zaposleni koji je prepoznatljiv po svom nadimku. 
//	Tekstualni oblik je nadimak_ime[naziv_pozorista].
	
	// fields
	private String nadimak;

	
	// constructor
	public Reditelj(String punoIme, String radnoPoz, String nadimak) {
		super(punoIme, radnoPoz);
		this.nadimak = nadimak;
	}
	
	
	// methods
	public String ispisiNadimak() {
		return nadimak + "_" + punoIme + "[" + radnoPoz + "]";
	}

}
	
	



