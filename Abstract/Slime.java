// Slime enemy subclass

// TODO: Extend Enemy
    public class Slime extends Enemy {

        // TODO: Create constructor
        // Must call super(...)
     public Slime (int health, int damage, String name) {
         super(health, damage, name);
     }

        // TODO: Implement update()
     @Override
     public void update() {
         System.out.println(name + " bounces around menacingly...");
     }

        // TODO: Implement attack()
     @Override
     public void attack() {
         System.out.println(name + " splats at the player for " + damage + " damage!");
     }
    }

