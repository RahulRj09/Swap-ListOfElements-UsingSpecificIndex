package number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwapNumber {
    private static <T> List<T> swap(List<T> elements, int a, int b) {
        List<T> copyElements = new ArrayList<>(elements);
        T indexValue = copyElements.get(b);
        copyElements.set(b, copyElements.get(a));
        copyElements.set(a, indexValue);
        return copyElements;
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("rahul","pankaj","aman","mohit","nitesh");
        List<Integer> numbers = Arrays.asList(12, 34, 56, 23, 78, 20, 45, 99);
        System.out.println(swap(names,0,2));
        System.out.println(swap(numbers, 0, 2));

    }
}
