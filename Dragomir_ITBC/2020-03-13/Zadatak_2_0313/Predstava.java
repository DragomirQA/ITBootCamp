package drama;

import java.util.ArrayList;

public class Predstava {
	
//	Predstava je opisana nazivom, pozoristem u kojem se izvodi i 
//	sadrzi zaposlene koji ucestvuju u realizaciji predstave. 
//	Zaposleni za realizaciju predstave mogu da se dodaju i izbace. 
//	Moze da se dohvati broj zaposlenih na predstavi.
//	Sastavlja se tekstualni opis predstave navodeci naziv predstave i naziv pozorista 
//	u kojem se predstava odrzava razdvojene zarezom, 
//	a potom zaposlene koji ucestvuju u realizaciji predstave (svakog zaposlenog u zasebnom redu).
	
	
	// fields
	private String nazivPred;
	private String izvodPoz;
	//private Zaposleni[] lzaposlenih;
	private ArrayList<Zaposleni> lzaposlenih;
	
	
	// constructor
	public Predstava(String nazivPred, String izvodPoz) {
		super();
		this.nazivPred = nazivPred;
		this.izvodPoz = izvodPoz;
		//this.lzaposlenih = lzaposlenih;
		this.lzaposlenih = new ArrayList<Zaposleni>();
	}
	
	
	// methods
	public void dodajZaposlenog(Zaposleni punoIme) {
		lzaposlenih.add(punoIme);
	}
	
	public void oduzmiZaposlenog(Zaposleni punoIme) {
		lzaposlenih.remove(getBrojZaposlenih() - 1);
	}
	
	public int getBrojZaposlenih() {
		return lzaposlenih.size();
	}
	
	public void ispisPredstave() {
		System.out.println(nazivPred + "," + izvodPoz);
		
		for (int i = 0; i < lzaposlenih.size(); i++) {
			System.out.println(lzaposlenih.get(i).toString());
		}
		
	}

}
