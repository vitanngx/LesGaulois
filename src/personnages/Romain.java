package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	
	public void recevoirCoup(int forceCoup) {
	    if (forceCoup >= 5) {
	        System.out.println("Le Romain " + nom + " : Aie");
	    } else {
	        System.out.println("Le Romain " + nom + " : J'abandonne !");
	    }
	}
	

}
