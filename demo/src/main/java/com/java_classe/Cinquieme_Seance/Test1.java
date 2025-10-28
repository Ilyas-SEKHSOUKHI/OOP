// TD Heritage EX1 Constructeur et super
package Cinquieme_Seance;

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