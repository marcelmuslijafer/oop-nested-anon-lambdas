package zadatak1.d;

import java.util.Iterator;

public class ImmutableContainerD implements Iterable<Integer> {
    private Integer[] numbers;

    public ImmutableContainerD(Integer... num) {
        numbers = new Integer[num.length];
        for (int i = 0; i < num.length; i++)
            numbers[i] = num[i];
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int currentIndex = numbers.length - 1;

            @Override
            public boolean hasNext() {
                return currentIndex >= 0;
            }

            @Override
            public Integer next() {
                Integer current = numbers[currentIndex];
                currentIndex--;
                return current;
            }
        };
    }
}
