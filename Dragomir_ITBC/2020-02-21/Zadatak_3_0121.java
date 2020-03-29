package proba.paket;

public class Zadatak_3_0121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Napravi program koji ce na izlazu izbaciti sliku pravougaonika od zvezdica:
		// Primer: ulaz m=3, n=7;
		// Izlaz (vidljivo u konzoli)
		// Hint: koristiti dve for petlje;
		int rows = 3;
		int columns = 7;

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= columns; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}

	}

}
