package video;

import java.util.ArrayList;

public class Glavna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	VideoPlejer v1=new VideoPlejer(500,50,5);
	
	QualityOptimizerControl qo1=new QualityOptimizerControl(100);
	AudioControl ac1=new AudioControl(true);
	TimeControl tc1=new TimeControl(false);
	
	qo1.izvršiAkciju(v1);
	v1.stampaj();
	ac1.izvršiAkciju(v1);
	v1.stampaj();
	tc1.izvršiAkciju(v1);
	v1.stampaj();
	
	ArrayList <Control> akcije=new ArrayList();
	akcije.add(tc1);
	akcije.add(ac1);
	akcije.add(qo1);
	
	for (int i=0; i<akcije.size();i++) {
		
		akcije.get(i).izvršiAkciju(v1);
	}
	v1.stampaj();
		
	}
	
	
	//vp.izvšiAkciju(v1);
	
	}


