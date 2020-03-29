package domaci;

public class Zadatak_1_0306_GlavniProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Napisati glavni program koji kreira tri igraca. 
//		U glavnom programu iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Sportista.
		
		//Prvi objekat
		Zadatak_1_0306_Sportista igrac1 = new Zadatak_1_0306_Sportista();
		
		igrac1.punoIme = "Ikica Radic";
		igrac1.sport = "Tenis";
		igrac1.klub = "TK Zabrezje";
		igrac1.brDresa = 13;
		
		System.out.println(igrac1.getPunoIme());
		System.out.println(igrac1.getSport());
		System.out.println(igrac1.getKlub());
		System.out.println(igrac1.getBrDresa());
		
		igrac1.setKlub("TK Beli sport");
		System.out.println(igrac1.getKlub());
		
		igrac1.setBrDresa(1);
		System.out.println(igrac1.getBrDresa());
		
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");
		
		//Drugi objekat
		Zadatak_1_0306_Sportista igrac2 = new Zadatak_1_0306_Sportista();

		igrac2.punoIme = "Dragomir Ilic";
		igrac2.sport = "Trcanje";
		igrac2.klub = "AK Apatin";
		igrac2.brDresa = 88;
		
		System.out.println(igrac2.getPunoIme());
		System.out.println(igrac2.getSport());
		System.out.println(igrac2.getKlub());
		System.out.println(igrac2.getBrDresa());
		
		igrac2.setKlub("AK Hajduk Maraton Team Kula");
		System.out.println(igrac2.getKlub());
		
		igrac2.setBrDresa(18);
		System.out.println(igrac2.getBrDresa());

		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");
		
		//Treci objekat
		Zadatak_1_0306_Sportista igrac3 = new Zadatak_1_0306_Sportista();
		
		igrac3.punoIme = "dr Aleksandar Sapic :-)";
		igrac3.sport = "Vaterpolo";
		igrac3.klub = "VK Opstina Novi Beograd";
		igrac3.brDresa = 1;
		
		System.out.println(igrac3.getPunoIme());
		System.out.println(igrac3.getSport());
		System.out.println(igrac3.getKlub());
		System.out.println(igrac3.getBrDresa());
		
		igrac3.setKlub("VK Spas");
		System.out.println(igrac3.getKlub());
		
		igrac3.setBrDresa(3);
		System.out.println(igrac3.getBrDresa());
	}

}
