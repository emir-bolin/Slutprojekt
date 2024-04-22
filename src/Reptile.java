// Subclass of Coldblooded which represents type of animal
public class Reptile extends Coldblooded {
    // Constructor
    public Reptile(String name, int lifetime, String sound, String habitat, String skin, String breathing, boolean canSwim, boolean canFly, String feedingtime, Zookeeper zookeeper) {
        super(name, lifetime, sound, habitat, skin, breathing, canSwim, canFly, feedingtime, zookeeper);
    }

    // Methods
    @Override
    public void makeSound() {
        System.out.println(getSound());
    }

    // Getters
    public boolean isReptile() {
        return true;
    }
}
