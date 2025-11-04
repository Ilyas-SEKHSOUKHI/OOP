package JAVA.Seance_Sept;

public class Poisson extends Animal implements Nageur{
    String PoissonNom;
    int age;
    public Poisson(){
        super();
        this.PoissonNom = "Null";
        this.age = 0;
    }
    public Poisson(String PoissonNom,int age){
        super();
        this.PoissonNom = PoissonNom;
        this.age = age;
    }
    public Poisson(Poisson other){
        super();
        this.PoissonNom = other.PoissonNom;
        this.age = other.age;
    }
    @Override
    public void nager(){

    }
    @Override
    public void plonger(){

    }
    @Override
    public void describe(){
        
    }

}
