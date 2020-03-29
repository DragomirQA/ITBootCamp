package povrsinaZaKrecenje;

import java.util.Scanner;

public class Zadatak_1_0302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Napisati program koji ce na standarnom izlazu ispisati poruku “Niz je
		// palindrom”
		// ili “Niz nije palindrom” (u zavisnosti da li niz jeste ili nije palindrom).
		// Korisnik unosi int [ ]

		Scanner sc = new Scanner(System.in);

		System.out.println("Koliko clanova ima vas niz");
		int c = sc.nextInt();
		int[] n = new int[c];
		System.out.println("Upisite vrednosti za vas niz");
		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
		}

		int flag = 0;

		for (int i = 0; i < n.length / 2; i++) {
			if (n[i] != n[n.length - 1 - i]) {
				flag = 1;
			}
		}

		if (flag == 1) {
			System.out.println("Niz nije palindrom");
		} else {
			System.out.println("Niz je palindrom");
		}
	}

}
