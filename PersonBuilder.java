package Person;


import java.util.OptionalInt;

public class PersonBuilder {
    String name;
    String surname;
    OptionalInt age;
    String address;


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(OptionalInt age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {

        Person person = new Person(this);
        if(this.name == null | this.surname == null) {
            throw new IllegalArgumentException("Отсутствует имя или фамилия!");
        } else
        if(this.age.getAsInt() < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным!");
        }
        return person;
    }
}
