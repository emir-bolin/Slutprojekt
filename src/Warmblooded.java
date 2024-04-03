public abstract class Warmblooded extends Animal {

    // Constructor
    public Warmblooded(String name, int lifetime, String sound, String habitat, String skin, String breathing, boolean canSwim, boolean canFly, String feedingtime, Zookeeper zookeeper) {
        super(name, lifetime, sound, habitat, skin, breathing, canSwim, canFly, feedingtime, zookeeper);
    }

    // Methods
    public boolean isWarmblooded(){
        return true;
    }

    // Getters
    public String getBloodType(){
        return "Warmblooded";
    }
}