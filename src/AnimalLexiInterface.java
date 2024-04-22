import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Collections;

// Class that represents user interface
public class AnimalLexiInterface {
    // Attributes
    private ArrayList<Animal> animals = new ArrayList<>();
    private ArrayList<Zookeeper> zookeepers = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();
    private User loggedInZookeeper;
    private User loggedInAdmin;

    // Constructor
    public AnimalLexiInterface() {
        initializeUsers();
        initializeAnimals();
        startMenu();
    }

    // Methods

    // Method that creates user objects and assort them into an arraylist
    private void initializeUsers() {
        // Admins
        users.add(new Admin("Emir", "123"));
        users.add(new Admin("Admin", "123"));

        // Zookeepers
        users.add(new Zookeeper("Adam", "123"));
        users.add(new Zookeeper("Liv", "123"));
        users.add(new Zookeeper("Yusuf", "123"));
        users.add(new Zookeeper("Lukas", "123"));
        users.add(new Zookeeper("Arda", "123"));

        setZookeepers();
    }

    // Method which assort zookeepers to an Arraylist to assign animals
    private void setZookeepers() {
        for (User user : users) {
            if (!user.isAdmin()) { // Not admin is by definition zookeeper
                zookeepers.add((Zookeeper) user); // Typecast user to zookeeper
            }
        }
    }

    // Method that creates animals objects and assort them into an arraylist
    private void initializeAnimals() {
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

    // Function that finds either name or password for a user, compares it and returns if it's true or not
    private boolean findNameOrPassword(String word, boolean isPassword) {
        for (User user : users) {
            if (isPassword) {
                if (user.checkPassword(word)) {
                    return true;
                }
            } else {
                if (user.getName().equals(word)) {
                    return true;
                }
            }
        }
        return false;
    }

    // Function that returns user object by comparing the name
    private User getUserByName(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    // Function that returns animal object by comparing the name
    private Animal getAnimalByName(String name) {
        for (Animal animal : animals) {
            if (animal.getZookeeper().getName().equals(loggedInZookeeper.getName())) {
                if (animal.getName().equals(name)) {
                    return animal;
                }
            }
        }
        return null;
    }

    // Method that represents the start interface that the user will interact with
    private void startMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nType a number from 1 to 2");
            System.out.println("[1] Log in");
            System.out.println("[2] Exit");
            System.out.print("Choose an option: ");

            int choice = parseIntegerInput(scanner);

            switch (choice) {
                case 1 -> logInMenu();
                case 2 -> {
                    running = false;
                    System.out.println("\nExiting AnimalLexi.");
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Method used for user to log in
    private void logInMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWelcome to AnimalLexi!");

        System.out.print("State your name.\nName: ");
        String name = scanner.nextLine();
        boolean correctName = findNameOrPassword(name, false);

        System.out.print("State your password.\nPassword: ");
        String password = scanner.nextLine();
        boolean correctPassword = findNameOrPassword(password, true);

        if (correctName && correctPassword) {
            User user = getUserByName(name);

            if (user.isAdmin()) {
                loggedInAdmin = user;
                adminMainMenu();
            } else {
                loggedInZookeeper = user;
                zookeeperMainMenu();
            }
        } else {
            System.out.println("Name or password is wrong, please try again."); // For security reasons it is not directly reviled what is wrong
            logInMenu(); // Recursive call
        }
    }

    // Method that represents a menu used by admins to change feeding time for animals
    private void adminMainMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nType a number from 1 to 3");
            System.out.println("[1] View zookeepers");
            System.out.println("[2] Sign out");
            System.out.println("[3] Exit");
            System.out.print("Choose an option: ");

            int choice = parseIntegerInput(scanner);

            switch (choice) {
                case 1 -> adminSubMenu();
                case 2 -> startMenu();
                case 3 -> {
                    running = false;
                    System.out.println("\nExiting AnimalLexi.");
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
        System.exit(0);
    }

    // Method that represents a menu used by zookeepers to interact with their animals
    private void zookeeperMainMenu() {
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
                    displayAnimals(animals, "All Animals:");
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
                    startMenu();
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

    // Method that represents a sub-menu used by admin to change feeding time for animals
    private void adminSubMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nSelect an zookeeper by typing the name.");
        for (Zookeeper zookeeper : zookeepers) {
            System.out.println(zookeeper.getName());
        }

        System.out.print("Name: ");
        String selectedZookeeper = scanner.nextLine();

        loggedInZookeeper = getUserByName(selectedZookeeper); // Admin "logs in" as zookeeper
        if (loggedInZookeeper == null) { // Could not find zookeeper
            adminSubMenu();
        } else {
            selectAnimal().setFeedingtime(getNewFeedingtime(scanner)); // Changes an animals feeding time
            showSchedule();
        }
    }

    // Function that returns an animal based on user input
    private Animal selectAnimal() {
        Scanner scanner = new Scanner(System.in);

        showSchedule();
        System.out.println("Select an animal's feeding time by typing the name.");
        System.out.print("Name: ");
        String animalName = scanner.nextLine();
        Animal selectedAnimal = getAnimalByName(animalName);

        if (selectedAnimal == null) {
            selectAnimal(); // Recursive call if animal is not found
        }
        return selectedAnimal;
    }

    // Functions that returns time in string format "HH:MM"
    private String getNewFeedingtime(Scanner scanner) {
        String hourString;
        String minuteString;

        try {
            // Validates feeding time in hours
            System.out.print("Type in the hour 0 - 23 in which the animal will be fed.\nHour: ");
            int hour = scanner.nextInt();
            hourString = verifyHourOrMinute(hour, true);
            if (hourString == null) {
                System.out.println("Invalid input for hour.");
                return getNewFeedingtime(scanner); // Recursive call if wrong input for hour
            }

            // Validates feeding time in minutes
            System.out.print("Type in the minute 0 - 59 in which the animal will be fed.\nMinute: ");
            int minute = scanner.nextInt();
            minuteString = verifyHourOrMinute(minute, false);
            if (minuteString == null) {
                System.out.println("Invalid input for minute.");
                return getNewFeedingtime(scanner); // Recursive call if wrong input for minute
            }
        } catch (InputMismatchException e) {
            System.out.println("Only numbers are allowed.");
            return getNewFeedingtime(scanner); // Recursive call if not numbers are provided
        }
        return hourString + ":" + minuteString;
    }

    // Function that validates hours between 0 - 23 or minutes between 0 - 59 and returns time as a string
    private String verifyHourOrMinute(int time, boolean isHour) {
        String timeString = Integer.toString(time);

        if (time < 0 || (isHour && time > 23) || (!isHour && time > 59)) { // Checks if hours or minutes is valid
            return null;
        }
        if (time < 10) {
            timeString = "0" + timeString; // Makes sure that format is HH or MM
        }
        return timeString;
    }

    // Generic function for displaying animals assigned to a specific zookeeper
    private void displayAnimals(ArrayList<Animal> animals, String headLine) {
        System.out.println("\n" + headLine);
        for (Animal animal : animals) {
            if (animal.getZookeeper().getName().equals(loggedInZookeeper.getName())) {
                System.out.println(animal.getName() + ", Type: " + animal.getClass().getSimpleName() + ", Habitat: "
                        + animal.getHabitat() + ", Lifetime: " + animal.getLifetime() + " years, Blood-type: "
                        + animal.getBloodType() + ", Swimmer: " + animal.canSwim() + ", Flyer: " + animal.canFly()
                        + ", Skin: " + animal.getSkin() + ", Breathing: " + animal.getBreathing());
            }
        }
    }

    // Method for sorting animals by lifetime lowest to highest
    private void sortAnimalsByLifetime() {
        ArrayList<Animal> lifetimeArrayList = animals;
        int n = lifetimeArrayList.size(); // n is length of arraylist

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (lifetimeArrayList.get(j).getLifetime() > lifetimeArrayList.get(j + 1).getLifetime()) {
                    Animal temporaryAnimal = lifetimeArrayList.get(j); // Holds an animal temporary
                    lifetimeArrayList.set(j, lifetimeArrayList.get(j + 1));
                    lifetimeArrayList.set(j + 1, temporaryAnimal);
                }
            }
        }
        displayAnimals(lifetimeArrayList, "Lifetime lowest to oldest:");
    }

    // Method that presents feeding time for zookeeper
    private void showSchedule() {
        ArrayList<AnimalDateTimePair> pairs = appendTimeToToday(animals);
        sortAndPrintAnimalsByFeedingtime(pairs);
    }

    // Function that returns list with pairs of animal and their local feeding time
    private ArrayList<AnimalDateTimePair> appendTimeToToday(ArrayList<Animal> animals) {
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

    // Method that presents sorted feeding times
    private void sortAndPrintAnimalsByFeedingtime(ArrayList<AnimalDateTimePair> pairs) {
        // Sort pairs by LocalDateTime
        pairs.sort(Comparator.comparing(AnimalDateTimePair::getFeedingDateTime));

        System.out.println("\nFeeding schedule:");
        for (AnimalDateTimePair pair : pairs) {
            if (pair.getAnimal().getZookeeper().getName().equals(loggedInZookeeper.getName())) {
                System.out.println(pair.getAnimal().getFeedingtime() + " - " + pair.getAnimal().getName());
            }
        }
    }

    // Method which sorts a zookeepers animals by category
    private void animalCategoryMenu() {
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

    // Method that sort animals based on blood type or type of animal
    private void sortAnimalsByCategory(String bloodType, String typeOfAnimal) {
        ArrayList<Animal> categorizedArrayList = new ArrayList<>();

        for (Animal animal : animals) {
            if (animal.getBloodType().equals(bloodType)) { // Works for both warm- and coldblooded animals
                categorizedArrayList.add(animal);
            } else if (animal.isMammal() && typeOfAnimal.equals("Mammal")) {
                categorizedArrayList.add(animal);
            } else if (animal.isBird() && typeOfAnimal.equals("Bird")) {
                categorizedArrayList.add(animal);
            } else if (animal.isFish() && typeOfAnimal.equals("Fish")) {
                categorizedArrayList.add(animal);
            } else if (animal.isReptile() && typeOfAnimal.equals("Reptile")) {
                categorizedArrayList.add(animal);
            } else if (animal.isAmphibian() && typeOfAnimal.equals("Amphibian")) {
                categorizedArrayList.add(animal);
            }
        }
        displayAnimals(categorizedArrayList, "By category:");
    }

    // Generic function for parsing integers provided by users
    private int parseIntegerInput(Scanner scanner) {
        int choice;

        try {
            choice = scanner.nextInt();
        } catch (InputMismatchException e) {
            choice = 0; // Automatically goes to default error message
        }

        scanner.nextLine(); // consume newline
        return choice;
    }

    // Method for text representation of random animal sounds
    private void performConcert() {
        Collections.shuffle(animals); // Randomize the order of animals

        for (Animal animal : animals) {
            if (animal.getZookeeper().getName().equals(loggedInZookeeper.getName())) {
                animal.makeSound();
            }
        }
    }
}