// Exercice 4 : Masquage d’attribut
package com.java_classe.Sixieme_Seance;
class A {
    int x = 10;
}
class B extends A {
    int x = 20;
}
public class Test4 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.x);
        System.out.println(((A)b).x);
    }
}
/*
Quand un attribut du même nom existe dans la classe fille,
il masque celui du parent. Le type de référence détermine
quel attribut est utilisé.
 */