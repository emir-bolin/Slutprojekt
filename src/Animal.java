public abstract class Animal {
    // Attributes
    private String name;
    private int lifetime;
    private String sound;
    private String habitat;
    private String skin;
    private String breathing;

    // Constructor
    public Animal(String name, int lifetime, String sound, String habitat, String skin, String breathing) {
        this.name = name;
        this.lifetime = lifetime;
        this.sound = sound;
        this.habitat = habitat;
        this.skin = skin;
        this.breathing = breathing;
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
}
