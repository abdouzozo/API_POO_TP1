import java.util.List;

public class Zoo {
	
	private int visiteurs;
	private List<Secteur> secteursAnimaux;
	
	public void ajouterSecteur(String typeSecteur) {
		Secteur nouv_secteur = new Secteur();
		nouv_secteur.typeAnimalDansSecteur = typeSecteur;
		secteursAnimaux.add(nouv_secteur);
	}
	
	public void nouveauVisiteur() {
		visiteurs++;
	}
	
	public int getLimitVisiteur() {
		
		return 15*(secteursAnimaux.size());
	}
	
	
	

}
