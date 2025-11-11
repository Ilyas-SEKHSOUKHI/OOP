package EX3;
/*
1. Créez une classe abstraite ‘Paiement’ avec : 
   - un attribut ‘montant’ 
   - un attribut ‘statut’ (succès ou échec) 
   - une méthode abstraite ‘effectuerPaiement()’  
*/
public abstract class Paiement {
    public double montant;
    public boolean status;
    public Paiement(){
        this.montant = 0.0;
        this.status = false;
    }
    public Paiement(double montant,boolean status){
        this.montant = montant;
        this.status = status;
    }
    public Paiement(Paiement other){
        this.montant = other.montant;
        this.status = other.status;
    }
    public abstract void effectuerPaiment();
}
