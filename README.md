* Why can’t you instantiate the Enemy class? *
What would happen if a subclass did not implement update() or attack()?
How does using Enemy[] demonstrate polymorphism?
Why is it helpful for Enemy to have a concrete method like takeDamage()?
Could this design be implemented using interfaces alone? Why or why not?

1: An abstract class cannot be instantiated because it is considered incomplete; it has methods (pure virtual functions) that lack an implementation in the base class. The compiler prevents creating an object of this type because there is no concrete, executable code for all of its functions.
2: If a subclass inherits from Enemy but fails to provide implementations for all of its pure virtual functions (e.g., update() or attack()), that subclass also becomes an abstract class. Consequently, you would not be able to instantiate the subclass either. The compiler would produce an error if you tried to create an object of that subclass.
3: In C++ (and most object-oriented languages), polymorphism with a base class requires using pointers or references. Storing objects of different derived types in an array of base class pointers (e.g., Enemy* enemies[] or std::vector<Enemy*> enemies) allows for runtime polymorphism.
4: It is helpful for the base Enemy class to provide a concrete, non-pure virtual function like takeDamage() to define a common, shared behavior for all derived enemies. All enemies generally take damage the same way (e.g., reducing a health variable). This prevents code duplication in every subclass. Subclasses can use the base implementation, or they can optionally override it for specific behavior (e.g., a "ninja" enemy might have a chance to dodge in its overridden takeDamage() method).
5:
