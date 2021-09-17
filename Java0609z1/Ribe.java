package domaciZivotinje;

public class Ribe extends Kicmenjaci{
	
	private String mestoObitavanja;
	private int brojPeraja;
	private String vrstaPeraja;
	public Ribe(String naziv, String hrana, String mestoObitavanja, int brojPeraja, String vrstaPeraja) {
		super(naziv, hrana);
		this.mestoObitavanja = mestoObitavanja;
		this.brojPeraja = brojPeraja;
		this.vrstaPeraja = vrstaPeraja;
	}
	
	public final String getMestoObitavanja() {
		return mestoObitavanja;
	}
	
	public final void setMestoObitavanja(String mestoObitavanja) {
		this.mestoObitavanja = mestoObitavanja;
	}
	
	public final int getBrojPeraja() {
		return brojPeraja;
	}
	
	public final void setBrojPeraja(int brojPeraja) {
		this.brojPeraja = brojPeraja;
	}
	
	public final String getVrstaPeraja() {
		return vrstaPeraja;
	}
	
	public final void setVrstaPeraja(String vrstaPeraja) {
		this.vrstaPeraja = vrstaPeraja;
	}
	
	public void stampaj () {
		
		System.out.println(super.getNaziv()+" jede "+super.getHrana()+" ,stanište mu/joj je  "+this.mestoObitavanja+" i ima "+this.brojPeraja+" peraja koja spadaju u "+this.vrstaPeraja+".");
	}
	

}
