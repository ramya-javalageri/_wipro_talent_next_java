

// Abstract class
abstract class Animal {
    // Abstract method (no body)
    abstract void sound();

    // Normal method
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass Dog
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks: Woof! Woof!");
    }
}

// Subclass Cat
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows: Meow! Meow!");
    }
}

class Lion extends Animal{
    void sound(){
        System.out.println("the tiger: rowr ");
    }
}



// Main class
public class AbstractionExample {
    public static void main(String[] args) {
        // We cannot create Animal obj because it's abstract
        Animal dog = new Dog(); // upcasting
        dog.sound(); // calls Dog's implementation
        dog.eat();   // calls Animal's normal method

        Animal cat = new Cat();
        cat.sound();
        cat.eat();
    }
}