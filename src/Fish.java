// Subclass of Coldblooded which represents type of animal
public class Fish extends Coldblooded {
    // Constructor
    public Fish(String name, int lifetime, String sound, String habitat, String skin, String breathing, String feedingtime, Zookeeper zookeeper) {
        super(name, lifetime, sound, habitat, skin, breathing, true, false, feedingtime, zookeeper); // Fish are automatically set to canSwim = true
    }

    // Methods
    @Override
    public void makeSound() {
        System.out.println(getSound());
    }

    // Getters
    public boolean isFish() {
        return true;
    }
}