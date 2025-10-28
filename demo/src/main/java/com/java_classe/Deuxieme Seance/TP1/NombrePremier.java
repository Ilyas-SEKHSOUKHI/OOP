// TP N1:LES BASES DU LANGAGE JAVA EX7
import java.util.Scanner;
public class NombrePremier {
    public static void main (String[] args){
        System.out.println("Entrez Premier Nombre");
        Scanner sc1 = new Scanner(System.in); // POUR QUE L'UTILISATEUR ENTRE UNE VALEUR
        int nb1 = sc1.nextInt();
        boolean test = true;
        for(int Nombre = nb1 ; Nombre<=10;++Nombre){
            for(int i=2;i<Nombre;i++){
                if(Nombre%i==0) test=false;
            }
            if(test==true){
                System.out.println("est Premier");
                break;
            }else{
                System.out.println("est pas premier");
                break;
            }
        }
    }
}
