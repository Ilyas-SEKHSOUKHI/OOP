package EX2;

public class main {
    // Compare le prix de deux livres
    public static boolean estPlusCherQue(Livre A,Livre B){
        if(A.getPrix()>B.getPrix()){
            //System.out.println(A.getTitre()+">"+B.getTitre());
            return true;
        }else if(A.getPrix()<B.getPrix()){
            //System.out.println(A.getPrix()+"<"+B.getPrix());
            return false;
        }else{
            //System.out.println(A.getPrix()+"="+B.getPrix());
            return false;
        }
    }
    public static void main(String[] args) {
        Livre A = new Livre("Book1", "Auteur1", 1880, 200, 300);
        Livre B = new Livre("Book2", "Auteur2", 2005, 250, 320);
        
        A.appliquerRemise(20);
        B.appliquerRemise(20);

        System.out.println(A.estAncien());
        System.out.println(B.estAncien());

        System.out.println(estPlusCherQue(A, B));

        System.out.println(A.prixParPage());
        System.out.println(B.prixParPage());

        A.affichage();
        B.affichage();
    }
}
