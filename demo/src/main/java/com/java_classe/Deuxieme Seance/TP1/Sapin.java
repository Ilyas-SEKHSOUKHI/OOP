// TP N1:LES BASES DU LANGAGE JAVA EX9
public class Sapin {
    public static void main (String[] args){
        String Etoile = "*";
        System.out.println("  "+Etoile);
        for(int i=0;i<4;i++){
            if(i<4){
                Etoile = Etoile + Etoile;
                System.out.println("  "+Etoile);
            }
        }
    }
}
