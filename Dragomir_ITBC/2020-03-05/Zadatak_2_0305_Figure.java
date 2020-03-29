package povrsinaZaKrecenje;

public class Zadatak_2_0305_Figure {
	// Na sahovskoj tabli je red obelezen brojevima 1 2 3 4 5 6 7 8 i kolona takodje
	// brojevima 1 2 3 4 5 6 7 8.
	// Na tabli stoje beli pion i crni skakac.
	// Beli pion pocinje sa dna table a crni skakac sa vrha.
	// Korisnik prvo unosi poziciju piona kao dva cela broja,
	// a zatim poziciju skakaca, gde prvi broj predstavlja red,
	// a drugi kolonu. Program treba da ispise da li se figure nalaze u poziciji da
	// je skakac napadnut.

	public int pozicijaRedP;
	public int pozicijaKolonaP;
	public int pozicijaRedS;
	public int pozicijaKolonaS;

	public void setPozicijaP(int red, int kolona) {
		pozicijaRedP = red;
		pozicijaKolonaP = kolona;
	}

	public void setPozicijaS(int red, int kolona) {
		pozicijaRedS = red;
		pozicijaKolonaS = kolona;
	}

	public void getPozicijaP() {
		System.out.println("Trenutna pozicija je " + pozicijaRedP + ", " + pozicijaKolonaP);

	}

	public void getPozicijaS() {
		System.out.println("Trenutna pozicija je " + pozicijaRedS + ", " + pozicijaKolonaS);

	}

	public int getRedP() {
		return pozicijaRedP;
	}

	public int getKolonaP() {
		return pozicijaKolonaP;
	}

	public int getRedS() {
		return pozicijaRedS;
	}

	public int getKolonaS() {
		return pozicijaKolonaS;
	}

	public boolean skakacNapadnut() {
		if (pozicijaRedP - 1 == pozicijaRedS
				|| pozicijaRedP + 1 == pozicijaRedS && pozicijaKolonaP - 1 == pozicijaKolonaS
				|| pozicijaKolonaP + 1 == pozicijaKolonaS) {
			return true;
		} else {
			return false;
		}
	}

}
