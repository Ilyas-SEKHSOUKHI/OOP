package EX1;

public class Canard extends animal implements Volant , Nageur  {
    public String nom;
    public Canard(){
        super();
        this.nom = "Null";
    }
    public Canard(String nom){
        super();
        this.nom = nom;
    }
    public Canard(Canard other){
        super();
        this.nom = other.nom;
    }
    @Override
    public void seDeplacer(){
        System.out.println("");
    }
    @Override
    public void voler(){
        System.out.println("");
    }
    @Override
    public void nager(){
        System.out.println("");
    }
}
