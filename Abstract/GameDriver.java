// Driver for the Enemy inheritance lab

public class GameDriver {

    public static void main(String[] args) {

        // TODO: Add this commented line to show that Enemy cannot be instantiated:
        // Enemy e = new Enemy();

        // TODO: Create an Enemy[] array with:
        // new Slime(...)
        // new Skeleton(...)
        // new Dragon(...)
        Enemy[] enemies = {
                new Slime(20, 5, "Green Slime"),
                new Skeleton(30, 7, "Bone Warrior"),
                new Dragon(100, 20, "Fire Dragon")
        };

        // TODO: Loop through the array and call:
        // update(), attack(), takeDamage()
        for (Enemy enemy : enemies) {
            enemy.update();
            enemy.attack();
            enemy.takeDamage( 10);
        }

        // TODO: Add reflection answers as comments at the bottom of this file
// in README

    }
} 
