package glumci2;

public class glumciIGlumice {

	
	public String imeIPrezime;
	public int godRo�enja;
	public String pol;
	private String o�enjenUdata;
	private boolean bra�niStatus;
	private int brojFilmova;
	private double prosekPoFilmu;
	
	

	
	
	
	public glumciIGlumice () {}
	
	public glumciIGlumice (String imeIPrezime, int godRo�enja, String pol, String o�enjenUdata,int brojFilmova, double prosekPoFilmu) {
		
		this.imeIPrezime=imeIPrezime;
		this.godRo�enja=godRo�enja;
		this.pol=pol;
		this.o�enjenUdata=o�enjenUdata;
		this.brojFilmova=brojFilmova;
		this.prosekPoFilmu=prosekPoFilmu;
		
	}
		
	public boolean bra�niStatus () {
		
		this.bra�niStatus=bra�niStatus;
		
		if(o�enjenUdata.equalsIgnoreCase("married"))
	
		{ return true;}
		else
			return false;
	
		
	}
	
	
	public double ukupnaZarada() {
		
		return this.prosekPoFilmu*this.brojFilmova;
	}
	
	
	
	public int brojGodU22() {
		
		return 2022-this.godRo�enja;
		
		
		
		
	}
	
	
	
	
	public void stampa() {
	if (this.pol.equalsIgnoreCase("male"))	{System.out.println("Mr. "+this.imeIPrezime+" was born in "+this.godRo�enja+" .Gender " +this.pol + " . He filmed "+this.brojFilmova+ " movies. His marriage status is  "+this.bra�niStatus()+ " .Total amount of money made on movies is "+this.ukupnaZarada()+" $. In 2022 he will have "+this.brojGodU22()+" years. ");}
	if (this.pol.equalsIgnoreCase("female"))	{System.out.println("Mrs. "+this.imeIPrezime+" was born in "+this.godRo�enja+" .Gender " +this.pol + " . She filmed "+this.brojFilmova+ " movies. Her marriage status is  "+this.bra�niStatus()+ " .Total amount of money made on movies is "+this.ukupnaZarada()+" $. In 2022 se will have "+this.brojGodU22()+" years. ");

	}
    	
    }
}








	

