
public class Vozac extends Covek{
	
	//Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).
	
   private String zanimanje;
   
   public Vozac (String imeIPrezime) {
   super (imeIPrezime);
   this.zanimanje="šofer";
   
   }
	
   public String getZanimanje () {
	   
	  return zanimanje; 
	   
   }
   @Override
   public String toString () {
	   
	   return zanimanje+ " "+super.getImeIPrezime();
   }
}
