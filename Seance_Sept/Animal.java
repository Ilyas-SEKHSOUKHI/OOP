package JAVA.Seance_Sept;

public abstract class Animal {
    String name;
    int age;
    public Animal(){
        this.name = "Null";
        this.age = 0;
    }
    public Animal(String name,int age){
        this.name = name;
        this.age = age;
    }
    public Animal(Animal other){
        this.name = other.name;
        this.age = other.age;
    }
    public abstract void describe();
}
