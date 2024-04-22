// Superclass which represents an animal
public abstract class Animal {
    // Attributes
    private String name;
    private int lifetime; // Expected lifetime in years
    private String sound;
    private String habitat;
    private String skin;
    private String breathing;
    private boolean canSwim = false;
    private boolean canFly = false;
    private String feedingtime; // Format: "HH:MM"
    private Zookeeper zookeeper;

    // Constructor
    public Animal(String name, int lifetime, String sound, String habitat, String skin, String breathing, boolean canSwim, boolean canFly, String feedingtime, Zookeeper zookeeper) {
        this.name = name;
        this.lifetime = lifetime;
        this.sound = sound;
        this.habitat = habitat;
        this.skin = skin;
        this.breathing = breathing;
        this.canFly = canFly;
        this.canSwim = canSwim;
        this.feedingtime = feedingtime;
        this.zookeeper = zookeeper;
    }

    // Methods
    public abstract void makeSound();

    // Getters
    public String getName() {
        return name;
    }

    public int getLifetime() {
        return lifetime;
    }

    public String getSound() {
        return sound;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getSkin() {
        return skin;
    }

    public String getBreathing() {
        return breathing;
    }

    public boolean canFly() {
        return canFly;
    }

    public boolean canSwim() {
        return canSwim;
    }

    public boolean isMammal() {
        return false;
    }

    public boolean isBird() {
        return false;
    }

    public boolean isFish() {
        return false;
    }

    public boolean isReptile() {
        return false;
    }

    public boolean isAmphibian() {
        return false;
    }

    public abstract String getBloodType();

    // Gets the zookeeper that is assigned to the animal
    public Zookeeper getZookeeper() {
        return zookeeper;
    }

    public String getFeedingtime() {
        return feedingtime;
    }

    // Setters
    public void setFeedingtime(String feedingtime) {
        this.feedingtime = feedingtime;
    }
}
