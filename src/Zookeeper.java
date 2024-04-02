import java.util.ArrayList;

public class Zookeeper {
    private String name;
    private String password;

    public Zookeeper(String name, String password) {
        this.name = name;
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }
}