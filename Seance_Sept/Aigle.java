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
        System.out.println("Oiseau majestueux au regard perçant, symbole de puissance et de liberté.");
    }
    public void voler(){
        System.out.println("Voler");
    }
    public void atterrir(){
        System.out.println("Atterrir");
    }
}
