package video;

public class VideoPlejer {

private int du�inaVidea;
private int trenutnoVreme;
private int ja�inaZvuka;
private double kvalitetVidea;
public VideoPlejer(int du�inaVidea, int trenutnoVreme, int ja�inaZvuka) {
	
	this.du�inaVidea = du�inaVidea;
	this.trenutnoVreme = trenutnoVreme;
	this.ja�inaZvuka = ja�inaZvuka;
	this.kvalitetVidea = kvalitetVidea;
}

public final int getDu�inaVidea() {
	return du�inaVidea;
}

public final void setDu�inaVidea(int du�inaVidea) {
	this.du�inaVidea = du�inaVidea;
}

public final int getTrenutnoVreme() {
	return trenutnoVreme;
}

public final void setTrenutnoVreme(int trenutnoVreme) {
	this.trenutnoVreme = trenutnoVreme;
}

public final int getJa�inaZvuka() {
	return ja�inaZvuka;
}

public final void setJa�inaZvuka(int ja�inaZvuka) {
	this.ja�inaZvuka = ja�inaZvuka;
}

public final double getKvalitetVidea() {
	return kvalitetVidea;
}

public final void setKvalitetVidea(double d) {
	this.kvalitetVidea = d;
}


public void stampaj () {
	System.out.println(this.trenutnoVreme+" ,"+this.ja�inaZvuka+" ,"+this.kvalitetVidea);
}



}
