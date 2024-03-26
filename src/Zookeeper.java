import java.util.ArrayList;

public class Zookeeper {
    private String name;
    private ArrayList<Animal> assignedAnimals;

    public Zookeeper(String name) {
        this.name = name;
        this.assignedAnimals = new ArrayList<>();
    }

    public void assignAnimal(Animal animal) {
        this.assignedAnimals.add(animal);
    }

    public ArrayList<Animal> getAssignedAnimals() {
        return assignedAnimals;
    }

    public String getName() {
        return name;
    }
}