package personnages;

public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron;

	public Druide (String nom, int force) {
		this.nom = nom;
		this.force = force;
		this.chaudron = new Chaudron();
	}
	public String getNom() {
		return nom;
	}
	public String prendreParole() {
		return "Druide" + nom + ":";
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"" );
	}
	
	public void fabriquerPotion(int quantite, int forcePotion) {
		parler("J'ai concocte " + quantite + " doses de potion maquique. Elle a une force de "+ forcePotion +".");
	}
	public void booster(Gaulois gaulois) {
		if (chaudron.resterPotion() {
			int forcePotion = chaudron.prendreLouche();
			gaulois.boirePotion(forcePotion);
			parler("Tiens" +gaulois.getNom()+ ", un peu de potion magique.");
		} else {
			parler("Desole" + gaulois.getNom() + ", il n'y a plus de potion.");
		}
		
	}
}
