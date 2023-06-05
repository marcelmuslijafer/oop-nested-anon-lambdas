package zadatak3_4_6.zadatak3;

import zadatak3_4_6.Person;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = Person.loadPersons();

        printAllPersons(persons);
        System.out.println();

        printNameSurnameAndAge(persons);
        System.out.println();

        printConditional(persons);
    }

    public static void printAllPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    public static void printNameSurnameAndAge(List<Person> persons) {
        for (Person person : persons) {
            System.out.println(person.getName() + " " + person.getSurname() + " " + person.getAge());
        }
    }

    public static void printConditional(List<Person> persons) {
        for (Person person : persons) {
            if (person.getAge() < 55) {
                System.out.println(person.getName() + " " + person.getGender() + " " + person.getAge());
            }
        }
    }
}
