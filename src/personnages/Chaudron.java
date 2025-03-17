package personnages;

public class Chaudron {
	//tao lop Chaudron de luu cac thong tin ve so luong va suc manh cua thuoc
	private int quantitePotion;
	private int forcePotion;
	
	public Chaudron() {
		this.quantitePotion = 0;
		this.forcePotion = 0;
	}
	
	public boolean resterPotion() {
		return quantitePotion > 0;
	}
	
	public int prendreLouche() {
		if (quantitePotion > 0) {
			quantitePotion --;
			return forcePotion;
		}
		return 0;
	}
	
	public void remplirChaudron(int quantite, int forcePotion) {
		this.quantitePotion = quantite;
		this.forcePotion = forcePotion;
	}

}
