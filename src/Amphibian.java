public class Amphibian extends Coldblooded {
    public Amphibian(String name, int lifetime, String sound, String habitat, String skin, String breathing, boolean canSwim, boolean canFly, String feedingTime) {
        super(name, lifetime, sound, habitat, skin, breathing, canSwim, canFly, feedingTime);
    }

    @Override
    public void makeSound() {
        System.out.println(getSound());
    }
}