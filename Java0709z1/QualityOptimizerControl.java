package video;

public class QualityOptimizerControl extends Control{
	
	
	/*Kreirati klasu QualityOptimizerControl koja nasledjuje klasu Control i 
	 * ima brzinu interneta u megabitima npr 10mb/s 20mb/s... Getere, setere i konstruktore. 
	 * Implementira metodu izvrsi akciju tako sto postavlja kvalitet videa u zavisnosti od brzine
	 *  interneta.
	 Kvalitet se racuna na osnovu formule: brzina interneta * 10.1 gde se uzima prvi veci kvalitet
	 ako je brzina 20 * 10.1 = 204 - postavlja 240;
	 ako je brzina 5*10.1 = 50.5 - postavlja 144;
	 ako je brzina 20*10.1 = 505 - postavlja 720;*/
	
	private double brzinaInterneta;
	
	public QualityOptimizerControl (double brzinaInterneta) {
		
		this.brzinaInterneta=brzinaInterneta;
	}

	
	public final double getBrzinaInterneta() {
		return brzinaInterneta;
	}

	
	public final void setBrzinaInterneta(double brzinaInterneta) {
		this.brzinaInterneta = brzinaInterneta;
	}


	
	public void izvršiAkciju(VideoPlejer vp) {
		
		//kvalitet videa (144, 240, 360, 480, 720, 1080)
		vp.setKvalitetVidea(brzinaInterneta*10.1);
		
		if(vp.getKvalitetVidea()<=144) {vp.setKvalitetVidea(144);}
		
		
		else if(vp.getKvalitetVidea()<=240) {vp.setKvalitetVidea(240);}
		
		
		else if(vp.getKvalitetVidea()<=360) {vp.setKvalitetVidea(360);}
		
		
		
		else if(vp.getKvalitetVidea()<=480) {vp.setKvalitetVidea(480);}
		
		
		
		else if(vp.getKvalitetVidea()<=720) {vp.setKvalitetVidea(720);}
		
		
		else if(vp.getKvalitetVidea()<=1080) {vp.setKvalitetVidea(1080);}
		
		else {vp.setKvalitetVidea(1080);}
		
		
	}
	
	
	
	
	
	
	

}
