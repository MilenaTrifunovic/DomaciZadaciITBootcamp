package glumci2;

import java.util.ArrayList;

public class ListaFilmova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	ArrayList filmoviTom=new ArrayList();
	
	filmoviTom.add("Capone "+ 4.7);
	filmoviTom.add ("Venom "+6.7);
	filmoviTom.add("Dunkirk "+7.8);
	filmoviTom.add("The Revenant " +8.0);
	filmoviTom.add("Legend "+6.9);
	
	
	
	Object alt =filmoviTom.get(0);
	filmoviTom.set(0, filmoviTom.get(3));
	filmoviTom.set(3,filmoviTom.get(1));
	
	filmoviTom.set(1, filmoviTom.get(2));
	filmoviTom.set(2, filmoviTom.get(4));
	
	filmoviTom.set(4, alt);
	
	
	
	
	for(int i=0;i<filmoviTom.size();i++) {
		System.out.println(filmoviTom.get(i));
	}
	
	}

}
