package zadatak1.c;

import java.util.Iterator;

public class ImmutableContainerC implements Iterable<Integer> {
    private Integer[] numbers;

    public ImmutableContainerC(Integer... num) {
        numbers = new Integer[num.length];
        for (int i = 0; i < num.length; i++)
            numbers[i] = num[i];
    }

    @Override
    public Iterator<Integer> iterator() {
        class ClassicIterator implements Iterator<Integer> {
            private int currentIndex;

            public ClassicIterator() {
                currentIndex = 0;
            }

            @Override
            public boolean hasNext() {
                return currentIndex < numbers.length;
            }

            @Override
            public Integer next() {
                Integer current = numbers[currentIndex];
                currentIndex++;
                return current;
            }
        }

        return new ClassicIterator();
    }
}
