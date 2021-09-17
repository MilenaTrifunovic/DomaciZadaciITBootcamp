package vezba;

public class Automobil {

	public String marka;
	public String model;
	public String pogon;
	public int brojVrata;
	public int godište;
	private int predjeniKm;
	public int potrošnja;
	public int kubikaža;
	private double novac;
	
	
	
	
	
	public Automobil(String marka, String model, String pogon, int brojVrata, int godište, int kubikaža) {
	
		this.marka=marka;
		this.model=model;
		this.pogon=pogon;
		this.brojVrata=brojVrata;
		this.godište=godište;
		this.kubikaža=kubikaža;
		
	}
	
	
	public Automobil () {}
	
	
	
	
	
	public void setPredjeniKm(int km) {this.predjeniKm=km;}
	
	public int getPredjeniKm() {return this.predjeniKm;}
	
	public int potrošnja() {
		
		if (this.kubikaža>1000) {return this.potrošnja=10;}
		else {return this.potrošnja=8;}
	}
	
	public void setNovac(double din) {

		
		this.novac =  ((this.predjeniKm*this.potrošnja)/100)*120;
	}
	
	public double getNovac() {return this.novac;}
	
	
public  void stampanjePodataka() {System.out.println("novac"+getNovac());
		
		System.out.println("Marka je "+marka+" ,model je "+model+" ,pogon je na "+pogon+ " ,broj vrata je "+brojVrata+ " .Godište automobila je "+godište+" i prešao je "+getPredjeniKm()+" km a potrošnja je "+potrošnja()+"l na 100 km"+ " .Novac potrošen na gorivo iznosi "+getNovac()+"dinara");
		
		
	}
	
	
}
