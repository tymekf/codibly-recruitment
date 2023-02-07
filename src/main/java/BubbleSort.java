import java.util.*;
import java.util.stream.Collectors;

public class BubbleSort {

    public List<Comparable> sort(List<Comparable> input) {
        boolean sorted = false;

        if (input == null) {
            throw new RuntimeException();
        }

        var nonNullList = filterOffNullValues(input);

        nonNullList = compareUnifiedAndSwap(nonNullList, sorted);

        return nonNullList;
    }

    public Double unifyType(Comparable input) {
        if (input instanceof Integer) {
            return Double.valueOf((Integer) input);
        } else {
            return (Double) input;
        }
    }

    public List<Comparable> filterOffNullValues(List<Comparable> input) {
        return input.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

    public List<Comparable> compareUnifiedAndSwap (List<Comparable> nonNullList, boolean sorted) {
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < nonNullList.size() - 1; i++) {
                Double aDouble = unifyType(nonNullList.get(i));
                Double anotherDouble = unifyType(nonNullList.get(i + 1));
                if (aDouble.compareTo(anotherDouble) > 0) {
                    var temp = nonNullList.get(i);
                    nonNullList.set(i, nonNullList.get(i + 1));
                    nonNullList.set(i + 1, temp);
                    sorted = false;
                }
            }
        }
        return nonNullList;
    }

}