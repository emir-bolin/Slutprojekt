// Subclass of Animal which represents blood type
public abstract class Coldblooded extends Animal {
    // Constructor
    public Coldblooded(String name, int lifetime, String sound, String habitat, String skin, String breathing, boolean canSwim, boolean canFly, String feedingtime, Zookeeper zookeeper) {
        super(name, lifetime, sound, habitat, skin, breathing, canSwim, canFly, feedingtime, zookeeper);
    }

    // Getters
    public String getBloodType() {
        return "Coldblooded";
    }
}