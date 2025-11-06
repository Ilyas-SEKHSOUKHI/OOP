package JAVA.Seance_Sept;

public class Chat extends Animal{
    String nom;
    int age;
    public Chat(){
        super();
        this.nom = "Null";
        this.age = 0;
    }
    public Chat(String nom,int age){
        super();
        this.nom = nom;
        this.age = age;
    }
    public Chat(Chat other){
        super();
        this.nom = other.nom;
        this.age = other.age;
    } 
    @Override
    public void describe(){
        System.out.println("Animal agile et indépendant, curieux et souvent affectueux.");
    }
}
