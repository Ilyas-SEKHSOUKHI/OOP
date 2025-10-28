// TP N1:LES BASES DU LANGAGE JAVA EX5
import java.util.Scanner;
public class FactureElectricite {
    public static void main (String[] args){
        System.out.println("Entrez le prix");
        Scanner Clavier = new Scanner(System.in); // POUR QUE L'UTILISATEUR ENTRE UNE VALEUR
        double Consommation = Clavier.nextInt(); 
        double PremierTranche;
        double DeuxiemeTranche;
        double LocationDuCompteur = 25;
        double somme;
        double TVA ; 
        double Resultat;
        if(Consommation<100){
            PremierTranche = Consommation*0.5;
            System.out.println("Prix de Consommation = "+Consommation);
            System.out.println("Prix de Consommation + location du compteur = "+Consommation+LocationDuCompteur);
            TVA = ((Consommation+LocationDuCompteur)*20)/100;
            Resultat = (Consommation+LocationDuCompteur)-TVA;
            System.out.println("Montant Total + TVA = "+Resultat);
        }else{
            PremierTranche = 100*0.5;
            DeuxiemeTranche = (Consommation-100)*0.7;
            somme = PremierTranche+DeuxiemeTranche;
            System.out.println("Prix de Consommation = "+somme);
            System.out.println("Prix de Consommation + location du compteur = "+somme+LocationDuCompteur);
            TVA = ((somme+LocationDuCompteur)*20)/100;
            Resultat = (somme+LocationDuCompteur)-TVA;
            System.out.println("Montant Total + TVA = "+Resultat);
        }
        
    }
}
