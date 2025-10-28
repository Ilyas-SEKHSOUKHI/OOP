package Troisieme_Seance.EX1;

public class EX1 {
    public static void affichage(cercle B){
        System.out.println("Centre : "+B.centre);
        System.out.println("Rayon : "+B.rayon);

    }
    public static void main(String[] args) {
        point C;
        C = new point(5, 6);
        cercle A;
        A = new cercle(C,7); 
        affichage(A);
    }
}
