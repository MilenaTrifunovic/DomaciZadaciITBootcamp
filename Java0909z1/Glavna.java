
public class Glavna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Covek c1=new Covek ("Marko Markovic");
	Putnik p1= new Putnik ("Milica",500.0);
	Putnik p2=new Putnik ("Nikola",200.0);
	Putnik p3=new Putnik ("Nemanja",400.0);
	
	Vozac v1=new Vozac("Mirko Mirkovic");
	Vozac v2=new Vozac ("Marko Markovic");
	
	Autobus a1=new Autobus("Lasta ",100.0);
	a1.dodajPutnika(p1);
	a1.dodajPutnika(p2);
	a1.dodajPutnika(p3);
	
	
	a1.dodajVozaèa(v2);
	a1.dodajVozaèa(v1);
	
	
	a1.naplatiKartu(true,p1);
	a1.naplatiKartu(false, p3);
	
	
	}

}
