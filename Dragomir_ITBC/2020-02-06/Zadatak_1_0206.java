package domaci;

import java.util.Scanner;

public class Zadatak_1_0206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * U zgradi se nalazi lift nosivosti 680kg. Napisati program koji proverava da
		 * li ce lift bezbedno krenuti u zavisnostii od tezine koju treba da ponese.
		 * Podrazumevane 3 opcije: Lift je preopterecen; Na granici je; Lift je pokrenut
		 * + masta
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite ukupnu masu u kg koja se nalazi u liftu");

		double masa = sc.nextDouble();
		double nos = 680;

		if (masa > nos) {
			System.out.println("Left je preopterecen");
		} else if (masa == nos) {
			System.out.println("Lift je na granici, da li zelite da krenete? Unesite 1 za DA ili 2 za NE.");

			int x = sc.nextInt();

			switch (x) {
			case 1:
				System.out.println("Lift ce krenuti");
				break;
			case 2:
				System.out.println("Lift nece krenuti");
				break;
			default:
				System.out.println("Uneli ste pogresnu vrednost");
			}
		} else if (masa < nos && masa >= 1) {
			System.out.println("Lift je pokrenut");
		} else if (masa == 0 || masa < 0) {
			System.out.println("Lift je prazan");
		}
		
		else {
			System.out.println("Lift nije u funkciji");
		}
	}

}
