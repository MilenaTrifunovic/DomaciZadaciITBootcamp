package video;

public class AudioControl extends Control{

/* Kreirati klasu AudioControl koja nasledjuje klasu Control i getere, setere i konstruktore. 
 * Ima atribut koji kaze da li se smanjuje ili pojacava zvuk (tipa boolean). 
 * Implementirati metodu izvrsi akciju tako sto pojaca ili smanjuje zvuk za 1.
 *  U opsegu od 0 do 100.*/
	
	private boolean pojačavanje;
	
	public AudioControl (boolean pojačavanje) {
		
		this.pojačavanje=pojačavanje;
	}

	public final boolean isPojačavanje() {
		return pojačavanje;
	}

	
	public final void setPojačavanje(boolean pojačavanje) {
		this.pojačavanje = pojačavanje;
	}
	
  
  public void izvršiAkciju(VideoPlejer vp) {
	  if(pojačavanje) {
		  
	  if (vp.getJačinaZvuka()<100) {
	 vp.setJačinaZvuka(vp.getJačinaZvuka()+1); 
	  
  }else {vp.setJačinaZvuka(100);}}

	  else {
		 if(vp.getJačinaZvuka()>0) {
			
			 vp.setJačinaZvuka(vp.getJačinaZvuka()-1);
			 
		 } else {vp.setJačinaZvuka(0);}
		  
		  
	  }


}
}
