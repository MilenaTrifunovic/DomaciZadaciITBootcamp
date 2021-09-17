package video;

public class VideoPlejer {

private int dužinaVidea;
private int trenutnoVreme;
private int jačinaZvuka;
private double kvalitetVidea;
public VideoPlejer(int dužinaVidea, int trenutnoVreme, int jačinaZvuka) {
	
	this.dužinaVidea = dužinaVidea;
	this.trenutnoVreme = trenutnoVreme;
	this.jačinaZvuka = jačinaZvuka;
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

public final int getJačinaZvuka() {
	return jačinaZvuka;
}

public final void setJačinaZvuka(int jačinaZvuka) {
	this.jačinaZvuka = jačinaZvuka;
}

public final double getKvalitetVidea() {
	return kvalitetVidea;
}

public final void setKvalitetVidea(double d) {
	this.kvalitetVidea = d;
}


public void stampaj () {
	System.out.println(this.trenutnoVreme+" ,"+this.jačinaZvuka+" ,"+this.kvalitetVidea);
}



}
