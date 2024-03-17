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
    // Constructor
    public Animal(String name, int lifetime, String sound, String habitat, String skin, String breathing, boolean canSwim, boolean canFly) {
        this.name = name;
        this.lifetime = lifetime;
        this.sound = sound;
        this.habitat = habitat;
        this.skin = skin;
        this.breathing = breathing;
        this.canFly =canFly;
        this.canSwim = canSwim;
    }

    // Methods
    public abstract void makeSound();

    // Getters
    public String getName() { return name; }
    public int getLifetime() { return lifetime; }
    public String getSound() { return sound; }
    public String getHabitat() { return habitat; }
    public String getSkin() { return skin; }
    public String getBreathing() { return breathing; }

    public boolean isCanFly() { return canFly;    }

    public boolean isCanSwim() { return canSwim;    }

    // Implement in every subclass
    public abstract String getBloodType();
}
