import java.util.Random;

public class User {
    private String username;
    private String email;
    private String registration;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.registration = generateRegistration();
    }

    private String generateRegistration() {
        Random rand = new Random();
        int randomNumbers = rand.nextInt(10000);
        return String.format("BR%04d", randomNumbers);
    }

    public String getRegistration() {
        return registration;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", registration='" + registration + '\'' +
                '}';
    }
}


