package personnages;

public class Gaulois {
	private String nom;
	private int force;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	public static void main(String[] args) {
	    Gaulois asterix = new Gaulois("Astérix", 8);
	    System.out.println(asterix);
	}
	public void boirePotion(int forcePotion) {
		this.force += forcePotion;
		parler("Merci pour la potion. Je me sens beaucoup plus fort")
	}
	@Override
	public String toString() {
		return nom;
	}
	
	public void frapper(Romain romain) {
		String nomRomain = romain.get Nom();
		System.out.println(nom + "envoie un grand coup a" + nomRomain);
		int forceCoup = force / 3;
		romain.recevoirCoup(forceCoup);
	}
}
