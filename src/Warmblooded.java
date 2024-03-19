public abstract class Warmblooded extends Animal {

    // Constructor
    public Warmblooded(String name, int lifetime, String sound, String habitat, String skin, String breathing, boolean canSwim, boolean canFly, String feedingTime) {
        super(name, lifetime, sound, habitat, skin, breathing, canSwim, canFly, feedingTime);
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