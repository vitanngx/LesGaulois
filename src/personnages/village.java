
	package personnages; // tổ chức và nhóm các lớp liên quan lại với nhau

	public class Village { // khai báo lớp VILLAGE
	// khai báo các thuộc tính của lớp VILLAGE
	    private String nom;
	    private int nbVillageois = 0;
	    private Gaulois[] villageois;
	    private Gaulois chef;
	    private int static NB_VILLAGEOIS_MAX = 30;
	    // Constructor của lớp VILLAGE
	    public Village(String nom) {
	        this.nom = nom; //constructor nhận 1 tham số nom và gán giá trị tham số này cho thuộc tính nom
	        this.villageois = new Gaulois[30]; //constructor khởi tạo mảng với kích thước là ...
	    }
	    //phương thức getter để lấy giá trị thuộc tính nom
	    public String getNom() {
	        return nom;
	    }
		//phương thức stter thiết lập giá trị cho thuộc tính chef
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

}
