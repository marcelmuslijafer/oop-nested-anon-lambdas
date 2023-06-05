package zadatak1;

public class ImmutableContainer {
    private Integer[] numbers;

    public ImmutableContainer (Integer... num) {
        numbers = new Integer[num.length];
        for(int i = 0; i < num.length; i++) {
            numbers[i] = num[i];
        }
    }
}
