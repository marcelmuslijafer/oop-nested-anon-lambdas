package zadatak3_4_6.zadatak6;

import zadatak3_4_6.Person;

import java.util.*;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = Person.loadPersons();

        // Convert Iterable<Person> to Map<Integer, String>
        Map<Integer, String> idNameMap = convertIterablePersonsToMap(persons);
        System.out.println("Converted Iterable<Person> to Map<Integer, String>:");
        System.out.println(idNameMap);
        System.out.println();

        // Convert Iterable<Person> to Map<Integer, String> using generic method
        Map<Integer, String> idFullNameMap = convertIterableToMap(persons, Person::getId, person -> person.getName() + " " + person.getSurname());
        System.out.println("Converted Iterable<Person> to Map<Integer, String> using generic method:");
        System.out.println(idFullNameMap);
        System.out.println();

        // Demonstrate usage of default methods
        List<Person> personList = new ArrayList<>(persons);

        System.out.println("Sorting persons by name:");
        personList.sort(Comparator.comparing(Person::getName));
        System.out.println(personList);
        System.out.println();

        System.out.println("Removing persons with surname 'Smith':");
        personList.removeIf(person -> person.getSurname().equals("Smith"));
        System.out.println(personList);
        System.out.println();

        System.out.println("Iterating over the remaining persons:");
        personList.forEach(person -> System.out.println(person.getName()));
    }

    public static Map<Integer, String> convertIterablePersonsToMap(Iterable<? extends Person> persons) {
        Map<Integer, String> map = new HashMap<>();
        for (Person person : persons) {
            String fullName = person.getName() + " " + person.getSurname();
            map.put(person.getId(), fullName);
        }
        return map;
    }

    public static <K, V, E> Map<K, V> convertIterableToMap(Iterable<? extends E> elements,
                                                           Function<E, K> keyFunction, Function<E, V> valueFunction) {
        Map<K, V> map = new HashMap<>();
        for (E element : elements) {
            K key = keyFunction.apply(element);
            V value = valueFunction.apply(element);
            map.put(key, value);
        }
        return map;
    }
}