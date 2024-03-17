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
            System.out.println("Welcome to AnimalLexi! Choose a number from 1 to 4");
            System.out.println("[1] View All Animals");
            System.out.println("[2] Search Animals");
            System.out.println("[3] Sort Animals");
            System.out.println("[4] Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    //displayAnimals();
                    break;
                case 2:
                    //searchAnimals(scanner);
                    break;
                case 3:
                    //sortAnimals();
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
    private static void initializeAnimals() {
        animals.add(new Mammal("Lion", 14, "Roar", "Land", "Fur", "Lungs", false, false));
        animals.add(new Mammal("Whale", 66, "Iiii", "Water", "Skin", "Lungs",true, false));
        animals.add(new Bird("Eagle", 20, "Screech", "Air", "Feathers", "Lungs"));
        animals.add(new Fish("Salmon", 5, "Blub", "Water", "Scales", "Gills"));
        animals.add(new Reptile("Snake", 9, "Hiss", "Land", "Scales", "Lungs", true, false));
        animals.add(new Amphibian("Frog", 7, "Croak", "Water/Land", "Skin", "Lungs/Skin", true, false));
    }

}
