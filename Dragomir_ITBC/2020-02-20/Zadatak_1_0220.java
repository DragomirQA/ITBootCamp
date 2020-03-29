package proba.paket;

import java.util.Scanner;

public class Zadatak_1_0220 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Napisati program koji racuna sumu parnih brojeva i proizvod neparnih brojeva
		// od 0 do n
		// - za resavanje ovog zadatka koristiti samo jednu petlju (ne jednu vrstu
		// petlje, vec samo jednu petlju).
		// podrazumeva se da se n ucitava preko standardnog ulaza

		Scanner sc = new Scanner(System.in);

		System.out.println("Upisite broj za sumu parnih i proizvod neparnih brojeva");
		int x = sc.nextInt();
		int i = 0;
		int s = 0;
		int p = 1;
		for (i = 1; i <= x; i++) {
			if (i % 2 == 0) {
				s = s + i;
			} else {
				p = p * i;

			}
		}

		System.out.println("Suma parnih brojeva je " + s);
		System.out.println("Proizvod neparnih brojeva je " + p);

	}

}
