import java.util.Scanner;
public class Switch {
    public static void main (String[] args){
        System.out.println("Donner un Nombre");
        //Scanner
        Scanner Clavier = new Scanner(System.in); // POUR QUE L'UTILISATEUR ENTRE UNE VALEUR
        int nb = Clavier.nextInt(); // LA VALEUR ENTRER PAR L'UTILISATEUR VA ETRE STOCKE DANS nb
        /*
         * -----------Syntaxe---------------
         * switch(variable){
         *  case valeur1: instr1;break;
         *  case valeur2: instr2;break;
         *  case valeurN: instrN;break;
         *  default: instr;break;
         * }
         */
        switch(nb){
            case 1: System.out.println("Lundi"); break;
            case 2: System.out.println("Mardi"); break;
            case 3: System.out.println("Mercredi"); break;
            default: System.out.println("Autrement"); break;
        }
    }
}
