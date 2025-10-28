//Exercice 6 : Ordre d’appel des constructeurs
package com.java_classe.Sixieme_Seance;
class A {
    A() { System.out.println("A"); }
}
class B extends A {
    B() { System.out.println("B"); }
}
class C extends B {
    C() { System.out.println("C"); }
}
public class Test6 {
    public static void main(String[] args) {
        new C();
    }
}
/*
Lorsqu’un objet d’une classe dérivée est créé,
les constructeurs des classes parentes sont appelés
automatiquement dans l’ordre de l’héritage.
 */