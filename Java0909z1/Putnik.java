
public class Putnik extends Covek{
	
	/* Putnik je covek koji poseduje novac. 
Inicijalno poseduje odredjenu kolicinu novca koja mu se zadaje prilikom kreiranja. 
Odredjena svota novca moze da mu se doda i/ili oduzme. */
	
	private boolean imaNovac;
	private double koli�inaNovca;
	
	public Putnik (String imeIPrezime, double koli�inaNovca) {
		
		super (imeIPrezime);
		this.imaNovac=true;
		this.koli�inaNovca=koli�inaNovca;}
	
	
	
	public boolean isImaNovac() {
		return imaNovac;
	}




	public double getKoli�inaNovca() {
		return koli�inaNovca;
	}




	public 	double dodajNovac(double d) {
		if(d>0) {koli�inaNovca+=d;System.out.println("Novac je dodat i putnik sada ima "+koli�inaNovca);
		return koli�inaNovca;}
		else {System.out.println("Neuspe�no dodavanje");return 0.0;}
		
	}
	
	public double oduzmiNovac (double c) {
		if (koli�inaNovca>c) {koli�inaNovca-=c;System.out.println("Novac je oduzet"); return koli�inaNovca;}//return ; 
		else {System.out.println("Nema dovoljno novca");return 0.0;}
	}
	
	
	@Override
	public String toString () {
		
		return super.getImeIPrezime()+" "+koli�inaNovca;
		
		
	}
		
	}	
	
	
	
	
	
	


