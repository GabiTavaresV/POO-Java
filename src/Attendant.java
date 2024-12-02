
public class Attendant extends User {
    private final String id;

    public Attendant( String username, String email) {
        super(username, email);
        this.id = getUsername();
    }

    public String getName() {
        return getUsername();
    }

    @Override
    public String toString() {
        return "Attendant{" +
                "id=" + IDGenerator.generateId() +
                ", nameUser='" + getUsername() + '\'' +
                ", registrationNumber='" + getRegistration() + '\'' +
                '}';
    }
}
