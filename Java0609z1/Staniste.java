package domaciZivotinje;

import java.util.ArrayList;

public class Staniste {
	
	private String nazivStanista;
	
	private ArrayList<Zivotinje>zivotinje;
	
	public Staniste(String nazivStanista) {
		
		this.zivotinje=new ArrayList<Zivotinje>();
		this.nazivStanista=nazivStanista;
	}
	
	public void setZivotinje (Zivotinje a) {
		
		this.zivotinje.add(a); }
	
	
	
	public ArrayList<Zivotinje> getZivotinje() {
		return zivotinje;
	}
	
	public String getNazivStanista() {
		
		return nazivStanista;
		
	}
	
	public void stampaj() { System.out.print("U staništu "+this.nazivStanista+" žive sledeæe životinje: ");
		
		for (int i=0;i<zivotinje.size();i++) {System.out.print( zivotinje.get(i).getNaziv()+" ");
	}
	  
	}
}

