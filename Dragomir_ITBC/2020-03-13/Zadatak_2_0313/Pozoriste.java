package drama;

public class Pozoriste {

//	Pozoriste ima jednoznacan automatski generisan celobrojan identifikator i naziv koji mogu da se dohvate. 
//	Moze da se sastavi tekstualni opis u obliku naziv[id].
	
	// fields 
	private String nazivPoz;
	private int id;
	private static int globalid = 0;


	// constructor
	public Pozoriste(String nazivPoz) {
	this.nazivPoz = nazivPoz;
	this.id = globalid;
	globalid++;
	}

	
	// methods
	public String getNazivPoz() {
		return nazivPoz;
	}
	
	public String ispisPozorista() {
		return nazivPoz + "[" + id + "]";
	}
	
	public int getId() {
		return id;
	}
	
	public static int getGlobalid() {
		return globalid;
	}
	


}
