public class Amphibian extends Coldblooded {
    public Amphibian(String name, int lifetime, String sound, String habitat, String skin, String breathing, boolean canSwim, boolean canFly, String feedingtime, Zookeeper zookeeper) {
        super(name, lifetime, sound, habitat, skin, breathing, canSwim, canFly, feedingtime, zookeeper);
    }

    @Override
    public void makeSound() {
        System.out.println(getSound());
    }

    public boolean isAmphibian(){
        return true;
    }
}