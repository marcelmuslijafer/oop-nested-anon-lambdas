package zadatak3_4_6.zadatak4;

import zadatak3_4_6.Person;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = Person.loadPersons();

        PersonDataFormatter formatter = new AllDataFormatter();
        PersonDataFormatter.printAll(persons, formatter);

        System.out.println();
        PersonDataFormatter.printAll(persons, Person::toString);

        System.out.println();
        PersonDataFormatter.printAll(persons, new PersonDataFormatter() {
            @Override
            public String format(Person p) {
                return p.getName() + " " + p.getBirthday() + " " + p.getAge();
            }
        });

        System.out.println();
        PersonDataFormatter.printAll(persons, p -> {
            if (p.getAge() < 55) {
                return p.toString();
            }
            return "";
        });

    }
}
