package video;

public class AudioControl extends Control{

/* Kreirati klasu AudioControl koja nasledjuje klasu Control i getere, setere i konstruktore. 
 * Ima atribut koji kaze da li se smanjuje ili pojacava zvuk (tipa boolean). 
 * Implementirati metodu izvrsi akciju tako sto pojaca ili smanjuje zvuk za 1.
 *  U opsegu od 0 do 100.*/
	
	private boolean poja�avanje;
	
	public AudioControl (boolean poja�avanje) {
		
		this.poja�avanje=poja�avanje;
	}

	public final boolean isPoja�avanje() {
		return poja�avanje;
	}

	
	public final void setPoja�avanje(boolean poja�avanje) {
		this.poja�avanje = poja�avanje;
	}
	
  
  public void izvr�iAkciju(VideoPlejer vp) {
	  if(poja�avanje) {
		  
	  if (vp.getJa�inaZvuka()<100) {
	 vp.setJa�inaZvuka(vp.getJa�inaZvuka()+1); 
	  
  }else {vp.setJa�inaZvuka(100);}}

	  else {
		 if(vp.getJa�inaZvuka()>0) {
			
			 vp.setJa�inaZvuka(vp.getJa�inaZvuka()-1);
			 
		 } else {vp.setJa�inaZvuka(0);}
		  
		  
	  }


}
}
