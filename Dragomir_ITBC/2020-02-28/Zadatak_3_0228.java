package nizovi.Vezbanje;

import java.util.Scanner;

public class Zadatak_3_0228 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Napisati program koji ucitava duzinu niza, niz i proverava da li je niz
		// rastuci.
		// Primer1 niza: 3 54 123 18
		// Ispis: Niz nije rastuci.
		// Primer2 niza: 71 422 1001 5054
		// Ispis: Niz je rastuci.

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite duzinu niza");
		int n;
		n = sc.nextInt();

		int[] x = new int[n];

		int i = 0;

		for (i = 0; i < x.length; i++) {
			System.out.println("Unesite broj u nizu");
			x[i] = sc.nextInt();

		}

		for (i = 0; i < x.length; i++) {
			if (x[i] < x[i + 1]) {
				System.out.println("Niz je rastuci");
			} else {
				System.out.println("Niz nije rastuci");
			}

		}

	}
}
