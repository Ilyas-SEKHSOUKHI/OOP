//Exercice 8 
package com.java_classe.Sixieme_Seance;
class Parent {
    int x = 10;
    void afficher() {
        System.out.println("Méthode du parent");
    }
}
class Enfant extends Parent {
    int x = 20;
    void afficher() {
        System.out.println("Méthode de l’enfant");
    }
void test() {
    System.out.println("x via this = " + this.x);
    System.out.println("x via super = " + super.x);
    this.afficher();
    super.afficher();
}
}
public class TestThisSuper {
    public static void main(String[] args) {
        Enfant e = new Enfant();
        e.test();
    } 
}
/*
- this.x et this.afficher() utilisent les membres de la classe Enfant.
- super.x et super.afficher() accèdent aux membres de la classe Parent.
- this fait référence à l’objet actuel, super fait référence à la classe parent.
 */