// Exercice 3 : Attributs hérités
package com.java_classe.Sixieme_Seance;

class Animal {
    String espece = "Animal";
}
class Chien extends Animal {
    String nom = "Rex";
}
public class Test3 {
    public static void main(String[] args) {
        Chien c = new Chien();
        System.out.println(c.espece);
        System.out.println(c.nom);
    }
}
/*
L’objet Chien hérite des attributs de la classe Animal
et peut utiliser à la fois ses propres attributs et ceux du parent.
*/
