
public class Putnik extends Covek{
	
	/* Putnik je covek koji poseduje novac. 
Inicijalno poseduje odredjenu kolicinu novca koja mu se zadaje prilikom kreiranja. 
Odredjena svota novca moze da mu se doda i/ili oduzme. */
	
	private boolean imaNovac;
	private double kolièinaNovca;
	
	public Putnik (String imeIPrezime, double kolièinaNovca) {
		
		super (imeIPrezime);
		this.imaNovac=true;
		this.kolièinaNovca=kolièinaNovca;}
	
	
	
	public boolean isImaNovac() {
		return imaNovac;
	}




	public double getKolièinaNovca() {
		return kolièinaNovca;
	}




	public 	double dodajNovac(double d) {
		if(d>0) {kolièinaNovca+=d;System.out.println("Novac je dodat i putnik sada ima "+kolièinaNovca);
		return kolièinaNovca;}
		else {System.out.println("Neuspešno dodavanje");return 0.0;}
		
	}
	
	public double oduzmiNovac (double c) {
		if (kolièinaNovca>c) {kolièinaNovca-=c;System.out.println("Novac je oduzet"); return kolièinaNovca;}//return ; 
		else {System.out.println("Nema dovoljno novca");return 0.0;}
	}
	
	
	@Override
	public String toString () {
		
		return super.getImeIPrezime()+" "+kolièinaNovca;
		
		
	}
		
	}	
	
	
	
	
	
	


