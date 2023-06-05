package zadatak1.b;

import java.util.Iterator;

public class ImmutableContainerB implements Iterable<Integer> {
    private Integer[] numbers;

    public ImmutableContainerB(Integer... num) {
        numbers = new Integer[num.length];
        for (int i = 0; i < num.length; i++)
            numbers[i] = num[i];
    }

    @Override
    public Iterator<Integer> iterator() {
        return new ClassicIterator();
    }

    private class ClassicIterator implements Iterator<Integer> {
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
}
