package EX3;

public class PortefeuilleElectronique extends Paiement implements Verifiable {
    public PortefeuilleElectronique(){
        super();
    }
    public void effectuerPaiment(){
        System.out.println("Paiment");
    }
    public void verifierIdentite(){
        System.out.println("Verifier");
    }
}
