public class Bird extends Warmblooded {
    public Bird (String name, int lifetime, String sound, String habitat, String skin, String breathing) {
        super(name, lifetime, sound, habitat, skin, breathing, false, true);
    }

    @Override
    public void makeSound() {
        System.out.println(getSound());
    }
}