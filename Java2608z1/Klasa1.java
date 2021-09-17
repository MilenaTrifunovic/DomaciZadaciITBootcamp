package vezba;

public class Klasa1 {

	public static void main(String[] args) {
		
		
		
		Automobil auto1 = new Automobil();
		auto1.marka="Fiat";
		auto1.model="500";
		auto1.pogon="benzin";
		auto1.brojVrata=4;
		auto1.godište=2016;
		auto1.kubikaža=500;
		auto1.setPredjeniKm(600);
		
		
		System.out.println(auto1.getNovac());
		auto1.stampanjePodataka();

	}

}
