import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedWordsCounterTest {

    @Test
    public void countTestForAProperString() {
        var balancedWordsCounter = new BalancedWordsCounter();
        String input = "aabbabcccba";
        int expectedResult = 28;
        int result = balancedWordsCounter.count(input);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void countTestForAnEmptyString() {
        var balancedWordsCounter = new BalancedWordsCounter();
        String input = "";
        int expectedResult = 0;
        int result = balancedWordsCounter.count(input);
        Assert.assertEquals(expectedResult, result);
    }

    @Test (expected = RuntimeException.class)
    public void countTestForAnInvalidString() {
        var balancedWordsCounter = new BalancedWordsCounter();
        String input = "abababa1";
        balancedWordsCounter.count(input);
    }

    @Test (expected = RuntimeException.class)
    public void countTestForANull() {
        var balancedWordsCounter = new BalancedWordsCounter();
        String input = null;
        balancedWordsCounter.count(input);
    }
}