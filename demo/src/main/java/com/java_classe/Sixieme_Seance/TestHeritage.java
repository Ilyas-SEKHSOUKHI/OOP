//Exercice 7 : Méthode définie dans l’enfant
package com.java_classe.Sixieme_Seance;

class Parent {
    void afficher() {
        System.out.println("Méthode du parent");
    }
}
class Enfant extends Parent {
    void saluer() {
        System.out.println("Bonjour, je suis l'enfant !");
    }
}
public class TestHeritage {
    public static void main(String[] args) {
        Parent p = new Parent();
        Enfant e = new Enfant();
        Parent ref = new Enfant();
        p.afficher();
        e.afficher();
        e.saluer();
        ref.afficher();
       //ref.saluer();
    }
}