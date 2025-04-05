import java.util.Scanner;

public class AnimalSystem {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.getName();
        dog.getGestationPeriod();
        dog.getBreed();
    }
}

class Animal {
    String name;
    void getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter animal name: ");
        name = scanner.nextLine();
    }
}

class Diet {
    String dietType;
    void getDietType() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter diet type: ");
        dietType = scanner.nextLine();
    }
}

class Mammal extends Animal {
    int gestationPeriod;
    void getGestationPeriod() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter gestation period (days): ");
        gestationPeriod = scanner.nextInt();
    }
}

class Dog extends Mammal {
    String breed;
    void getBreed() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dog breed: ");
        breed = scanner.nextLine();
    }
}