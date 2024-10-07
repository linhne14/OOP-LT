import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Animal {
    abstract boolean swim();
    abstract boolean walk();
}

class Pig extends Animal {
    boolean swim() {
        return false;
    }

    boolean walk() {
        return true;
    }

    public String toString() {
        return "Pig";
    }
}

class Duck extends Animal {
    boolean swim() {
        return true;
    }

    boolean walk() {
        return true;
    }

    public String toString() {
        return "Duck";
    }
}

class Fish extends Animal {
    boolean swim() {
        return true;
    }

    boolean walk() {
        return false;
    }

    public String toString() {
        return "Fish";
    }
}

public class Main {
    public static void AnimalsCanWalk(List<Animal> animals) {
        System.out.println("Animals that can walk:");
        for (Animal animal : animals) {
            if (animal.walk()) {
                System.out.println(animal);
            }
        }
    }

    public static void AnimalsCanSwim(List<Animal> animals) {
        System.out.println("Animals that can swim:");
        for (Animal animal : animals) {
            if (animal.swim()) {
                System.out.println(animal);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();

        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String type = scanner.nextLine().toLowerCase();

            if (type.equals("pig")) {
                animals.add(new Pig());
            } else if (type.equals("duck")) {
                animals.add(new Duck());
            } else if (type.equals("fish")) {
                animals.add(new Fish());
            } else {
                i--;
            }
        }

        AnimalsCanWalk(animals);
        AnimalsCanSwim(animals);
    }
}
