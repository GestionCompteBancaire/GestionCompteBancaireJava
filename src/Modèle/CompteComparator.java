package Modèle;

import java.util.Comparator;

public class CompteComparator implements Comparator<Compte>{

	@Override
	public int compare(Compte o1, Compte o2) {
		return Float.compare(o2.getSoldeFinal(),o1.getSoldeFinal());
	}

}
