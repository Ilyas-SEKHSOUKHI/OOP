// TP N1:LES BASES DU LANGAGE JAVA EX3
import java.util.Scanner;
public class PaireOuImpair {
    public static void main (String[] args){
        System.out.println("Entrez Premier Nombre");
        Scanner sc1 = new Scanner(System.in); // POUR QUE L'UTILISATEUR ENTRE UNE VALEUR
        int nb1 = sc1.nextInt(); // LA VALEUR ENTRER PAR L'UTILISATEUR VA ETRE STOCKE DANS nb
        if(nb1%2==0){
            System.out.println("pair");
        }else{
            System.out.println("Impair");
        }
    }
}
