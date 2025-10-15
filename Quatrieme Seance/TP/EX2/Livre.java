package EX2;

public class Livre {
    String titre;
    String auteur;
    int anneePublication;
    double prix;
    int nbPages;
    public Livre(String titre,String auteur,int anneePublication,double prix,int nbPages){
        this.titre = titre;
        this.auteur = auteur;
        this.anneePublication = anneePublication;
        this.prix = prix;
        this.nbPages = nbPages;
    }
    public String getTitre(){
        return titre;
    }
    public void setTitre(String titre){
        this.titre = titre;
    }
    public String getAuteur(){
        return auteur;
    }
    public void setAuteur(String auteur){
        this.auteur = auteur;
    }
    public int getAnneePublication(){
        return anneePublication;
    }
    public void setAnneePublication(int anneePublication){
        this.anneePublication =anneePublication;
    }
    public double getPrix(){
        return prix;
    }
    public void setPrix(double prix){
        this.prix = prix;
    }
    public int getNbPages(){
        return nbPages;
    }
    public void setNbPages(int nbPages){
        this.nbPages = nbPages;
    }
    // diminue le prix du livre selon le pourcentage
    public void appliquerRemise(double pourcentage){
        System.out.println("Pourcentage : "+pourcentage+"%");
        double PourcentageRemise = (pourcentage*prix)/100;
        double PrixRemise = prix-PourcentageRemise;
        System.out.println("le prix apres remise = "+PrixRemise); 
    }
    // retourne true si l'annee de publication est inferieure a 1980
    public boolean estAncien(){
        if(anneePublication<1980){
            return true;
        }else{
            return false;
        }
    }
    // retourne le rapport prix/nbPAGES (GERER LA DIVISION PAR ZERO)
    public double prixParPage(){
        if(prix != 0 && nbPages != 0){
            double PrixPage = prix/nbPages;
            return PrixPage;
        }
        else{
            return 0;
        }
    }
    public void affichage(){
        System.out.println("Titre = "+titre);
        System.out.println("Auteur = "+auteur);
        System.out.println("Annee = "+anneePublication);
        System.out.println("Prix = "+prix);
        System.out.println("Pages = "+nbPages);
    }
}
/*
 * Constructeur de copie
 * Constructeur par defaut
 * toString()
 */