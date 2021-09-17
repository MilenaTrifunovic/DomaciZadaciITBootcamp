package vezba;

public class Automobil {

	public String marka;
	public String model;
	public String pogon;
	public int brojVrata;
	public int godi�te;
	private int predjeniKm;
	public int potro�nja;
	public int kubika�a;
	private double novac;
	
	
	
	
	
	public Automobil(String marka, String model, String pogon, int brojVrata, int godi�te, int kubika�a) {
	
		this.marka=marka;
		this.model=model;
		this.pogon=pogon;
		this.brojVrata=brojVrata;
		this.godi�te=godi�te;
		this.kubika�a=kubika�a;
		
	}
	
	
	public Automobil () {}
	
	
	
	
	
	public void setPredjeniKm(int km) {this.predjeniKm=km;}
	
	public int getPredjeniKm() {return this.predjeniKm;}
	
	public int potro�nja() {
		
		if (this.kubika�a>1000) {return this.potro�nja=10;}
		else {return this.potro�nja=8;}
	}
	
	public void setNovac(double din) {

		
		this.novac =  ((this.predjeniKm*this.potro�nja)/100)*120;
	}
	
	public double getNovac() {return this.novac;}
	
	
public  void stampanjePodataka() {System.out.println("novac"+getNovac());
		
		System.out.println("Marka je "+marka+" ,model je "+model+" ,pogon je na "+pogon+ " ,broj vrata je "+brojVrata+ " .Godi�te automobila je "+godi�te+" i pre�ao je "+getPredjeniKm()+" km a potro�nja je "+potro�nja()+"l na 100 km"+ " .Novac potro�en na gorivo iznosi "+getNovac()+"dinara");
		
		
	}
	
	
}
