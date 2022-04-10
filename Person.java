package Person;


import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected OptionalInt age;
    protected String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.age = null;
        this.address = null;

    }

    public Person(String name, String surname, OptionalInt age) {
        this.name = name;
        this.surname = surname;
        this.age = OptionalInt.of(age.getAsInt());
        this.address = null;
    }

    public Person(PersonBuilder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.age = builder.age;
        this.address = builder.address;
    }

    public PersonBuilder newChildBuilder(){
        PersonBuilder newChild = new PersonBuilder();
        newChild.setSurname(surname);
        newChild.setAge(age);
        newChild.setAddress(address);
        return newChild;
    }

    public boolean hasAge(){
        if (age.isPresent()) {
            return true;
        }else return false;

    }

    public boolean hasAddress() {
        if (address != null) {
            return  true;
        }else return false;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person: " +
                "\n name: " + name +
                "\n surname: " + surname +
                "\n age: " + age +
                "\n address: " + address;
    }

}
