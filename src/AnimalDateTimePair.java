import java.time.LocalDateTime;

public class AnimalDateTimePair {
    // Attributes
    private Animal animal;
    private LocalDateTime feedingDateTime;

    // Constructor
    public AnimalDateTimePair(Animal animal, LocalDateTime feedingDateTime) {
        this.animal = animal;
        this.feedingDateTime = feedingDateTime;
    }

    // Getters
    public Animal getAnimal() {
        return animal;
    }

    public LocalDateTime getFeedingDateTime() {
        return feedingDateTime;
    }
}
