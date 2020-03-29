package domaci_2020_03_09;

public class GlavniProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sportista s = new Sportista("Ikica", "Radic", 1939);
		Sportista p = new Sportista("Bikica", "Ukic", 1933);

		System.out.println(s.ispisSportiste("Ikica", "Radic", 1939));

		Klub k = new Klub();

		k.naziv = "TK Zabrezje";
		k.sediste = "Zabrezje";
		k.godOsn = 1834;
		Sportista sportista[] = { s, p };

		System.out.println(k.getNaziv());
		System.out.println(k.getSediste());
		System.out.println(k.getGodOsn());
		System.out.println(k.getSportista());
		System.out.println(k.ispisKluba(k));

	}

}
