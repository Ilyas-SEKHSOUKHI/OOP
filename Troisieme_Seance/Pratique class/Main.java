package Troisieme_Seance;
public class Main {
    public static void afffichage(personne B){
        System.out.println(B.Name);
        System.out.println(B.age);
    }
    public static void main(String[] args) {
        personne A;
        A =new personne();
        A.Name="Ilyas";
        A.age=20;
        afffichage(A);
    }
}
