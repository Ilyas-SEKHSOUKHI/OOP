package EX3;

public class main {
    public static void main(String[] args) {
        CarteBancaire A = new CarteBancaire(1000.0,true);
        A.effectuerPaiment();
        A.verifierIdentite();
    }
}
