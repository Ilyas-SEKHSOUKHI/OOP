package EX2;

public class LampeIntelligente extends Appareil implements Connectable {
    public String nom;
    public LampeIntelligente(){
        super();
        this.nom = "NULL";
    }
    public LampeIntelligente(String nom){
        super();
        this.nom = nom;
    }
    public LampeIntelligente(LampeIntelligente other){
        super();
        this.nom = other.nom;
    }
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    @Override
    public void fonctionSpeciale(){
        System.out.println("");
    }
    @Override
    public void Connectable1(){
        System.out.println("");
    }
    @Override
    public void deconnecterWifi(){
        System.out.println("");
    }
}
