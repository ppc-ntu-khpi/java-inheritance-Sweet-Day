package domain;

public class Puma extends Predator {

    private String kind;

    public Puma(String name, int weight, int age, String kind) {
        this.name=name;
        this.weight=weight;
        this.age=age;
        this.kind=kind;
    }

    public Puma() {
        this("Semen",50,3,"Florida");
    }

    public Puma(String name) {
        this(name,50,3, "Florida");
    }

    
    
    public void play() {
        System.out.println("Puma is playing...");
    }

    @Override
    public void hunt() {
        System.out.println("Puma is hunting for an opossum...");
    }

    @Override
    public String toString() {
        return super.toString()+"\nKind:\t"+this.kind+"\n\nThis is puma"; 
    } 
    
    @Override
    public void speak() {
         System.out.println("r-r-r-r");
    }

    @Override
    public void eat() {
        System.out.println("Puma eats meat");
    }
    
    
    
}
