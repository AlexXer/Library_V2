package beans;

import beans.enm.TypeOfHuman;

/**
 * The type Human.
 */
public abstract class Human {
    private String firstName;

    private String lastName;

    private TypeOfHuman typeOfHuman;

    public Human(String firstName, String lastName, TypeOfHuman typeOfHuman) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.typeOfHuman = typeOfHuman;
    }

    public TypeOfHuman getTypeOfHuman() {
        return typeOfHuman;
    }

    public void setTypeOfHuman(TypeOfHuman typeOfHuman) {
        this.typeOfHuman = typeOfHuman;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
