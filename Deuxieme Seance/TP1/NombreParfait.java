// TP N1:LES BASES DU LANGAGE JAVA EX4
import java.util.Scanner;
public class NombreParfait {
    public static void main (String[] args){
        System.out.println("Entrez Premier Nombre");
        Scanner sc1 = new Scanner(System.in); // POUR QUE L'UTILISATEUR ENTRE UNE VALEUR
        int nb1 = sc1.nextInt();
        int VALEUR=0;
        for(int i=1;i<nb1;i++){
            if(nb1%i==0){
                VALEUR = VALEUR+i;
            }
        }
        if(VALEUR ==nb1){
            System.out.println("Nombre Parfait");
        }else{
            System.out.println("pas parfait");
        }
        
    }
}
