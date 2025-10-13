//EX2
package Troisieme_Seance.TP2_OOP;

public class Test1 {
    int i;
    Test1(int i){
        this.i =12;
        i = 15;
    }        
    void i(){
        Test1 i = new Test1(3);
        System.out.println(i.i);
        i.i();
    }
    public static void main(String[] toto){
        Test1 i = new Test1(34);
        i.i();
    }
}
