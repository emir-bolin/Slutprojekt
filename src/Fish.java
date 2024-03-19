public class Fish extends Coldblooded {
    public Fish(String name, int lifetime, String sound, String habitat, String skin, String breathing, String feedingTime) {
        super(name, lifetime, sound, habitat, skin, breathing, true, false, feedingTime); // Fish are automatically set to canSwim = true
    }
    @Override
    public void makeSound() {
        System.out.println(getSound());
    }
}