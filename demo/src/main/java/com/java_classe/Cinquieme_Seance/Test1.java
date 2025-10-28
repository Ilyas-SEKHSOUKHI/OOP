// TD Heritage EX1 Constructeur et super
package com.java_classe.Cinquieme_Seance;

class A {
    A(){
        System.out.println("Constructeur A");
    }
}
class B extends A {
    B(){
        System.out.println("Constructeur B");
    }
}
public class Test1 {
    public static void main(String[] args) {
        B obj = new B();
    }
}
/*
Lorsqu’un objet B est créé, le constructeur de la classe parent A est appelé en premier,
puis celui de B. Cela illustre l’ordre automatique des constructeurs dans l’héritage.
 */