package EX1;
/*
class
Poisson’ : hérite de ‘Animal’ et implémente ‘Nageur’  
*/
public class Poisson extends animal implements Nageur {
    public String nom;
    public Poisson(){
        super();
        this.nom = "Null";
    }
    public Poisson(String nom){
        super();
        this.nom = nom;
    }
    public Poisson(Poisson other){
        super();
        this.nom = other.nom;
    }
    @Override
    public void nager(){
        System.out.println("");
    }
    @Override
    public void seDeplacer(){
        System.out.println("");
    }
}
