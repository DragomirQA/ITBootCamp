package povrsinaZaKrecenje;

public class Zadatak_2_0305_Glavni_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Znam da ne radi. Verovatno se radi sa nizovima ali nisam stigao da uradim do
		// 17h.
		Zadatak_2_0305_Figure beliPion = new Zadatak_2_0305_Figure();
		Zadatak_2_0305_Figure crniSkakac = new Zadatak_2_0305_Figure();

		beliPion.pozicijaKolonaP = 4;
		beliPion.pozicijaRedP = 6;

		crniSkakac.pozicijaKolonaS = 5;
		crniSkakac.pozicijaRedS = 5;

		System.out.println(crniSkakac.skakacNapadnut());

	}

}
