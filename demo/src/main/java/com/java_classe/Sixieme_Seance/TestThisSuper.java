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