package domaciZivotinje;

public class Sisari extends Kicmenjaci{
	
	private String bojaDlake;
	private String naèinIshrane;
	private boolean divlje;
	public Sisari(String naziv, String hrana, String bojaDlake, String naèinIshrane, boolean divlje) {
		super(naziv, hrana);
		this.bojaDlake = bojaDlake;
		this.naèinIshrane = naèinIshrane;
		this.divlje = divlje;
	}
	
	public final String getBojaDlake() {
		return bojaDlake;
	}
	
	public final void setBojaDlake(String bojaDlake) {
		this.bojaDlake = bojaDlake;
	}
	
	public final String getNaèinIshrane() {
		return naèinIshrane;
	}
	
	public final void setNaèinIshrane(String naèinIshrane) {
		this.naèinIshrane = naèinIshrane;
	}
	
	public final boolean isDivlje() {
		return divlje;
	}
	
	public final void setDivlje(boolean divlje) {
		this.divlje = divlje;
	}
	
	public void stampaj() {
		
		System.out.print(super.getNaziv()+" jede "+super.getHrana()+" .Boja dlake je "+this.bojaDlake+". "+super.getNaziv() +" je "+this.naèinIshrane+" i ");
		if (divlje) {System.out.print(" divlja zivotinja.");}
		else {System.out.print(" domaca zivotinja.");}
	}
	

}
