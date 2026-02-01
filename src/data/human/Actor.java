package data.human;

public class Actor extends Person {
    private int hight;

    public Actor(String firstName, String secondName, Gender gender, int hight) {
        super(firstName, secondName, gender);
        this.hight = hight;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + hight + ")";
    }
}
