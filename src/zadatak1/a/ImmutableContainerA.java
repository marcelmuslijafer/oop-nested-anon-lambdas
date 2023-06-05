package zadatak1.a;

import java.util.Iterator;

public class ImmutableContainerA implements Iterable<Integer> {
    private Integer[] numbers;

    public ImmutableContainerA(Integer... num) {
        numbers = new Integer[num.length];
        for (int i = 0; i < num.length; i++)
            numbers[i] = num[i];
    }

    @Override
    public Iterator<Integer> iterator() {
        return new ReverseSkipIterator(numbers);
    }

    private static class ReverseSkipIterator implements Iterator<Integer> {
        private Integer[] numbers;
        private int currentIndex;

        public ReverseSkipIterator(Integer[] numbers) {
            this.numbers = numbers;
            currentIndex = numbers.length - 1;
        }

        @Override
        public boolean hasNext() {
            return currentIndex >= 0;
        }

        @Override
        public Integer next() {
            Integer current = numbers[currentIndex];
            currentIndex -= 2;
            return current;
        }
    }
}
