package video;

public class VideoPlejer {

private int dužinaVidea;
private int trenutnoVreme;
private int jaèinaZvuka;
private double kvalitetVidea;
public VideoPlejer(int dužinaVidea, int trenutnoVreme, int jaèinaZvuka) {
	
	this.dužinaVidea = dužinaVidea;
	this.trenutnoVreme = trenutnoVreme;
	this.jaèinaZvuka = jaèinaZvuka;
	this.kvalitetVidea = kvalitetVidea;
}

public final int getDužinaVidea() {
	return dužinaVidea;
}

public final void setDužinaVidea(int dužinaVidea) {
	this.dužinaVidea = dužinaVidea;
}

public final int getTrenutnoVreme() {
	return trenutnoVreme;
}

public final void setTrenutnoVreme(int trenutnoVreme) {
	this.trenutnoVreme = trenutnoVreme;
}

public final int getJaèinaZvuka() {
	return jaèinaZvuka;
}

public final void setJaèinaZvuka(int jaèinaZvuka) {
	this.jaèinaZvuka = jaèinaZvuka;
}

public final double getKvalitetVidea() {
	return kvalitetVidea;
}

public final void setKvalitetVidea(double d) {
	this.kvalitetVidea = d;
}


public void stampaj () {
	System.out.println(this.trenutnoVreme+" ,"+this.jaèinaZvuka+" ,"+this.kvalitetVidea);
}



}
