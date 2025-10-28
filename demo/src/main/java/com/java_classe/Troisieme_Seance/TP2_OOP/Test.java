//EX3
package Troisieme_Seance.TP2_OOP;

public class Test {
    int i;
    Test(int i){
        this.i = i;
        this.m();
    }
    void m(){
        this.i++;
        System.out.println(this.i);
    }
    public static void main(String[] args){
        Test t =new Test(12);
        System.out.println("final i ="+t.i);
    }
}
