package zadatak3_4_6;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Person {
    private int id;
    private String name;
    private String surname;
    private LocalDate birthday;
    private Gender gender;

    public Person(int id, String name, String surname, LocalDate birthday, Gender gender) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthday, currentDate);
        return period.getYears();
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + birthday + " " + gender + " " + getAge();
    }

    public static List<Person> loadPersons() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(1, "John", "Doe", LocalDate.of(1990, 5, 15), Gender.MALE));
        persons.add(new Person(2, "Jane", "Smith", LocalDate.of(1985, 9, 10), Gender.FEMALE));
        persons.add(new Person(3, "Michael", "Johnson", LocalDate.of(1978, 12, 3), Gender.MALE));
        persons.add(new Person(4, "Emily", "Davis", LocalDate.of(1995, 2, 28), Gender.FEMALE));
        persons.add(new Person(5, "David", "Brown", LocalDate.of(1950, 7, 20), Gender.MALE));
        return persons;
    }
}
