package zadatak3_4_6.zadatak4;

import zadatak3_4_6.Person;

public class AllDataFormatter implements PersonDataFormatter {
    @Override
    public String format(Person p) {
        return p.toString();
    }
}
