package EX1;
/*
 * 1. Créez une classe abstraite ‘Animal’ contenant : 
   - un attribut ‘nom’ (String) 
   - un constructeur 
   - une méthode concrète ‘manger()’ qui affiche un message 
   - une méthode abstraite ‘seDeplacer()
 */
public abstract class animal{
    public String nom;
    public animal(){
        this.nom = "NULL";
    }
    public animal(String nom){
        this.nom = nom;
    }
    public animal(animal other){
        this.nom = other.nom;
    }
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public void manger(){
        System.out.println("Message");
    }
    public abstract void seDeplacer();
}