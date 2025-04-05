abstract class Character {
    String name;
    int health;
    
    Character(String name, int health) {
        this.name = name;
        this.health = health;
    }
    
    abstract void attack();
    
    void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " took " + damage + " damage!");
    }
}

class Warrior extends Character {
    Warrior(String name) {
        super(name, 100);
    }
    
    @Override
    void attack() {
        System.out.println(name + " swings a sword!");
    }
}

class Mage extends Character {
    Mage(String name) {
        super(name, 80);
    }
    
    @Override
    void attack() {
        System.out.println(name + " casts a spell!");
    }
}

public class SimpleGame {
    public static void main(String[] args) {
        Character hero = new Warrior("Conan");
        Character enemy = new Mage("Dark Mage");
        
        hero.attack();  // "Conan swings a sword!"
        enemy.attack(); // "Dark Mage casts a spell!"
        
        hero.takeDamage(20);
        enemy.takeDamage(30);
    }
}