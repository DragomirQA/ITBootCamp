package prevoz;

public class GlavniProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Covek c = new Covek("ika", "ikic");

		Vozac v = new Vozac("ika", "ikic", "profesionalni vozac");

		Putnik p1 = new Putnik("bika", "uric", 100);

		p1.addNovac(200);
		System.out.println(p1.getNovac());

		p1.removeNovac(50);
		System.out.println(p1.getNovac());

		Putnik p2 = new Putnik("mika", "lukic", 1000);

		p2.removeNovac(2000);
		System.out.println(p2.getNovac());

		Autobus a = new Autobus("dalibor galantni", v, 0);

		a.naplatiKartu();

		a.addPutnik(p2);

	}

}
