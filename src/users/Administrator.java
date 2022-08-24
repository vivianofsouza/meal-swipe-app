package users;

import java.util.UUID;

public class Administrator {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private UUID administrator;

    public Administrator() {

    }

    public Administrator(String firstName, String lastName) {

    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Object getID() {
        return null;
    }
}
