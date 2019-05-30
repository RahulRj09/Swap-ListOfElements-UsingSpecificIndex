package numbers;

import java.util.Arrays;
import java.util.List;

public class SwapNumber {
    public static List<Integer> swapList(List<Integer> numbers, int a, int b) {
        int index1Value = numbers.get(a);
        int index2Value = numbers.get(b);
        numbers.set(a,index2Value);
        numbers.set(b,index1Value);
        return numbers;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 34, 56, 23, 78);
        int a = 2;
        int b = 0;
        System.out.println(swapList(numbers, a, b));
    }

}
