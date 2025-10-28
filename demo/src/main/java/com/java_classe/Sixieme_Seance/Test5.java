//Exercice 5 : Méthode héritée
package com.java_classe.Sixieme_Seance;

class Vehicule {
    void demarrer() {
        System.out.println("Le véhicule démarre");
    }
}
class Voiture extends Vehicule {
    void klaxonner() {
        System.out.println("Je Klaxonne !");
    }
}
public class Test5 {
    public static void main(String[] args) {
        Voiture v = new Voiture();
        v.demarrer();
        v.klaxonner();
    }
}
/*
La classe Voiture hérite des méthodes de la classe Vehicule
et peut les utiliser en plus de ses propres méthodes.
 */