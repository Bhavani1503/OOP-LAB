import java.util.Scanner;

public class DeviceSystem {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.getBrand();
        laptop.getRAM();
        laptop.getWeight();
    }
}

class Device {
    String brand;
    void getBrand() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter device brand: ");
        brand = scanner.nextLine();
    }
}

class Processor {
    String type;
    void getType() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter processor type: ");
        type = scanner.nextLine();
    }
}

class Computer extends Device {
    int ram;
    void getRAM() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter RAM size (GB): ");
        ram = scanner.nextInt();
    }
}

class Laptop extends Computer {
    double weight;
    void getWeight() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter laptop weight (kg): ");
        weight = scanner.nextDouble();
    }
}