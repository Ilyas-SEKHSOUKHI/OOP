package JAVA.Seance_Sept;

public class Chien extends Animal implements Nageur {
    String nom;
    int age;
    public Chien(){
        super();
        this.nom = "Null";
        this.age = 0;
    }
    public Chien(String nom,int age){
        super();
        this.nom = "Null";
        this.age = 0;
    }
    public Chien(Chien other){
        super();
        this.name = other.name;
    }
    @Override
    public void describe(){
        System.out.println("Fidèle compagnon, protecteur et plein d’énergie.");
    }
    public void nager(){
        System.out.println("Nager");
    }
    public void plonger(){
        System.out.println("Plonger");
    }
}
