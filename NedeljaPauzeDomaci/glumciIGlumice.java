package glumci2;

public class glumciIGlumice {

	
	public String imeIPrezime;
	public int godRođenja;
	public String pol;
	private String oženjenUdata;
	private boolean bračniStatus;
	private int brojFilmova;
	private double prosekPoFilmu;
	
	

	
	
	
	public glumciIGlumice () {}
	
	public glumciIGlumice (String imeIPrezime, int godRođenja, String pol, String oženjenUdata,int brojFilmova, double prosekPoFilmu) {
		
		this.imeIPrezime=imeIPrezime;
		this.godRođenja=godRođenja;
		this.pol=pol;
		this.oženjenUdata=oženjenUdata;
		this.brojFilmova=brojFilmova;
		this.prosekPoFilmu=prosekPoFilmu;
		
	}
		
	public boolean bračniStatus () {
		
		this.bračniStatus=bračniStatus;
		
		if(oženjenUdata.equalsIgnoreCase("married"))
	
		{ return true;}
		else
			return false;
	
		
	}
	
	
	public double ukupnaZarada() {
		
		return this.prosekPoFilmu*this.brojFilmova;
	}
	
	
	
	public int brojGodU22() {
		
		return 2022-this.godRođenja;
		
		
		
		
	}
	
	
	
	
	public void stampa() {
	if (this.pol.equalsIgnoreCase("male"))	{System.out.println("Mr. "+this.imeIPrezime+" was born in "+this.godRođenja+" .Gender " +this.pol + " . He filmed "+this.brojFilmova+ " movies. His marriage status is  "+this.bračniStatus()+ " .Total amount of money made on movies is "+this.ukupnaZarada()+" $. In 2022 he will have "+this.brojGodU22()+" years. ");}
	if (this.pol.equalsIgnoreCase("female"))	{System.out.println("Mrs. "+this.imeIPrezime+" was born in "+this.godRođenja+" .Gender " +this.pol + " . She filmed "+this.brojFilmova+ " movies. Her marriage status is  "+this.bračniStatus()+ " .Total amount of money made on movies is "+this.ukupnaZarada()+" $. In 2022 se will have "+this.brojGodU22()+" years. ");

	}
    	
    }
}








	

