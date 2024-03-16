public abstract class Coldblooded extends Animal {
    // Constructor
    public Coldblooded(String name, int lifetime, String sound, String habitat, String skin, String breathing, boolean canSwim, boolean canFly) {
        super(name, lifetime, sound, habitat, skin, breathing, canSwim, canFly);
    }

    // Methods
    public boolean isWarmblooded(){
        return false;
    }

    // Getters
    public String getBloodType(){
        return "Coldblooded";
    }
}