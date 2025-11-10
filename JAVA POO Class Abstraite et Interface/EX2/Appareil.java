package EX2;
/*
1. Créez une classe abstraite ‘Appareil’ avec : 
   - un attribut ‘nom’ 
   - une méthode ‘allumer()’ 
   - une méthode ‘eteindre()’ 
   - une méthode abstraite ‘fonctionSpeciale()’ 
*/
public abstract class Appareil {
    public String nom;
    public Appareil(){
        this.nom = "Null";
    }
    public Appareil(String nom){
        this.nom = nom;
    }
    public Appareil(Appareil other){
        this.nom = other.nom;
    }
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public void allumer(){
        System.out.println("Allumer");
    }
    public void eteindre(){
        System.out.println("eteindre");
    }
    public abstract void fonctionSpeciale();
}
