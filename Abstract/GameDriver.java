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

        // 1: An abstract class cannot be instantiated because it is considered incomplete; it has methods (pure virtual functions) that lack an implementation in the base class. The compiler prevents creating an object of this type because there is no concrete, executable code for all of its functions.
        // 2: If a subclass inherits from Enemy but fails to provide implementations for all of its pure virtual functions (e.g., update() or attack()), that subclass also becomes an abstract class. Consequently, you would not be able to instantiate the subclass either. The compiler would produce an error if you tried to create an object of that subclass.
        // 3: In C++ (and most object-oriented languages), polymorphism with a base class requires using pointers or references. Storing objects of different derived types in an array of base class pointers (e.g., Enemy* enemies[] or std::vector<Enemy*> enemies) allows for runtime polymorphism.
        // 4: It is helpful for the base Enemy class to provide a concrete, non-pure virtual function like takeDamage() to define a common, shared behavior for all derived enemies. All enemies generally take damage the same way (e.g., reducing a health variable). This prevents code duplication in every subclass. Subclasses can use the base implementation, or they can optionally override it for specific behavior (e.g., a "ninja" enemy might have a chance to dodge in its overridden takeDamage() method).
        // 5: In C++, an "interface" is essentially a class composed entirely of pure virtual functions. A design like this cannot be implemented using only a C++ interface if the goal is to have shared, concrete functionality.

    }
} 
