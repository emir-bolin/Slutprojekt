// Subclass of User
public class Admin extends User {
    // Constructor
    public Admin(String name, String password) {
        super(name, password);
    }

    // Getters
    public Boolean isAdmin() {
        return true;
    }
}