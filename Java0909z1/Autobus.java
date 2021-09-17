import java.util.ArrayList;

public class Autobus {
	
	/* Autobus poseduje naziv, vozaca, cenu karte i putnika koji se njime voze.
 Naziv i cena karte i zadaju se prilikom kreiranja. Moguce je dodati/ukloniti putnika kao i vozaca. */
	
	
	private String naziv;
	private Vozac vozac;
	private double cenaKarte;
	private Putnik putnik;
	private ArrayList<Putnik>putnici;
	private ArrayList<Vozac>vozaci;
	private boolean jePrisutan;
	private double naplataKarte;
	
	
	public Autobus (String naziv, double cenaKarte) {
		
		this.naziv=naziv;
		this.vozac=vozac;
		this.cenaKarte=cenaKarte;
		this.putnik=putnik;
		this.putnici=new ArrayList<Putnik>();
		this.vozaci=new ArrayList<Vozac>();
		this.jePrisutan=jePrisutan;
		
		
		
		
	}

	
	public String getNaziv() {
		return naziv;
	}

	
	public Vozac getVozac() {
		return vozac;
	}

	
	public double getCenaKarte() {
		return cenaKarte;
	}

	
	public Putnik getPutnik() {
		return putnik;
	}

	
	public ArrayList<Putnik> getPutnici() {
		return putnici;
	}
	
	
	public ArrayList<Vozac> getVozaci() {
		return vozaci;
	}
	
	
	
	public boolean isVozacPrisutan() {
		return jePrisutan;
	}
	
	

	public double getNaplataKarte() {
		return naplataKarte;
	}


	public void dodajPutnika (Putnik a) {
		
		
		
		putnici.add(a);
		
		
		
	}
	
	
	public void ukloniPutnika (Putnik p1) {
		
		putnici.remove(p1);
		
		
	}
	
	public void dodajVozaèa (Vozac a ) {
		
		if (vozaci.size()==0)
		{vozaci.add(a); System.out.println(a+" je dodat");}
		else {System.out.println("Autobus veæ ima vozaèa");}
		
	}
	
	
	public void ukloniVozaèa (Vozac a) {
		
		if (vozaci.size()!=0) {
		
		vozaci.remove(a);System.out.println("Vozaè "+a+" je uklonjen");}
		
	}
	
	
	public void stampaNizaPutnika () {
		for (int i=0; i<putnici.size();i++) {
			
			
			System.out.println (putnici.get(i).getImeIPrezime());
		} }
	
	public void stampaNizaVozaca () {
		
		for (int i=0; i<vozaci.size();i++) {
			System.out.println(vozaci.get(i).getImeIPrezime()+" "+vozaci.get(i).getZanimanje());}
		
		
	}	
		
	public double naplatiKartu (boolean jePrisutan,Putnik a) {
		
		if (jePrisutan&& a.getKolièinaNovca()>cenaKarte) {naplataKarte=a.getKolièinaNovca()-cenaKarte;
		
		System.out.println("Karta je naplaæena ");
		return naplataKarte;
		
		} else {System.out.println("Nemoguæa naplata kad vozaè nije prisutan");return 0.0;}
		
	}	
	
	@Override
	public String toString () {
		
	return naziv+" lista :"; }
		
	 
		
		
	}
	
	
	


