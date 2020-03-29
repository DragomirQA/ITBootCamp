package povrsinaZaKrecenje;

import java.util.Scanner;

public class Zadatak_2_0302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Napisati program koji ce na standardnom izlazu ispisati proizvod elemenata niza
		//koji su veci od svog indeksa (preko konzole uneti duzinu i clanove niza)
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Koliko clanova ima vas niz");
		int c = sc.nextInt();
		int[] n = new int[c];
		System.out.println("Upisite vrednosti za vas niz");
		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
		}
		int proizvod = 1;
		for (int i=0; i<n.length;i++) {
			if (n[i] > i) {
				 proizvod = proizvod * n[i];
			}
		}

		System.out.println("Trazeni proizvod je " + proizvod );

	}

}
