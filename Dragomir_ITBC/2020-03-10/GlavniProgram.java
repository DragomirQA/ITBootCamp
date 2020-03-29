package ucionica;

public class GlavniProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Polaznik p1 = new Polaznik("Ika", "Ikic");
		Polaznik p2 = new Polaznik("Bika", "Uric");
		System.out.println(p1.getIme());
		System.out.println(p1.getPrezime());
		System.out.println(p1.ispisPolaznika(p1));

		Laptop l = new Laptop("Dell");
		System.out.println(l.getMarka());
		l.dodajPolaznika(p1);
		l.dodajPolaznika(p2);

		l.ispisMarkaKorisnci();

	}

}
