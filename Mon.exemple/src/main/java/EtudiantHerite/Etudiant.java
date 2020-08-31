package EtudiantHerite;

import MonExemple.InterfacePersonne;
import MonExemple.Personne;

public class Etudiant implements InterfaceEtudiant{
 private InterfacePersonne P=null;
 
 
 
	public void setP(Personne p) {
	P = p;
}


	public void affichageInformation() {
System.out.println("le nom de notre etudiant est: "+P.afficheNom("amine")+" est l'age :"+P.afficheAge(12));
		
	}

}
