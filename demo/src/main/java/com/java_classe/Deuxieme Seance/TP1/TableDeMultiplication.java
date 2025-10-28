// TP N1:LES BASES DU LANGAGE JAVA EX6
import java.util.Scanner;
public class TableDeMultiplication {
    public static void main (String[] args){
        int Nombre;
        System.out.println("Entrez un Nombre");
        Scanner sc1 = new Scanner(System.in); // POUR QUE L'UTILISATEUR ENTRE UNE VALEUR
        Nombre = sc1.nextInt(); 
        for(int i=0;i<=10;i++){
            System.out.println(Nombre+"*"+i+"="+Nombre*i);
        }
    }
}
