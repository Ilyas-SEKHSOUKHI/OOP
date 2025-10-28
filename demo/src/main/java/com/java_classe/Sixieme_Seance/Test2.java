// TD Heritage EX2 Appel_Explicite_a_Super (suite Seance 5)
package com.java_classe.Sixieme_Seance;
class Parent{
    Parent(String msg){
        System.out.println("Parent : "+msg);
    }
}
class Enfant extends Parent{
    Enfant(){
        super("appel du parent");
        System.out.println("Enfant");
    }
}
public class Test2 {
    public static void main(String[] args){
        new Enfant();
    }
}
