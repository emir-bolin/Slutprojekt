import java.time.LocalDateTime;

public class AnimalDateTimePair {
    private Animal animal;
    private LocalDateTime feedingDateTime;

    public AnimalDateTimePair(Animal animal, LocalDateTime feedingDateTime) {
        this.animal = animal;
        this.feedingDateTime = feedingDateTime;
    }

    public Animal getAnimal() {
        return animal;
    }

    public LocalDateTime getFeedingDateTime() {
        return feedingDateTime;
    }
}
