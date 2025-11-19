// Lab: Abstract Enemies
// TODO: Declare this class as abstract

abstract public class Enemy {

    // TODO: Add protected instance variables:
    // health, damage, name
    protected int health;
    protected int damage;
    protected String name;

    // TODO: Create a constructor that initializes all fields
    public Enemy (int health, int damage, String name) {
        this.health = health;
        this.damage = damage;
        this.name = name;
    }

    // TODO: Declare abstract methods:
    public abstract void update();
    public abstract void attack();

    // TODO: Create a concrete takeDamage(int amount) method
    public void takeDamage(int amount) {
        health -= amount;
        System.out.println(name + "takes " + amount + " damage!");

        if (health <= 0) {
            System.out.println(name + " has been defeated.");
        }
    }
    // TODO: Add a getName() method
    public String getName() {
        return name;
    }
}
