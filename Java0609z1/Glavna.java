package domaciZivotinje;

public class Glavna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Sisari s1=new Sisari ("Koala","biljke","siva","biljojed",true);
	Sisari s2= new Sisari ("Medved", " meso", "sme�a", "mesojed", false);
		
	s1.stampaj();
	System.out.println();
	s2.stampaj();
	System.out.println();
	
	Ribe r1=new Ribe ("Pastrmka","insekte","slatka voda",8, "trbusna,grudna i le�na");
	r1.stampaj();
	
	Ribe r2=new Ribe ("�aran"," biljke", " slatka voda",5, "trbusna, grudna i le�na");
	r2.stampaj();
	
	
	Staniste st1=new Staniste("reka");
	st1.setZivotinje(r1);
	st1.setZivotinje(r2);
	
	
	st1.stampaj();
	
	
	}

}
