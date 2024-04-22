// Subclass of Warmblooded which represents type of animal
public class Mammal extends Warmblooded {
    // Constructor
    public Mammal(String name, int lifetime, String sound, String habitat, String skin, String breathing, boolean canSwim, boolean canFly, String feedingtime, Zookeeper zookeeper) {
        super(name, lifetime, sound, habitat, skin, breathing, canSwim, canFly, feedingtime, zookeeper);
    }

    // Methods
    @Override
    public void makeSound() {
        System.out.println(getSound());
    }

    // Getters
    public boolean isMammal() {
        return true;
    }
}