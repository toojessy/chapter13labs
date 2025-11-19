// Skeleton enemy subclass

// TODO: Extend Enemy

    public class Skeleton extends Enemy {

    // TODO: Create constructor (call super)
        public Skeleton (int health, int damage, String name) {
            super(health, damage, name);
        }

    // TODO: Implement update()
        @Override
        public void update() {
            System.out.println(name + " rattles its bones...");
        }

    // TODO: Implement attack()
    @Override
    public void attack() {
        System.out.println(name + " fires an arrow " + damage + " damage!");
    }
}
