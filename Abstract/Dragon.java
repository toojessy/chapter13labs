// Dragon enemy subclass

// TODO: Extend Enemy

    public class Dragon extends Enemy {

    // TODO: Create constructor (call super)
    public Dragon (int health, int damage, String name) {
        super(health, damage, name);
    }

    // TODO: Implement update()
        @Override
        public void update() {
        System.out.println(name + "spreads its massive wings and watched the skies...");
        }

    // TODO: Implement attack()
        @Override
        public void attack() {
        System.out.println(name + " spits fire balls for " + damage + " damage!");
    }
}
