package personnages;

public class village {
    private String nom;
    private Gaulois chef;
    private Gaulois[] villageois;
    private int nbVillageois = 0;
    private static final int NB_VILLAGEOIS_MAX = 30;

    public village(String nom) {
        this.nom = nom;
        this.villageois = new Gaulois[NB_VILLAGEOIS_MAX];
    }

    public String getNom() {
        return nom;
    }

    public void setChef(Gaulois chef) {
        this.chef = chef;
    }

    public void ajouterVillageois(Gaulois gaulois) {
        if (nbVillageois < villageois.length) {
            villageois[nbVillageois] = gaulois;
            nbVillageois++;
        } else {
            System.out.println("The village is full, cannot add more villagers!");
        }
    }

    public Gaulois trouverVillageois(int numVillageois) {
        int indice = numVillageois - 1;
        if (indice >= 0 && indice < nbVillageois) {
            return villageois[indice];
        } else {
            System.out.println("There aren't that many inhabitants in our village!");
            return null;
        }
    }

    public void afficherVillageois() {
        if (chef == null) {
            System.out.println("In the village \"" + nom + "\" without a chief live the legendary Gauls:");
        } else {
            System.out.println("In the village \"" + nom + "\" of chief " + chef.getNom() + " live the legendary Gauls:");
        }
        for (int i = 0; i < nbVillageois; i++) {
            System.out.println("- " + villageois[i].getNom());
        }
    }
}