public class Mammal extends Warmblooded {
    public Mammal(String name, int lifetime, String sound, String habitat, String skin, String breathing) {
        super(name, lifetime, sound, habitat, skin, breathing);
    }

    @Override
    public void makeSound() {
        System.out.println(getSound());
    }
}