import java.util.List;

public class Secteur {
		
	public String typeAnimalDansSecteur;
	private List<Animal> animauxDansSecteur;
	
	public void ajouterAnimal(Animal animal) {
		animauxDansSecteur.add(animal);
	}
	
	public int getNombreAnimaux() {
		return animauxDansSecteur.size();
	}
	
	public String obtenirType() {
		return animauxDansSecteur.get(0).getTypeAnimal();
	}

}
