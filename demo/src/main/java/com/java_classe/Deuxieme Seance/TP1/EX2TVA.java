// TP N1:LES BASES DU LANGAGE JAVA EX2
import java.util.Scanner;
public class EX2TVA {
    public static void main (String[] args){
        //Scanner
        System.out.println("Entrez le prix");
        Scanner Clavier = new Scanner(System.in); // POUR QUE L'UTILISATEUR ENTRE UNE VALEUR
        int nb = Clavier.nextInt(); // LA VALEUR ENTRER PAR L'UTILISATEUR VA ETRE STOCKE DANS nb
        double Taxe = (nb*20)/100;
        double TaxeNB = nb-Taxe;
        System.out.println("Le prix TTC = "+nb);
        System.out.println("20% TAXE = "+Taxe);
        System.out.println("Le prix apres le taxe = "+TaxeNB);
    }
}
