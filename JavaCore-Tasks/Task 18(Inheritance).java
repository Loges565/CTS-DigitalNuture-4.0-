import java.util.*;

class Animal {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Lion extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Roar");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Animal a = new Animal();
        Lion l = new Lion();

        a.makeSound();
        l.makeSound();
    }
}
