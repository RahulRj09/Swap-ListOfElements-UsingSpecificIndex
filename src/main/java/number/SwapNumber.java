package number;

import java.util.Arrays;
import java.util.List;

public class SwapNumber {
    private static List<Integer> swapList(List<Integer> numbers, int a, int b) {
        int indexValue = numbers.get(b);
        numbers.set(b, numbers.get(a));
        numbers.set(a, indexValue);
        return numbers;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 34, 56, 23, 78, 20, 45, 99);
        int a = 2;
        int b = 0;
        System.out.println(swapList(numbers, a, b));
    }

}
