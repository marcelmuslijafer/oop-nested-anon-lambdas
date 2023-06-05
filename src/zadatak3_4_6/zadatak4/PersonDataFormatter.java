package zadatak3_4_6.zadatak4;

import zadatak3_4_6.Person;

public interface PersonDataFormatter {

    String format(Person p);

    default void print(Person p) {
        System.out.println(format(p));
    }

    static void printAll(Iterable<Person> persons, PersonDataFormatter formatter) {
        for (Person person : persons) {
            formatter.print(person);
        }
    }
}
