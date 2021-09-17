package domaciZivotinje;

public class Zivotinje {
	
	
	/*U zoovrtu obitavaju razne zivotinje. Sve imaju svoju vrstu (kicmenjaci, beskicmenjaci),
	 *  konkretan naziv i cime se hrane.
	Ribe su kicmenjaci koje karakterise mesto obitavanja (slatka, slana voda), broj peraja, vrsta peraja
	Sisari su kicmenjaci koje se razlikuju po boji dlake, nacinu ishrane (biljojedi, mesojedi, svastojedi), i covekovoj podeli na divlje i domace.
	Napraviti klasu Staniste u kom se nalazi lista zivotinja koje u tom stanistu zive. Staniste takodje ima naziv koji moze da se dohvati ali ne i postavi.
	Ispisati bar jednog sisara i jednu ribu kao vrstu zivotinje.
	Ispisati bar jedno staniste.
	Jednom sisaru zameniti ulogu koju mu je covek dodelio.*/

    private String naziv;
    private String hrana;
	public Zivotinje(String naziv, String hrana) {
	
		this.naziv = naziv;
		this.hrana = hrana;
	}
	
	public final String getNaziv() {
		return naziv;
	}
	
	public final void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	public final String getHrana() {
		return hrana;
	}
	
	public final void setHrana(String hrana) {
		this.hrana = hrana;
	}
    
    
    public void stampanje() {
    	
    	System.out.println(this.naziv+" "+this.hrana);
    }









}
