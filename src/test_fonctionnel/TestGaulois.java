package test_fonctionnel;

import personnages.Gaulois;
import personnages.Druide;
import personnages.Romain;

public class TestGaulois {
    public static void main(String[] args) {
        Gaulois asterix = new Gaulois("Astérix", 8);
        Gaulois obelix = new Gaulois("Obélix", 16);
        Druide panoramix = new Druide("Panoramix", 5);

        asterix.parler("Bonjour Obélix.");
        obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
        asterix.parler("Oui très bonne idée.");

        Romain minus = new Romain("Minus", 6);
        System.out.println("Dans la forêt Astérix et Obélix tombe nez à nez sur le romain " + minus.getNom());

        panoramix.fabriquerPotion(3, 10);
        panoramix.booster(obelix);
        panoramix.booster(asterix);
    }
}