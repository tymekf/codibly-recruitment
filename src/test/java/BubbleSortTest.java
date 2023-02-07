import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class BubbleSortTest {

    @Test
    public void sortTestWithIntegersAsAnInput() {
        var bubbleSort = new BubbleSort();
        List<Comparable> input = Arrays.asList(1, 4, 5, 6, 8, 3, 8);
        List<Comparable> expectedResult = Arrays.asList(1, 3, 4, 5, 6, 8, 8);
        List<Comparable> result = bubbleSort.sort(input);
        Assert.assertEquals(result, expectedResult);
    }

    @Test
    public void sortTestWithDoubles() {
        var bubbleSort = new BubbleSort();
        List<Comparable> input = Arrays.asList(-9.3, 0.2, 4, 0.1, 5, 9);
        List<Comparable> expectedResult = Arrays.asList(-9.3,0.1,0.2,4,5,9);
        List<Comparable> result = bubbleSort.sort(input);
        Assert.assertEquals(expectedResult, result);
    }


    @Test
    public void sortTestForAListContainingANull() {
        var bubbleSort = new BubbleSort();
        List<Comparable> input = Arrays.asList(null, 5.0001);
        List<Comparable> expectedResult = List.of(5.0001);
        List<Comparable> result = bubbleSort.sort(input);
        Assert.assertEquals(expectedResult, result);
    }

    @Test (expected = RuntimeException.class)
    public void sortTestForANull() {
        var bubbleSort = new BubbleSort();
        List<Comparable> input = null;
        bubbleSort.sort(input);
    }

}