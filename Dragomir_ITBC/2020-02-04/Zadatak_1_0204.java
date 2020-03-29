package domaci;

import java.util.Scanner;

public class Zadatak_1_0204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Napisati program koji racuna P okrecene prostorije tako sto ce se ivice
		// prostorije ucitavati preko konzole. Zidovi su oblika pravougaonika, bez
		// prozora

		Scanner sc = new Scanner(System.in);

		float dIvice1;
		float dIvice2;
		float visinaSobe;

		float pZida1;
		float pZida2;
		float pKrecenje;
		float pPlafona;

		System.out.println("Unesite duzinu jedne ivice");
		dIvice1 = sc.nextFloat();

		System.out.println("Unesite duzinu druge ivice");
		dIvice2 = sc.nextFloat();

		System.out.println("Unesite visinu sobe");
		visinaSobe = sc.nextFloat();

		// System.out.println("Povrsina zida 1 je");
		pZida1 = dIvice1 * visinaSobe;
		// System.out.println(pZida1);

		// System.out.println("Povrsina zida 2 je");
		pZida2 = dIvice2 * visinaSobe;
		// System.out.println(pZida1);

		// System.out.println("Povrsina plafona je");
		pPlafona = dIvice1 * dIvice2;
		// System.out.println(pPlafona);

		pKrecenje = (pZida1 + pZida2) * 2 + pPlafona;
		System.out.println("Povrsina okrecene sobe je");
		System.out.println(pKrecenje);

	}

}
