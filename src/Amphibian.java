public class Amphibian extends Coldblooded {
    public Amphibian(String name, int lifetime, String sound, String habitat, String skin, String breathing) {
        super(name, lifetime, sound, habitat, skin, breathing);
    }

    @Override
    public void makeSound() {
        System.out.println(getSound());
    }
}