package proba.paket;

public class Zadatak_2_0121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Napisati program koji ce prebrojati koliko je brojeva
		// od 9 do 250 (ukljucujuci i njih) deljivih brojem 3.

		int p = 9;
		int d = 250;
		int br = 0;

		for (p = 9; p <= d; p++) {
			if (p % 3 == 0) {
				br = br + 1;
			}
		}

		System.out.println("Brojevi koji su deljivi sa 3 su " + br);

	}

}
