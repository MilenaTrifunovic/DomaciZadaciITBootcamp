package video;

public class TimeControl extends Control{
	
	
	private boolean unapred;
	
	

	public TimeControl(boolean unapred) {
		super();
		this.unapred = unapred;
	}
 
	
	

	public final boolean isUnapred() {
		return unapred;
	}


	
	public final void setUnapred(boolean unapred) {
		this.unapred = unapred;
	}

	public void izvršiAkciju(VideoPlejer vp) {
		if (unapred) {
		if(vp.getTrenutnoVreme()<vp.getDužinaVidea()+15) {
			vp.setTrenutnoVreme(vp.getTrenutnoVreme()+15);}
		else {vp.setTrenutnoVreme(vp.getDužinaVidea());}
		
		}
		else {
			if(vp.getTrenutnoVreme()>15) {
				
				vp.setTrenutnoVreme(vp.getTrenutnoVreme()-15);
			}
			else {vp.setTrenutnoVreme(0);}
		}
	}

	

}
