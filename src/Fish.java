public class Fish extends Coldblooded {
    public Fish(String name, int lifetime, String sound, String habitat, String skin, String breathing, String feedingtime, Zookeeper zookeeper) {
        super(name, lifetime, sound, habitat, skin, breathing, true, false, feedingtime, zookeeper); // Fish are automatically set to canSwim = true
    }
    @Override
    public void makeSound() {
        System.out.println(getSound());
    }

    public boolean isFish(){
        return true;
    }
}