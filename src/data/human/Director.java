package data.human;

public class Director extends  Person{

    private final int numberOfShows;
    private final String role;

    public Director(String firstName, String secondName, Gender gender, int numberOfShows, String role) {
        super(firstName, secondName, gender);
        this.numberOfShows = numberOfShows;
        this.role = role;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
