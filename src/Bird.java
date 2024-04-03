public class Bird extends Warmblooded {
    public Bird (String name, int lifetime, String sound, String habitat, String skin, String breathing, String feedingtime, Zookeeper zookeeper) {
        super(name, lifetime, sound, habitat, skin, breathing, false, true, feedingtime, zookeeper); // Birds are automatically set to canFly = true
    }

    @Override
    public void makeSound() {
        System.out.println(getSound());
    }
}