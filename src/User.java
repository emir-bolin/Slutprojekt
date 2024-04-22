// Superclass which represents the user
public abstract class User {
    // Attributes
    private String name;
    private String password;

    // Constructor
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    // Methods
    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    // Getters
    public Boolean isAdmin() {
        return false;
    }

    public String getName() {
        return name;
    }
}