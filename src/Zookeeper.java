import java.util.ArrayList;
import java.util.List;

public class Zookeeper {
    private String name;
    private List<Animal> assignedAnimals;

    public Zookeeper(String name) {
        this.name = name;
        this.assignedAnimals = new ArrayList<>();
    }

    public void assignAnimal(Animal animal) {
        this.assignedAnimals.add(animal);
    }

    public List<Animal> getAssignedAnimals() {
        return assignedAnimals;
    }

    public String getName() {
        return name;
    }
}