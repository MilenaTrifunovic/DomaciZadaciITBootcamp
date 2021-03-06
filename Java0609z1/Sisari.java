package domaciZivotinje;

public class Sisari extends Kicmenjaci{
	
	private String bojaDlake;
	private String načinIshrane;
	private boolean divlje;
	public Sisari(String naziv, String hrana, String bojaDlake, String načinIshrane, boolean divlje) {
		super(naziv, hrana);
		this.bojaDlake = bojaDlake;
		this.načinIshrane = načinIshrane;
		this.divlje = divlje;
	}
	
	public final String getBojaDlake() {
		return bojaDlake;
	}
	
	public final void setBojaDlake(String bojaDlake) {
		this.bojaDlake = bojaDlake;
	}
	
	public final String getNačinIshrane() {
		return načinIshrane;
	}
	
	public final void setNačinIshrane(String načinIshrane) {
		this.načinIshrane = načinIshrane;
	}
	
	public final boolean isDivlje() {
		return divlje;
	}
	
	public final void setDivlje(boolean divlje) {
		this.divlje = divlje;
	}
	
	public void stampaj() {
		
		System.out.print(super.getNaziv()+" jede "+super.getHrana()+" .Boja dlake je "+this.bojaDlake+". "+super.getNaziv() +" je "+this.načinIshrane+" i ");
		if (divlje) {System.out.print(" divlja zivotinja.");}
		else {System.out.print(" domaca zivotinja.");}
	}
	

}
