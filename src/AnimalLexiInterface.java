import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Collections;

public class AnimalLexiInterface {
    // Attributes
    private static ArrayList<Animal> animals = new ArrayList<>();
    private static ArrayList<Zookeeper> zookeepers = new ArrayList<>();
    private static Zookeeper loggedInZookeeper;

    // Constructor
    public AnimalLexiInterface() {
        initializeZookeepers();
        initializeAnimals();
        logInMenu();
    }

    // Methods
    private static void initializeZookeepers(){
        zookeepers.add(new Zookeeper("Emir", "123"));
        zookeepers.add(new Zookeeper("Liv", "123"));
        zookeepers.add(new Zookeeper("Yusuf", "123"));
        zookeepers.add(new Zookeeper("Lukas", "123"));
        zookeepers.add(new Zookeeper("Arda", "123"));
        zookeepers.add(new Zookeeper("Empty", "123"));

    }
    private static void initializeAnimals() { // Todo: go through the animals
        // Mammals
        animals.add(new Mammal("Lion", 14, "Roar", "Land", "Fur", "Lungs", false, false, "08:00", zookeepers.get(0)));
        animals.add(new Mammal("Tiger", 12, "Roar", "Land", "Fur", "Lungs", false, false, "09:00", zookeepers.get(0)));
        animals.add(new Mammal("Elephant", 70, "Trumpet", "Land", "Skin", "Lungs", false, false, "10:00", zookeepers.get(1)));
        animals.add(new Mammal("Giraffe", 25, "Hum", "Land", "Fur", "Lungs", false, false, "11:00", zookeepers.get(1)));
        animals.add(new Mammal("Zebra", 20, "Whinny", "Land", "Fur", "Lungs", false, false, "07:00", zookeepers.get(2)));
        animals.add(new Mammal("Panda", 20, "Bleat", "Forest", "Fur", "Lungs", false, false, "01:00", zookeepers.get(2)));
        animals.add(new Mammal("Kangaroo", 22, "Chortle", "Land", "Fur", "Lungs", false, false, "02:00", zookeepers.get(3)));
        animals.add(new Mammal("Wolf", 16, "Howl", "Land", "Fur", "Lungs", false, false, "03:00", zookeepers.get(4)));
        animals.add(new Mammal("Bear", 20, "Growl", "Land", "Fur", "Lungs", false, false, "04:00", zookeepers.get(4)));
        animals.add(new Mammal("Rhinoceros", 40, "Grunt", "Land", "Skin", "Lungs", false, false, "05:00", zookeepers.get(4)));

        // Birds
        animals.add(new Bird("Eagle", 20, "Screech", "Air", "Feathers", "Lungs", "18:00", zookeepers.get(0)));
        animals.add(new Bird("Parrot", 50, "Talk", "Air", "Feathers", "Lungs", "19:00", zookeepers.get(0)));
        animals.add(new Bird("Owl", 25, "Hoot", "Air", "Feathers", "Lungs", "20:00", zookeepers.get(1)));
        animals.add(new Bird("Penguin", 20, "Honk", "Land/Water", "Feathers", "Lungs", "21:00", zookeepers.get(1)));
        animals.add(new Bird("Flamingo", 30, "Squawk", "Land/Water", "Feathers", "Lungs", "22:00", zookeepers.get(2)));
        animals.add(new Bird("Sparrow", 3, "Chirp", "Air", "Feathers", "Lungs", "21:00", zookeepers.get(2)));
        animals.add(new Bird("Peacock", 20, "Call", "Land", "Feathers", "Lungs", "12:00", zookeepers.get(3)));
        animals.add(new Bird("Hummingbird", 5, "Chirp", "Air", "Feathers", "Lungs", "13:00", zookeepers.get(3)));
        animals.add(new Bird("Canary", 10, "Sing", "Air", "Feathers", "Lungs", "14:00", zookeepers.get(4)));
        animals.add(new Bird("Crow", 14, "Caw", "Air", "Feathers", "Lungs", "15:00", zookeepers.get(4)));

        // Fish
        animals.add(new Fish("Salmon", 5, "Blub", "Water", "Scales", "Gills", "16:00", zookeepers.get(0)));
        animals.add(new Fish("Clownfish", 10, "Silent", "Coral Reef", "Scales", "Gills", "16:30", zookeepers.get(0)));
        animals.add(new Fish("Goldfish", 10, "Silent", "Freshwater Pond", "Scales", "Gills", "17:00", zookeepers.get(1)));
        animals.add(new Fish("Shark", 30, "Silent", "Ocean", "Scales", "Gills", "17:30", zookeepers.get(1)));
        animals.add(new Fish("Tuna", 15, "Silent", "Open Sea", "Scales", "Gills", "18:00", zookeepers.get(2)));
        animals.add(new Fish("Manta Ray", 20, "Silent", "Tropical Waters", "Scales", "Gills", "18:30", zookeepers.get(2)));
        animals.add(new Fish("Swordfish", 15, "Silent", "Ocean", "Scales", "Gills", "19:00", zookeepers.get(3)));
        animals.add(new Fish("Pufferfish", 10, "Silent", "Tropical Sea", "Scales", "Gills", "19:30", zookeepers.get(3)));
        animals.add(new Fish("Catfish", 20, "Silent", "Freshwater", "Scales", "Gills", "20:00", zookeepers.get(4)));
        animals.add(new Fish("Koi", 35, "Silent", "Pond", "Scales", "Gills", "20:30", zookeepers.get(4)));

        // Reptiles
        animals.add(new Reptile("Crocodile", 70, "Growl", "Water/Land", "Scales", "Lungs", true, false, "09:00", zookeepers.get(0)));
        animals.add(new Reptile("Snake", 9, "Hiss", "Land", "Scales", "Lungs", false, false, "09:30", zookeepers.get(0)));
        animals.add(new Reptile("Turtle", 100, "Silent", "Water/Land", "Scales", "Lungs", true, false, "10:00", zookeepers.get(1)));
        animals.add(new Reptile("Lizard", 10, "Silent", "Land", "Scales", "Lungs", false, false, "10:30", zookeepers.get(1)));
        animals.add(new Reptile("Chameleon", 5, "Silent", "Trees", "Scales", "Lungs", false, false, "11:00", zookeepers.get(2)));
        animals.add(new Reptile("Iguana", 12, "Silent", "Land/Trees", "Scales", "Lungs", false, false, "11:30", zookeepers.get(2)));
        animals.add(new Reptile("Gecko", 6, "Silent", "Houses/Trees", "Scales", "Lungs", false, false, "12:00", zookeepers.get(3)));
        animals.add(new Reptile("Komodo Dragon", 30, "Hiss", "Land", "Scales", "Lungs", false, false, "13:30", zookeepers.get(3)));
        animals.add(new Reptile("Alligator", 50, "Growl", "Water/Land", "Scales", "Lungs", true, false, "13:00", zookeepers.get(4)));
        animals.add(new Reptile("Anaconda", 10, "Hiss", "Water", "Scales", "Lungs", true, false, "13:30", zookeepers.get(4)));

        // Amphibians
        animals.add(new Amphibian("Frog", 7, "Croak", "Water/Land", "Skin", "Lungs/Skin", true, false, "14:00", zookeepers.get(0)));
        animals.add(new Amphibian("Toad", 5, "Croak", "Land", "Skin", "Lungs/Skin", false, false, "14:30", zookeepers.get(0)));
        animals.add(new Amphibian("Salamander", 6, "Silent", "Water/Land", "Skin", "Lungs/Skin", true, false, "15:00", zookeepers.get(1)));
        animals.add(new Amphibian("Newt", 5, "Silent", "Water", "Skin", "Lungs/Skin", true, false, "15:30", zookeepers.get(1)));
        animals.add(new Amphibian("Axolotl", 10, "Silent", "Freshwater", "Skin", "Gills", true, false, "16:00", zookeepers.get(2)));
        animals.add(new Amphibian("Tree Frog", 5, "Croak", "Trees", "Skin", "Lungs/Skin", false, true, "16:30", zookeepers.get(3)));
        animals.add(new Amphibian("Bullfrog", 8, "Deep Croak", "Water/Land", "Skin", "Lungs/Skin", true, false, "17:00", zookeepers.get(3)));
        animals.add(new Amphibian("Red-Eyed Tree Frog", 5, "Croak", "Rainforest", "Skin", "Lungs/Skin", false, true, "17:30", zookeepers.get(3)));
        animals.add(new Amphibian("Poison Dart Frog", 7, "Silent", "Rainforest", "Skin", "Lungs/Skin", false, false, "18:00", zookeepers.get(4)));
        animals.add(new Amphibian("Common Toad", 12, "Croak", "Gardens/Forests", "Skin", "Lungs/Skin", false, false, "18:30", zookeepers.get(4)));
    }

    private static boolean findNameOrPassword(String word, boolean isPassword){
        for (Zookeeper zookeeper : zookeepers) {
            if (isPassword) {
                if (zookeeper.checkPassword(word)) {
                    return true;
                }

            } else {
                if (zookeeper.getName().equals(word)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static Zookeeper getZookeeperByName(String name){
        for (Zookeeper zookeeper : zookeepers) {
            if (zookeeper.getName().equals(name)) {
                return zookeeper;
            }
        }
        return null;
    }

    private static void logInMenu(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWelcome to AnimalLexi!");

        System.out.print("State your name.\nName: ");
        String name = scanner.nextLine();
        boolean correctName = findNameOrPassword(name, false);

        System.out.print("State your password.\nPassword: ");
        String password = scanner.nextLine();
        boolean correctPassword = findNameOrPassword(password, true);

        if (correctName && correctPassword){
            loggedInZookeeper = getZookeeperByName(name);
            myMenu();
        }
        else {
            System.out.println("Name or password is wrong, please try again."); // For security reasons it is not directly reviled what is wrong
            logInMenu(); // Recursive call
        }
    }

    private static void myMenu(){
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nType a number from 1 to 7");
            System.out.println("[1] View animals");
            System.out.println("[2] Show feeding schedule");
            System.out.println("[3] Sort animals by lifetime");
            System.out.println("[4] Show animals by category");
            System.out.println("[5] Perform animal concert");
            System.out.println("[6] Sign out");
            System.out.println("[7] Exit");
            System.out.print("Choose an option: ");

            int choice = parseIntegerInput(scanner);

            switch (choice) {
                case 1:
                    displayAnimals(animals);
                    break;
                case 2:
                    showSchedule();
                    break;
                case 3:
                    sortAnimalsByLifetime();
                    break;
                case 4:
                    animalCategoryMenu();
                    break;
                case 5:
                    performConcert();
                    break;
                case 6:
                    logInMenu();
                case 7:
                    running = false;
                    System.out.println("\nExiting AnimalLexi.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
        System.exit(0);
    }

    private static void displayAnimals(ArrayList<Animal> animals) { // Todo: print in alfabethical order
        System.out.println("\nAll Animals:"); // Todo: add an input parameter which determine what to print
        for (Animal animal : animals) {
            if (animal.getZookeeper().getName().equals(loggedInZookeeper.getName())) {
                System.out.println(animal.getName() + ", Type: " + animal.getClass().getSimpleName() + ", Habitat: "
                + animal.getHabitat() + ", Lifetime: " + animal.getLifetime() + " years, Blood-type: "
                + animal.getBloodType());
            }
        }
    }

    private static void sortAnimalsByLifetime(){
        ArrayList<Animal> lifetimeArrayList = animals;
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

    private static void showSchedule(){
        ArrayList<AnimalDateTimePair> pairs = appendTimeToToday(animals);
        sortAndPrintAnimalsByFeedingTime(pairs);
    }

    private static ArrayList<AnimalDateTimePair> appendTimeToToday(ArrayList<Animal> animals) {
        LocalDate today = LocalDate.now(); // Get today's date
        ArrayList<AnimalDateTimePair> dateTimePairs = new ArrayList<>();

        for (Animal animal : animals) {
            try {
                LocalTime localTime = LocalTime.parse(animal.getFeedingtime());
                LocalDateTime dateTime = LocalDateTime.of(today, localTime); // Combine date and time
                dateTimePairs.add(new AnimalDateTimePair(animal, dateTime));
            } catch (Exception e) {
                System.out.println("Error parsing feeding time: " + animal.getFeedingtime() + " for " + animal.getName());
            }
        }
        return dateTimePairs;
    }

    private static void sortAndPrintAnimalsByFeedingTime(ArrayList<AnimalDateTimePair> pairs) {
        // Sort pairs by LocalDateTime
        pairs.sort(Comparator.comparing(AnimalDateTimePair::getFeedingDateTime));

        System.out.println("\nFeeding schedule:");
        for (AnimalDateTimePair pair : pairs) {
            if (pair.getAnimal().getZookeeper().getName().equals(loggedInZookeeper.getName())){
                System.out.println(pair.getAnimal().getFeedingtime() + " - " + pair.getAnimal().getName());
            }
        }
    }

    private static void animalCategoryMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nType a number from 1 to 7");
        System.out.println("[1] Show warmblooded animals");
        System.out.println("[2] Show coldblooded animals");
        System.out.println("[3] Show all mammals");
        System.out.println("[4] Show all birds");
        System.out.println("[5] Show all fish");
        System.out.println("[6] Show all reptiles");
        System.out.println("[7] Show all amphibians");
        System.out.print("Choose an option: ");

        int choice = parseIntegerInput(scanner);

        switch (choice) {
            case 1 -> sortAnimalsByCategory("Warmblooded", "");
            case 2 -> sortAnimalsByCategory("Coldblooded", "");
            case 3 -> sortAnimalsByCategory("", "Mammal");
            case 4 -> sortAnimalsByCategory("", "Bird");
            case 5 -> sortAnimalsByCategory("", "Fish");
            case 6 -> sortAnimalsByCategory("", "Reptile");
            case 7 -> sortAnimalsByCategory("", "Amphibian");
        }
    }

    private static void sortAnimalsByCategory(String category1, String category2){
        ArrayList<Animal> categorizedyArrayList = new ArrayList<>();

        for (Animal animal : animals) {
            if (animal.getBloodType().equals(category1)){ // Works for both warm- and coldblooded animals
                categorizedyArrayList.add(animal);
            }
            else if (animal.isMammal() && category2.equals("Mammal")){
                categorizedyArrayList.add(animal);
            }
            else if (animal.isBird() && category2.equals("Bird")){
                categorizedyArrayList.add(animal);
            }
            else if (animal.isFish() && category2.equals("Fish")){
                categorizedyArrayList.add(animal);
            }
            else if (animal.isReptile() && category2.equals("Reptile")){
                categorizedyArrayList.add(animal);
            }
            else if (animal.isAmphibian() && category2.equals("Amphibian")){
                categorizedyArrayList.add(animal);
            }
        }
        //todo sort categorized list         pairs.sort(Comparator.comparing(AnimalDateTimePair::getFeedingDateTime));
        displayAnimals(categorizedyArrayList);
    }

    private static int parseIntegerInput(Scanner scanner){
        int choice;
        try {
            choice = scanner.nextInt();
        } catch (InputMismatchException e){
            choice = 0; // Automatically goes to default error message
        }
        scanner.nextLine(); // consume newline
        return choice;
    }
    private static void performConcert(){
        Collections.shuffle(animals); // Randomize the order of animals

        for (Animal animal : animals) {
            if (animal.getZookeeper().getName().equals(loggedInZookeeper.getName())) {
                animal.makeSound();
            }
        }
    }
}
