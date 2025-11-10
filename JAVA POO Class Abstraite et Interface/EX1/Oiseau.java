package EX1;
/*
class
‘Oiseau’ : hérite de ‘Animal’ et implémente ‘Volant’
*/
public class Oiseau extends animal implements Volant {
    public String nom;
    public Oiseau(){
        super();
        this.nom = "Null";
    }
    public Oiseau(String nom){
        super();
        this.nom = nom;
    }
    public Oiseau(Oiseau other){
        super();
        this.nom = other.nom;
    }
    @Override
    public void seDeplacer(){
        System.out.println("SE DEPLACER");
    }
    @Override
    public void voler(){
        System.out.println("VOLER");
    }
    
}
