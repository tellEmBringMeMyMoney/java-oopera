package data.human;

import java.util.Objects;

public class Actor extends Person {
    private final int hight;

    public Actor(String firstName, String secondName, Gender gender, int hight) {
        super(firstName, secondName, gender);
        this.hight = hight;
    }

    @Override
    public String toString() {
        return super.firstName + " " + super.lastName + " (" + hight + ")";
    }
    //afterfix 1
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return Objects.equals(firstName, actor.firstName) && Objects.equals(lastName, actor.lastName)
                && gender == actor.gender;
    }

    public String getLastName() {
        return lastName;
    }
}
