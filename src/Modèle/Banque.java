package Modèle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Banque {
	
	public ArrayList listes = new ArrayList<Compte>();
	
	
	public void ajouterClient(Compte c) {
			listes.add(c);
	}
	
	public ArrayList trierNom() {
		ArrayList Copie =listes;
		Collections.sort(Copie);
		return Copie;
    }

	public ArrayList trierSolde() {
		ArrayList Copie =listes;
		Collections.sort(Copie,new CompteComparator());
		return Copie;
    }
}
