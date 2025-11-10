package EX2;

public class AspirateurRobot extends Appareil implements Connectable {
    public String nom;
    public AspirateurRobot(){
        super();
        this.nom = "Null";
    }
    public AspirateurRobot(String nom){
        super();
        this.nom = nom;
    }
    public AspirateurRobot(AspirateurRobot other){
        super();
        this.nom = other.nom;
    }
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom=nom;
    }
    @Override
    public void fonctionSpeciale(){
        System.out.println("");
    }
    @Override
    public void Connectable(){
        System.out.println("");
    }
    @Override
    public void deconnecterWifi(){
        System.out.println("");
    }
}
