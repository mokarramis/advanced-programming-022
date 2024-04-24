import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class User {

    // developed by Alireza Sobhdoost

    String firstName;
    String lastName;
    private String password;
    private int UserNumber;
    private List<User> users = new ArrayList<>();

    public User(String firstName, String lastName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.UserNumber = generateUserNumber();
        users.add(this);
        
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public List<User> getUsers() {
        return users ;
    }
    public String fullName() {
        return this.firstName + " " + this.lastName;
    }

    @Override
    public String toString() {
        return fullName();
    }

    public static int generateUserNumber() {
        Random random = new Random();
        return 100 + random.nextInt(900); // Generates a random number between 100 and 999
    }
}