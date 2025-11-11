package EX3;
/*
Implémentez classe : 
   - ‘CarteBancaire’ (vérifie numéro de carte) 
*/
public class CarteBancaire  extends Paiement implements Verifiable{
    public CarteBancaire(double montant,boolean status){
        super(montant,status);
    }
    public void effectuerPaiment(){
        System.out.println("Paiment");
    }
    public void verifierIdentite(){
        System.out.println("Verifier");
    }
}
