package EX3;

public class CompteBancaire { // Class
    String titulaire;
    double soldes;
    public CompteBancaire(String titulaire,double soldes){ // Constructer
        this.titulaire = titulaire;
        this.soldes = soldes;
    } 
    public String getTitulaire(){
        return titulaire;
    }
    public void setTitulaire(String titulaire){
        this.titulaire = titulaire;
    }
    public double getSoldes(){
        return soldes;
    }
    public void setSoldes(double soldes){
        this.soldes = soldes;
    }
    public double Deposer(double A){
        double Totale = A+soldes;
        return Totale;
        
    }
    public double Retirer(double B){
        double Totale = soldes-B;
        return Totale;
    }
    public double AppliquerFrais(double Frais){
        double A = (Frais*soldes)/100;
        double Totale = soldes-A;
        return Totale;
    }
    public double AppliquerInterets(double Interets){
        double A = (Interets*soldes)/100;
        double Totale = soldes+A;
        return Totale;
    }
    public void Affichage(CompteBancaire A){
        System.out.println("Titulaire = "+A.getTitulaire());
        System.out.println("Soldes = "+A.getSoldes());
        System.out.println("Deposer = "+A.Deposer(500));
        System.out.println("Retirer = "+A.Retirer(200));
        System.out.println("Appliquer Frais = "+A.AppliquerFrais(20));
        System.out.println("Appliquer Interets = "+A.AppliquerInterets(20));
    }
    @Override
    public String toString(){
        return(
            "Titulaire"+this.titulaire+
            "solde"+this.soldes
        );
    }

}
