package number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwapNumber {
    private static List<Integer> swapNumber(List<Integer> numbers, int a, int b) {
        List<Integer> copyNumbers = new ArrayList<>(numbers);
        int indexValue = copyNumbers.get(b);
        copyNumbers.set(b, copyNumbers.get(a));
        copyNumbers.set(a, indexValue);
        return copyNumbers;
    }
     private static List<String> swapString(List<String> names, int a, int b) {
        List<String> copyName = new ArrayList<>(names);
        String indexValue = copyName.get(b);
        names.set(b, copyName.get(a));
        names.set(a, indexValue);
        return copyName;
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("rahul","pankaj","aman","mohit","nitesh");
        List<Integer> numbers = Arrays.asList(12, 34, 56, 23, 78, 20, 45, 99);
        System.out.println(swapString(names,0,2));
        System.out.println(swapNumber(numbers, 0, 2));

    }
}
