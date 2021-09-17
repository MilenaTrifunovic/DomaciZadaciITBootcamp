package domaciZivotinje;

public class Sisari extends Kicmenjaci{
	
	private String bojaDlake;
	private String na�inIshrane;
	private boolean divlje;
	public Sisari(String naziv, String hrana, String bojaDlake, String na�inIshrane, boolean divlje) {
		super(naziv, hrana);
		this.bojaDlake = bojaDlake;
		this.na�inIshrane = na�inIshrane;
		this.divlje = divlje;
	}
	
	public final String getBojaDlake() {
		return bojaDlake;
	}
	
	public final void setBojaDlake(String bojaDlake) {
		this.bojaDlake = bojaDlake;
	}
	
	public final String getNa�inIshrane() {
		return na�inIshrane;
	}
	
	public final void setNa�inIshrane(String na�inIshrane) {
		this.na�inIshrane = na�inIshrane;
	}
	
	public final boolean isDivlje() {
		return divlje;
	}
	
	public final void setDivlje(boolean divlje) {
		this.divlje = divlje;
	}
	
	public void stampaj() {
		
		System.out.print(super.getNaziv()+" jede "+super.getHrana()+" .Boja dlake je "+this.bojaDlake+". "+super.getNaziv() +" je "+this.na�inIshrane+" i ");
		if (divlje) {System.out.print(" divlja zivotinja.");}
		else {System.out.print(" domaca zivotinja.");}
	}
	

}
