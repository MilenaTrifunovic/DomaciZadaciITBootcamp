package glumci2;

import java.util.ArrayList;

public class ListaFilmova2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	ArrayList filmoviM=new ArrayList();
	
	filmoviM.add("Annetee" +6.5);
	filmoviM.add("Angel face "+6.0);
	filmoviM.add("Little White Lies "+6.5);
	filmoviM.add("Dolittle "+5.6);
	filmoviM.add("Ismael's Ghosts "+5.5);
	
	
	
	
	Object alt=filmoviM.get(2);
	filmoviM.set(2,filmoviM.get(1) );
	filmoviM.set(1, alt);
	
	for (int i=0;i<filmoviM.size();i++) {
		
		System.out.println(filmoviM.get(i));
	}
	
	
	}

}
