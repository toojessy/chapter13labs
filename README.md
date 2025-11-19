Jessica Kamienski
11/19/15

## **Why can’t you instantiate the Enemy class?**
   * Because Enemy is likely an abstract class, which can’t be instantiated directly—only its subclasses can be.
## **What would happen if a subclass did not implement update() or attack()?**
   * If the subclass doesn’t implement them and they are abstract methods, the subclass must also be declared abstract; otherwise, the code won’t compile.
## **How does using Enemy[] demonstrate polymorphism?**
   * Using Enemy[] demonstrates polymorphism because the array can hold different subclasses (Slime, Skeleton, Dragon) and you can call the same methods (update(), attack(), takeDamage()) on all of them, letting each subclass handle the behavior its own way.
## **Why is it helpful for Enemy to have a concrete method like takeDamage()?**
   * It’s helpful because all subclasses share the same damage logic, so you don’t have to rewrite it in every subclass—promotes code reuse and consistency.
## **Could this design be implemented using interfaces alone? Why or why not?**
   * Not fully. Interfaces could define update() and attack(), but they can’t hold shared state like health, damage, and name or provide the concrete takeDamage() method. An abstract class is needed for shared fields and behavior.
