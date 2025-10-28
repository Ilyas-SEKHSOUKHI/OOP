// TP N1:LES BASES DU LANGAGE JAVA EX4
import java.util.Scanner;
public class MaximumDe4Nombre {
    public static void main (String[] args){
        int[] Nombre = new int[]{3,4,3,2};
        for(int i=0;i<Nombre.length;i++){
            System.out.println("Entrez un Nombre");
            Scanner sc1 = new Scanner(System.in); // POUR QUE L'UTILISATEUR ENTRE UNE VALEUR
            Nombre[i] = sc1.nextInt(); // LA VALEUR ENTRER PAR L'UTILISATEUR VA ETRE STOCKE DANS nb
        }
        int Resultat=0;
        for(int i=0;i<Nombre.length;i++){
            if (Resultat-Nombre[i]<0){
                Resultat=Nombre[i];
            }
        }
        System.out.println("Plus Grand = "+Resultat);
    }
}
