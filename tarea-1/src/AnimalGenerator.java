abstract class Animal {
    private String name;
    private double heightInMeters;
    private int age;
    private int numberOfLegs;
    private boolean hasPreFrontalCortex;

    public Animal(String name, double heightInMeters, int age, int numberOfLegs, boolean hasPreFrontalCortex) {
        this.name = name;
        this.heightInMeters = heightInMeters;
        this.age = age;
        this.numberOfLegs = numberOfLegs;
        this.hasPreFrontalCortex = hasPreFrontalCortex;

    }

    public String eat() {
        return "The animal " + name + " eats " + food() + ".";
    }

    public abstract String food();
}


class Human extends Animal {

    public Human(String name, double heightInMeters, int age, int numberOfLegs, boolean hasPreFrontalCortex) {
        super(name, heightInMeters, age, numberOfLegs, hasPreFrontalCortex);
    }

    @Override
    public String food() {
        return "chicken strips";
    }


}

class Dog extends Animal {

    public Dog(String name, double heightInMeters, int age, int numberOfLegs, boolean hasPreFrontalCortex) {
        super(name, heightInMeters, age, numberOfLegs, hasPreFrontalCortex);
    }

    @Override
    public String food() {
        return "raw meat";
    }
}

class Bird extends Animal {
    public Bird(String name, double heightInMeters, int age, int numberOfLegs, boolean hasPreFrontalCortex) {
        super(name, heightInMeters, age, numberOfLegs, hasPreFrontalCortex);
    }

    @Override
    public String food() {
        return "seeds";
    }
}

public class AnimalGenerator {
    public static void main(String[] args) {
        Animal human1 = new Human("Marcus", 1.80, 20, 2, true);
        System.out.println(human1.eat());
        Animal dog1 = new Dog("Spike", 0.5, 3, 4, false);
        System.out.println(dog1.eat());
        Animal bird1 = new Bird("Pericles", 0.1, 1, 2, false);
        System.out.println(bird1.eat());
    }
}




