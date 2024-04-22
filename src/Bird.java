// Subclass of Warmblooded which represents type of animal
public class Bird extends Warmblooded {
    // Constructor
    public Bird(String name, int lifetime, String sound, String habitat, String skin, String breathing, String feedingtime, Zookeeper zookeeper) {
        super(name, lifetime, sound, habitat, skin, breathing, false, true, feedingtime, zookeeper); // Birds are automatically set to canFly = true
    }

    // Methods
    @Override
    public void makeSound() {
        System.out.println(getSound());
    }

    // Getters
    public boolean isBird() {
        return true;
    }
}