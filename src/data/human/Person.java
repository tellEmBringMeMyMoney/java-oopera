package data.human;

import java.util.Objects;

public class Person {
    protected final String firstName;
    protected final String lastName;
    protected final Gender gender;

    public Person(String firstName, String secondName, Gender gender) {
        this.firstName = firstName;
        this.lastName = secondName;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && gender == person.gender;
    }

    @Override
    public int hashCode() {
        int hash = 17;
        if (firstName != null){
            hash += firstName.hashCode();
        }

        hash = hash * 31;

        if (lastName != null){
            hash += lastName.hashCode();
        }
        hash += gender.hashCode();
        return hash;
    }
}
