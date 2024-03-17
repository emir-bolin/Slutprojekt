import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class AnimalLexiInterface {
    // Attributes
    private static List<Animal> animals = new ArrayList<>();

    // Constructor
    public AnimalLexiInterface() {
        initializeAnimals();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nWelcome to AnimalLexi! Choose a number from 1 to 4");
            System.out.println("[1] View All Animals");
            System.out.println("[2] Search Animals");
            System.out.println("[3] Sort Animals");
            System.out.println("[4] Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    displayAnimals(animals);
                    break;
                case 2:
                    //searchAnimals(scanner);
                    break;
                case 3:
                    sortAnimals();
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting AnimalLexi. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }

    // Methods
    private static void initializeAnimals() { // Todo: go through the animals
        // Mammals
        animals.add(new Mammal("Lion", 14, "Roar", "Land", "Fur", "Lungs", false, false));
        animals.add(new Mammal("Tiger", 12, "Roar", "Land", "Fur", "Lungs", false, false));
        animals.add(new Mammal("Elephant", 70, "Trumpet", "Land", "Skin", "Lungs", false, false));
        animals.add(new Mammal("Rhinoceros", 40, "Grunt", "Land", "Skin", "Lungs", false, false));
        animals.add(new Mammal("Giraffe", 25, "Hum", "Land", "Fur", "Lungs", false, false));
        animals.add(new Mammal("Zebra", 20, "Whinny", "Land", "Fur", "Lungs", false, false));
        animals.add(new Mammal("Kangaroo", 23, "Grunt", "Land", "Fur", "Lungs", false, false));
        animals.add(new Mammal("Panda", 20, "Bleat", "Land", "Fur", "Lungs", false, false));
        animals.add(new Mammal("Wolf", 16, "Howl", "Land", "Fur", "Lungs", false, false));
        animals.add(new Mammal("Fox", 14, "Bark", "Land", "Fur", "Lungs", false, false));

            // Birds
        animals.add(new Bird("Eagle", 20, "Screech", "Air", "Feathers", "Lungs"));
        animals.add(new Bird("Parrot", 50, "Talk", "Air", "Feathers", "Lungs"));
        animals.add(new Bird("Owl", 25, "Hoot", "Air", "Feathers", "Lungs"));
        animals.add(new Bird("Penguin", 20, "Honk", "Land/Water", "Feathers", "Lungs"));
        animals.add(new Bird("Flamingo", 30, "Squawk", "Land/Water", "Feathers", "Lungs"));
        animals.add(new Bird("Swan", 24, "Hiss", "Water", "Feathers", "Lungs"));
        animals.add(new Bird("Peacock", 20, "Call", "Land", "Feathers", "Lungs"));
        animals.add(new Bird("Hummingbird", 5, "Chirp", "Air", "Feathers", "Lungs"));
        animals.add(new Bird("Crow", 14, "Caw", "Air", "Feathers", "Lungs"));
        animals.add(new Bird("Sparrow", 3, "Tweet", "Air", "Feathers", "Lungs"));

        // Fish
        animals.add(new Fish("Salmon", 5, "Blub", "Water", "Scales", "Gills"));
        animals.add(new Fish("Clownfish", 10, "Silent", "Water", "Scales", "Gills"));
        animals.add(new Fish("Shark", 30, "Silent", "Water", "Scales", "Gills"));
        animals.add(new Fish("Tuna", 20, "Silent", "Water", "Scales", "Gills"));
        animals.add(new Fish("Goldfish", 10, "Silent", "Water", "Scales", "Gills"));
        animals.add(new Fish("Betta", 3, "Silent", "Water", "Scales", "Gills"));
        animals.add(new Fish("Carp", 20, "Silent", "Water", "Scales", "Gills"));
        animals.add(new Fish("Catfish", 15, "Silent", "Water", "Scales", "Gills"));
        animals.add(new Fish("Guppy", 2, "Silent", "Water", "Scales", "Gills"));
        animals.add(new Fish("Manta Ray", 20, "Silent", "Water", "Scales", "Gills"));

        // Reptiles
        animals.add(new Reptile("Crocodile", 70, "Growl", "Water/Land", "Scales", "Lungs", true, false));
        animals.add(new Reptile("Snake", 9, "Hiss", "Land", "Scales", "Lungs", false, false));
        animals.add(new Reptile("Turtle", 100, "Silent", "Water/Land", "Scales", "Lungs", true, false));
        animals.add(new Reptile("Lizard", 10, "Silent", "Land", "Scales", "Lungs", false, false));
        animals.add(new Reptile("Chameleon", 5, "Silent", "Land", "Scales", "Lungs", false, false));
        animals.add(new Reptile("Iguana", 12, "Silent", "Land", "Scales", "Lungs", false, false));
        animals.add(new Reptile("Gecko", 6, "Silent", "Land", "Scales", "Lungs", false, false));
        animals.add(new Reptile("Komodo Dragon", 30, "Hiss", "Land", "Scales", "Lungs", false, false));
        animals.add(new Reptile("Alligator", 50, "Growl", "Water/Land", "Scales", "Lungs", true, false));
        animals.add(new Reptile("Anaconda", 10, "Hiss", "Water", "Scales", "Lungs", true, false));

        // Amphibians
        animals.add(new Amphibian("Frog", 7, "Croak", "Water/Land", "Skin", "Lungs/Skin", true, false));
        animals.add(new Amphibian("Toad", 5, "Croak", "Land", "Skin", "Lungs/Skin", false, false));
        animals.add(new Amphibian("Salamander", 6, "Silent", "Water/Land", "Skin", "Lungs/Skin", true, false));
        animals.add(new Amphibian("Newt", 5, "Silent", "Water", "Skin", "Lungs/Skin", true, false));
        animals.add(new Amphibian("Axolotl", 10, "Silent", "Water", "Skin", "Gills", true, false));
        animals.add(new Amphibian("Tree Frog", 5, "Croak", "Land", "Skin", "Lungs/Skin", false, true));
        animals.add(new Amphibian("Bullfrog", 8, "Deep Croak", "Water/Land", "Skin", "Lungs/Skin", true, false));
        animals.add(new Amphibian("Red-Eyed Tree Frog", 5, "Croak", "Trees", "Skin", "Lungs/Skin", false, true));
        animals.add(new Amphibian("Poison Dart Frog", 7, "Silent", "Land", "Skin", "Lungs/Skin", false, false));
        animals.add(new Amphibian("Common Toad", 12, "Croak", "Land", "Skin", "Lungs/Skin", false, false));

    }
    private static void displayAnimals(List<Animal> animals) {
        System.out.println("All Animals:");
        for (Animal animal : animals) {
            System.out.println(animal.getName() + ", Type: " + animal.getClass().getSimpleName() +
                    ", Habitat: " + animal.getHabitat() + ", Lifetime: " + animal.getLifetime() + " years, Blood-type: "+animal.getBloodType()); // Todo: displayAnimal(animal)
        }
    }

    private static void sortAnimals(){
        List<Animal> lifetimeArrayList = animals;
        int n = lifetimeArrayList.size();

        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (lifetimeArrayList.get(j).getLifetime() > lifetimeArrayList.get(j + 1).getLifetime()){
                    Animal temporaryAnimal = lifetimeArrayList.get(j);
                    lifetimeArrayList.set(j, lifetimeArrayList.get(j + 1));
                    lifetimeArrayList.set(j + 1, temporaryAnimal);
                }
            }
        }
        displayAnimals(lifetimeArrayList); // Todo: make it possible to invert arraylist
    }
}
