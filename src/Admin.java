// Subclass of User
public class Admin extends User {
    // Attributes
    private String name;
    private String password;

    // Constructor
    public Admin(String name, String password) {
        super(name, password);
    }

    // Getters
    public Boolean isAdmin() {
        return true;
    }
}