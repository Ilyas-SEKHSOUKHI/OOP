package JAVA.Seance_Sept;

public class Aigle extends Animal implements Volant {
    String nom;
    int age;
    public Aigle(){
        super();
        this.nom = "Null";
        this.age = 0;
    }
    public Aigle(String nom,int age){
        super();
        this.nom = nom;
        this.age = age;
    }
    public Aigle(Aigle other){
        super();
        this.nom = other.nom;
        this.age = other.age;
    }
    public void describe(){

    }
    public void voler(){

    }
    public void atterrir(){
        
    }
}
