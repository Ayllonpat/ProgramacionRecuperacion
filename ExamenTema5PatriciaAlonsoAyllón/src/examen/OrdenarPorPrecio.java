package examen;

import java.util.Comparator;

public class OrdenarPorPrecio implements Comparator<Trastero>{

	public int compare(Trastero t1, Trastero t2) {
		// TODO Auto-generated method stub
		if(t1.getPrecio()>t2.getPrecio()) {
			return -1;
		}else if(t2.getPrecio()>t1.getPrecio()) {
			return 1;
		}else {
			return 0;
		}
	}

}
