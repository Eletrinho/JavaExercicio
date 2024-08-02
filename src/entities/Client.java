package entities;

import java.time.LocalDate;

public class Client {
    private String name;
    private String email;
    private final LocalDate birthDate;

    public Client(LocalDate birthDate, String email, String name) {
        this.birthDate = birthDate;
        this.email = email;
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
