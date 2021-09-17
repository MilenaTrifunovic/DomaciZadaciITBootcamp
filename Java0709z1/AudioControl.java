package video;

public class AudioControl extends Control{

/* Kreirati klasu AudioControl koja nasledjuje klasu Control i getere, setere i konstruktore. 
 * Ima atribut koji kaze da li se smanjuje ili pojacava zvuk (tipa boolean). 
 * Implementirati metodu izvrsi akciju tako sto pojaca ili smanjuje zvuk za 1.
 *  U opsegu od 0 do 100.*/
	
	private boolean pojaèavanje;
	
	public AudioControl (boolean pojaèavanje) {
		
		this.pojaèavanje=pojaèavanje;
	}

	public final boolean isPojaèavanje() {
		return pojaèavanje;
	}

	
	public final void setPojaèavanje(boolean pojaèavanje) {
		this.pojaèavanje = pojaèavanje;
	}
	
  
  public void izvršiAkciju(VideoPlejer vp) {
	  if(pojaèavanje) {
		  
	  if (vp.getJaèinaZvuka()<100) {
	 vp.setJaèinaZvuka(vp.getJaèinaZvuka()+1); 
	  
  }else {vp.setJaèinaZvuka(100);}}

	  else {
		 if(vp.getJaèinaZvuka()>0) {
			
			 vp.setJaèinaZvuka(vp.getJaèinaZvuka()-1);
			 
		 } else {vp.setJaèinaZvuka(0);}
		  
		  
	  }


}
}
